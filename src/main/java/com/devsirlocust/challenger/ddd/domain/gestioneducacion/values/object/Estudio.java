package com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Estudio implements ValueObject<String>
{     private final String value;

    public Estudio(String value){
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
