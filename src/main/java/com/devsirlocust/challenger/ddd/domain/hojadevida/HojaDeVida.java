package com.devsirlocust.challenger.ddd.domain.hojadevida;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;


import com.devsirlocust.challenger.ddd.domain.hojadevida.values.id.HojaDeVidaId;


import java.util.List;


public class HojaDeVida extends AggregateEvent<HojaDeVidaId> {




    
//    public HojaDeVida(HojaDeVidaId entityId) {
//        super(entityId);
//
//        appendChange(new HojaDeVidaCreada()).apply();
//    }

    private HojaDeVida(HojaDeVidaId entityId){
        super(entityId);
        subscribe(new HojaDeVidaChange(this));
    }


//
    public static HojaDeVida from(HojaDeVidaId hojaDeVidaId, List<DomainEvent> events){
        var post = new HojaDeVida(hojaDeVidaId);
        events.forEach(post::applyEvent);
        return post;
    }



    
}
