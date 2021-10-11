package com.devsirlocust.challenger.ddd.domain.experiencia.values.entity;

import co.com.sofka.domain.generic.Entity;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.id.ExperienciaLaboralId;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.object.ConocimientosAdquiridos;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.object.Institucion;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.object.Periodo;

import java.util.Objects;

public class ExperienciaLaboral extends Entity<ExperienciaLaboralId> {



    private ConocimientosAdquiridos conocimientosAdquiridos;
    private Institucion institucion;
    private Periodo periodo;

    public ExperienciaLaboral(ExperienciaLaboralId entityId, ConocimientosAdquiridos conocimientosAdquiridos, Institucion institucion , Periodo periodo) {
        super(entityId);

        this.conocimientosAdquiridos = conocimientosAdquiridos;
        this.institucion = institucion;
        this.periodo = periodo;
    }



    public void upgradeConocimientosAdquiridos(ConocimientosAdquiridos conocimientosAdquiridos){
        this.conocimientosAdquiridos = Objects.requireNonNull(conocimientosAdquiridos);
    }



    public ConocimientosAdquiridos estudio(){
        return this.conocimientosAdquiridos;
    }

    public void upgradeInstitucion(Institucion institucion){
        this.institucion = Objects.requireNonNull(institucion);
    }

    public void upgradePeriodo(Periodo periodo){
        this.periodo = Objects.requireNonNull(periodo);
    }

    public Institucion institucion(){
        return this.institucion;
    }

    public Periodo periodo(){
        return this.periodo;
    }



}
