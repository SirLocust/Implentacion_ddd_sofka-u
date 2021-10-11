package com.devsirlocust.challenger.ddd.domain.gestioneducacion.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id.EducacionId;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Estudio;

import lombok.Getter;

@Getter
public class EstudioEducacionModificado extends DomainEvent{


    private final EducacionId entityId;
    private Estudio estudio;


    public EstudioEducacionModificado(EducacionId entityId, Estudio estudio ) {
        super("devsirlocust.educacion.tipoeducacionmodificado");
        this.entityId = entityId;


        this.estudio = estudio;
    }




    public Estudio getEstudio(){
        return this.estudio;
    }


}
