package com.devsirlocust.challenger.ddd.domain.experiencia.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.id.ExperienciaLaboralId;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.object.ConocimientosAdquiridos;

import lombok.Getter;

@Getter
public class ConocimientosAdquiridosExperienciaLaboralModificado extends DomainEvent{


    private final ExperienciaLaboralId entityId;

    private final ConocimientosAdquiridos conocimientosAdquiridos;


    public ConocimientosAdquiridosExperienciaLaboralModificado(ExperienciaLaboralId entityId, ConocimientosAdquiridos conocimientosAdquiridos) {
        super("devsirlocust.experienciaLaboral.experiencialaboralagregada");
        this.entityId = entityId;

        this.conocimientosAdquiridos = conocimientosAdquiridos;

    }




    public ConocimientosAdquiridos getConocimientosAdquiridos(){
        return this.conocimientosAdquiridos;
    }


}
