package com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.entity;

import co.com.sofka.domain.generic.Entity;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id.EducacionId;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Estudio;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Tipo;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Institucion;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Periodo;

import java.util.Objects;

public class Educacion extends Entity<EducacionId> {



    private Tipo tipo;
    private Institucion institucion;
    private Periodo periodo;
    private Estudio estudio;

    public Educacion(EducacionId entityId, Tipo tipo, Institucion institucion , Periodo periodo, Estudio estudio) {
        super(entityId);

        this.tipo = tipo;
        this.institucion = institucion;
        this.periodo = periodo;
        this.estudio = estudio;
    }



    public void upgradeTipo(Tipo tipo){
        this.tipo = Objects.requireNonNull(tipo);
    }



    public Tipo tipo(){
        return this.tipo;
    }

    public void upgradeEstudio(Estudio estudio){
        this.estudio = Objects.requireNonNull(estudio);
    }



    public Estudio estudio(){
        return this.estudio;
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
