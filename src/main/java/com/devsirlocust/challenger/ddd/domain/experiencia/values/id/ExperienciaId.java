package com.devsirlocust.challenger.ddd.domain.experiencia.values.id;


import co.com.sofka.domain.generic.Identity;

public class ExperienciaId extends Identity {


    private ExperienciaId(String uuid) {
        super(uuid);
    }
    public ExperienciaId(){

    }

    public  static ExperienciaId of(String id){
        return  new ExperienciaId(id);
    }
}
