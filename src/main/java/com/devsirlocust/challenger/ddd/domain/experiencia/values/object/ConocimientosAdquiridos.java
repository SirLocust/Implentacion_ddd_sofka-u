package com.devsirlocust.challenger.ddd.domain.experiencia.values.object;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ConocimientosAdquiridos implements ValueObject<String>
{     private final String value;

    public ConocimientosAdquiridos(String value){
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
