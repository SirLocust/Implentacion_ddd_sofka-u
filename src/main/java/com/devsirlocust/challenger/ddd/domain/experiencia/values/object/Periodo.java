package com.devsirlocust.challenger.ddd.domain.experiencia.values.object;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Periodo implements ValueObject<String> {
     private final String value;

     public Periodo(String value){
         this.value = Objects.requireNonNull(value);
     }

    @Override
    public String value() {
        return value;
    }
}
