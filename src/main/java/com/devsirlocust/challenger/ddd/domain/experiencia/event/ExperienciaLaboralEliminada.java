package com.devsirlocust.challenger.ddd.domain.experiencia.event;

import co.com.sofka.domain.generic.DomainEvent;

import com.devsirlocust.challenger.ddd.domain.experiencia.values.id.ExperienciaLaboralId;
import lombok.Getter;

@Getter
public class ExperienciaLaboralEliminada extends DomainEvent{


    private final ExperienciaLaboralId entityId;


    public ExperienciaLaboralEliminada(ExperienciaLaboralId entityId) {
        super("devsirlocust.experiencialaboral.experiencialaboraleliminada");
        this.entityId = entityId;


    }

    public ExperienciaLaboralId getExperienciaLaboralId(){
        return this.entityId;
    }



}
