package com.Iesam.Sevillafc.domain.models;

import com.google.gson.Gson;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Date;

public class Persona {

    protected Integer id;
    protected String nombre;
    protected String surname;
    protected Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
