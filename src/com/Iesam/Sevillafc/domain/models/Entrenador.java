package com.Iesam.Sevillafc.domain.models;

import com.google.gson.Gson;

public class Entrenador extends Persona{

    private String estrategia;

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
