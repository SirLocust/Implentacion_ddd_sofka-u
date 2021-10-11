package com.devsirlocust.challenger.ddd.domain.gestioneducacion.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id.EducacionId;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Tipo;
import lombok.Getter;

@Getter
public class TipoEducacionModificado extends DomainEvent{


    private final EducacionId entityId;

    private final Tipo tipo;


    public TipoEducacionModificado(EducacionId entityId, Tipo tipo) {
        super("devsirlocust.educacion.tipoeducacionmodificado");
        this.entityId = entityId;

        this.tipo = tipo;

    }




    public Tipo getTipo(){
        return this.tipo;
    }


}
