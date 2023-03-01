package com.Iesam.Sevillafc.domain.models;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Entrenador extends Persona{

    private String estrategia;
    ArrayList<Jugador> jugadors;

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    public ArrayList<Jugador> getJugadors() {
        return jugadors;
    }

    public void setJugadors(ArrayList<Jugador> jugadors) {
        this.jugadors = jugadors;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
