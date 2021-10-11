package com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id;


import co.com.sofka.domain.generic.Identity;

public class GestionEducacionId extends Identity {


    private GestionEducacionId(String uuid) {
        super(uuid);
    }
    public GestionEducacionId(){

    }

    public  static GestionEducacionId of(String id){
        return  new GestionEducacionId(id);
    }
}
