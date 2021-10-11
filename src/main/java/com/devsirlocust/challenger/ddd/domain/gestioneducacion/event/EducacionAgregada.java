package com.devsirlocust.challenger.ddd.domain.gestioneducacion.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id.EducacionId;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Estudio;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Tipo;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Institucion;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Periodo;
import lombok.Getter;

@Getter
public class EducacionAgregada extends DomainEvent{


    private final EducacionId entityId;

    private final Tipo tipo;
    private final Institucion institucion;
    private final Periodo periodo;
    private final Estudio estudio;

    public EducacionAgregada(EducacionId entityId, Tipo tipo, Institucion institucion, Periodo periodo, Estudio estudio) {
        super("devsirlocust.educacion.educacionagregada");
        this.entityId = entityId;

        this.tipo = tipo;
        this.institucion = institucion;


        this.periodo = periodo;
        this.estudio = estudio;
    }




    public Tipo getTipo(){
        return this.tipo;
    }
    public Estudio getEstudio(){ return  this.estudio;}

    public Institucion getInstitucion(){
        return this.institucion;
    }
    public Periodo getPeriodo(){
        return this.periodo;
    }


}
