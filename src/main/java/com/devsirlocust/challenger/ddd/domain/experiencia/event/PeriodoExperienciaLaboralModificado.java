package com.devsirlocust.challenger.ddd.domain.experiencia.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.id.ExperienciaLaboralId;

import com.devsirlocust.challenger.ddd.domain.experiencia.values.object.Periodo;
import lombok.Getter;

@Getter
public class PeriodoExperienciaLaboralModificado extends DomainEvent{


    private final ExperienciaLaboralId entityId;


    private final Periodo periodo;

    public PeriodoExperienciaLaboralModificado(ExperienciaLaboralId entityId, Periodo periodo) {
        super("devsirlocust.experienciaLaboral.experiencialaboralagregada");
        this.entityId = entityId;



        this.periodo = periodo;
    }

    public ExperienciaLaboralId getCommentId(){
        return this.entityId;
    }





    public Periodo getPeriodo(){
        return this.periodo;
    }


}
