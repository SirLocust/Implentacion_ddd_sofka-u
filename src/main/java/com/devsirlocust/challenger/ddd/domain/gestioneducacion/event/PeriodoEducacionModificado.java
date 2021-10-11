package com.devsirlocust.challenger.ddd.domain.gestioneducacion.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id.EducacionId;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Periodo;
import lombok.Getter;

@Getter
public class PeriodoEducacionModificado extends DomainEvent{


    private final EducacionId entityId;


    private final Periodo periodo;

    public PeriodoEducacionModificado(EducacionId entityId, Periodo periodo) {
        super("devsirlocust.educacion.periodoeducacionmodificado");
        this.entityId = entityId;



        this.periodo = periodo;
    }

    public EducacionId getCommentId(){
        return this.entityId;
    }





    public Periodo getPeriodo(){
        return this.periodo;
    }


}
