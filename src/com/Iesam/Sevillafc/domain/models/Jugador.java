package com.Iesam.Sevillafc.domain.models;

import com.google.gson.Gson;

public class Jugador extends Persona{

    private String demarcacion;

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
