package com.devsirlocust.challenger.ddd.domain.experiencia.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.id.ExperienciaLaboralId;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.object.ConocimientosAdquiridos;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.object.Institucion;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.object.Periodo;
import lombok.Getter;

@Getter
public class ExperienciaLaboralAgregada extends DomainEvent{


    private final ExperienciaLaboralId entityId;

    private final ConocimientosAdquiridos conocimientosAdquiridos;
    private final Institucion institucion;
    private final Periodo periodo;

    public ExperienciaLaboralAgregada(ExperienciaLaboralId entityId, ConocimientosAdquiridos conocimientosAdquiridos, Institucion institucion, Periodo periodo) {
        super("devsirlocust.experienciaLaboral.experiencialaboralagregada");
        this.entityId = entityId;

        this.conocimientosAdquiridos = conocimientosAdquiridos;
        this.institucion = institucion;


        this.periodo = periodo;
    }

    public ExperienciaLaboralId getCommentId(){
        return this.entityId;
    }


    public ConocimientosAdquiridos getConocimientosAdquiridos(){
        return this.conocimientosAdquiridos;
    }

    public Institucion getInstitucion(){
        return this.institucion;
    }
    public Periodo getPeriodo(){
        return this.periodo;
    }


}
