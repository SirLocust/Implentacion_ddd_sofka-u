package com.devsirlocust.challenger.ddd.domain.gestioneducacion.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id.EducacionId;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Tipo;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Institucion;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Periodo;
import lombok.Getter;

@Getter
public class InstitucionEducacionModificada extends DomainEvent{


    private final EducacionId entityId;


    private final Institucion institucion;


    public InstitucionEducacionModificada(EducacionId entityId,Institucion institucion) {
        super("devsirlocust.educacion.institucioneducacionmodificada");
        this.entityId = entityId;


        this.institucion = institucion;



    }






    public Institucion getInstitucion(){
        return this.institucion;
    }



}
