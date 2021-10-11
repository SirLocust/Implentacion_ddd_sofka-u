package com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id;

import co.com.sofka.domain.generic.Identity;

public class EducacionId extends Identity {
    private EducacionId(String uuid) {
        super(uuid);
    }
    public EducacionId(){

    }

    public  static EducacionId of(String id){
        return  new EducacionId(id);
    }
}
