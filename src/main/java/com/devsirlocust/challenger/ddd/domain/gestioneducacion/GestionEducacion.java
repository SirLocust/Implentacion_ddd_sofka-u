package com.devsirlocust.challenger.ddd.domain.gestioneducacion;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import co.com.sofka.domain.generic.DomainEvent;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.event.*;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.entity.Educacion;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id.EducacionId;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id.GestionEducacionId;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.*;


import co.com.sofka.domain.generic.AggregateEvent;
import com.devsirlocust.challenger.ddd.domain.hojadevida.values.id.HojaDeVidaId;


public class GestionEducacion extends AggregateEvent<GestionEducacionId> {

    protected HojaDeVidaId hojaDeVidaId;
    protected List<Educacion> educaciones;



    
    public GestionEducacion(GestionEducacionId entityId, Periodo namePost) {
        super(entityId);

        appendChange(new GestionEducacionCreada()).apply();
    }

    private GestionEducacion(GestionEducacionId entityId){
        super(entityId);
        subscribe(new GestionEducacionChange(this));
    }

    public static GestionEducacion from(GestionEducacionId gestionEducacionId, List<DomainEvent> events){
        var experiencia = new GestionEducacion(gestionEducacionId);
        events.forEach(experiencia::applyEvent);
        return experiencia;
    }



    public void agregarNuevaEducacion(EducacionId entityId, Tipo tipo, Institucion institucion, Periodo periodo ,Estudio estudio){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(tipo);
        Objects.requireNonNull(institucion);
        Objects.requireNonNull(periodo);
        Objects.requireNonNull(estudio);
        appendChange(new EducacionAgregada(entityId, tipo, institucion, periodo, estudio)).apply();
    }

    public void modificarInstitucionEducacion(EducacionId entityId,  Institucion institucion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(institucion);

        appendChange(new InstitucionEducacionModificada(entityId, institucion )).apply();
    }

    public void actualizarPeriodoEducacion(EducacionId entityId, Periodo periodo){
        Objects.requireNonNull(entityId);

        Objects.requireNonNull(periodo);
        appendChange(new PeriodoEducacionModificado(entityId,periodo)).apply();
    }
    public void modificarTipoEducacion(EducacionId entityId, Tipo tipo){
        Objects.requireNonNull(entityId);

        Objects.requireNonNull(tipo);
        appendChange(new TipoEducacionModificado(entityId, tipo)).apply();
    }
    public void modificarEstudioEducacion(EducacionId entityId, Estudio estudio){
        Objects.requireNonNull(entityId);

        Objects.requireNonNull(estudio);
        appendChange(new EstudioEducacionModificado(entityId, estudio)).apply();
    }


    public void eliminarEducacion(EducacionId entityId){
        Objects.requireNonNull(entityId);
        appendChange(new EducacionEliminada(entityId)).apply();
    }


    public Optional<Educacion> obtenerEmpleadoPorId(EducacionId educacionId) {

        return educaciones().stream()
                .filter(experianciaLaboral -> experianciaLaboral.identity().equals(educacionId))
                .findFirst();
    }

    public List<Educacion> educaciones(){
        return  this.educaciones;
    }





    
}
