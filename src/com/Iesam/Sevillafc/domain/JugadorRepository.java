package com.Iesam.Sevillafc.domain;

import com.Iesam.Sevillafc.domain.models.Jugador;

import java.util.List;

public interface JugadorRepository {

  public void save(Jugador jugador);
  public List<Jugador> findAll();

  public void delete(Integer id);

}
