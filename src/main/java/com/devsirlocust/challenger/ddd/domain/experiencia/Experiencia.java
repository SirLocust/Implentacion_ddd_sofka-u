package com.devsirlocust.challenger.ddd.domain.experiencia;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import co.com.sofka.domain.generic.DomainEvent;
import com.devsirlocust.challenger.ddd.domain.experiencia.event.*;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.entity.ExperienciaLaboral;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.id.ExperienciaLaboralId;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.id.ExperienciaId;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.object.*;


import co.com.sofka.domain.generic.AggregateEvent;
import com.devsirlocust.challenger.ddd.domain.hojadevida.values.id.HojaDeVidaId;


public class Experiencia extends AggregateEvent<ExperienciaId> {

    protected HojaDeVidaId hojaDeVidaId;

    protected List<ExperienciaLaboral> experienciasLaborales;



    
    public Experiencia(ExperienciaId entityId, Periodo namePost) {
        super(entityId);

        appendChange(new ExperienciaCreada()).apply();
    }

    private Experiencia(ExperienciaId entityId){
        super(entityId);
        subscribe(new ExperienciaChange(this));
    }

    public static Experiencia from(ExperienciaId experienciaId, List<DomainEvent> events){
        var experiencia = new Experiencia(experienciaId);
        events.forEach(experiencia::applyEvent);
        return experiencia;
    }



    public void agregarExperienciaLaboral(ExperienciaLaboralId entityId,  ConocimientosAdquiridos conocimientosAdquiridos, Institucion institucion, Periodo periodo){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(conocimientosAdquiridos);
        Objects.requireNonNull(institucion);
        Objects.requireNonNull(periodo);
        appendChange(new ExperienciaLaboralAgregada(entityId, conocimientosAdquiridos, institucion, periodo)).apply();
    }

    public void modificarExperienciaLaboralEntidad(ExperienciaLaboralId entityId,  ConocimientosAdquiridos conocimientosAdquiridos, Institucion institucion, Periodo periodo){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(conocimientosAdquiridos);
        Objects.requireNonNull(institucion);
        Objects.requireNonNull(periodo);
        appendChange(new EntindadExperienciaLaboralModificado(entityId, conocimientosAdquiridos, institucion, periodo)).apply();
    }

    public void modificarExperienciaLaboralPeriodo(ExperienciaLaboralId entityId, Periodo periodo){
        Objects.requireNonNull(entityId);

        Objects.requireNonNull(periodo);
        appendChange(new PeriodoExperienciaLaboralModificado(entityId,periodo)).apply();
    }
    public void modificarExperienciaLaboralCononocimientosAdquiridos(ExperienciaLaboralId entityId, ConocimientosAdquiridos conocimientosAdquiridos){
        Objects.requireNonNull(entityId);

        Objects.requireNonNull(conocimientosAdquiridos);
        appendChange(new ConocimientosAdquiridosExperienciaLaboralModificado(entityId,conocimientosAdquiridos)).apply();
    }


    public void eliminarExperienciaLaboral(ExperienciaLaboralId entityId){
        Objects.requireNonNull(entityId);
        appendChange(new ExperienciaLaboralEliminada(entityId)).apply();
    }


    public Optional<ExperienciaLaboral> obtenerEmpleadoPorId(ExperienciaLaboralId experienciaLaboralId) {

        return experienciasLaborales().stream()
                .filter(experianciaLaboral -> experianciaLaboral.identity().equals(experienciaLaboralId))
                .findFirst();
    }

    public List<ExperienciaLaboral> experienciasLaborales(){
        return  this.experienciasLaborales;
    }



    
}
