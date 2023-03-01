package com.Iesam.Sevillafc.domain;

import com.Iesam.Sevillafc.domain.models.Entrenador;

import java.util.List;

public interface EntrenadorRepository {

    public Entrenador findById(Integer idEntrenador);
    public void save(Entrenador entrenador);
    public List<Entrenador> findAll();

    public void delete(Integer idEntrenador);

}
