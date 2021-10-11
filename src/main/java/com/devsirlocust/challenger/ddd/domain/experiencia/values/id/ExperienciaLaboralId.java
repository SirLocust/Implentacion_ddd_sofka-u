package com.devsirlocust.challenger.ddd.domain.experiencia.values.id;

import co.com.sofka.domain.generic.Identity;

public class ExperienciaLaboralId extends Identity {
    private ExperienciaLaboralId(String uuid) {
        super(uuid);
    }
    public ExperienciaLaboralId(){

    }

    public  static ExperienciaLaboralId of(String id){
        return  new ExperienciaLaboralId(id);
    }
}
