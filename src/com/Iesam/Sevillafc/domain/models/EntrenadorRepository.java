package com.Iesam.Sevillafc.domain.models;

import java.util.List;

public interface EntrenadorRepository {

    public Entrenador findById(Entrenador entrenador);
    public void save(String idEntrenador);
}
