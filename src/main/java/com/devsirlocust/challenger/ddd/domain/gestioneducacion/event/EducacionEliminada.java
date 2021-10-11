package com.devsirlocust.challenger.ddd.domain.gestioneducacion.event;

import co.com.sofka.domain.generic.DomainEvent;

import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id.EducacionId;
import lombok.Getter;

@Getter
public class EducacionEliminada extends DomainEvent{


    private final EducacionId entityId;


    public EducacionEliminada(EducacionId entityId) {
        super("devsirlocust.educacion.educacioneliminada");
        this.entityId = entityId;


    }

    public EducacionId getExperienciaLaboralId(){
        return this.entityId;
    }



}
