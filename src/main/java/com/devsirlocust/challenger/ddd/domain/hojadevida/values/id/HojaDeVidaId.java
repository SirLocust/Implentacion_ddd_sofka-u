package com.devsirlocust.challenger.ddd.domain.hojadevida.values.id;


import co.com.sofka.domain.generic.Identity;

public class HojaDeVidaId extends Identity {


    private HojaDeVidaId(String uuid) {
        super(uuid);
    }
    public HojaDeVidaId(){

    }

    public  static HojaDeVidaId of(String id){
        return  new HojaDeVidaId(id);
    }
}
