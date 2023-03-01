package com.Iesam.Sevillafc.domain;

import com.Iesam.Sevillafc.domain.models.Jugador;

import java.util.List;

public class GetJugadoresUseCase {


    private JugadorRepository jugadorRepository;

    public GetJugadoresUseCase (JugadorRepository jugadorRepository){
        this.jugadorRepository = jugadorRepository;
    }
    public List<Jugador> execute(){
       return this.jugadorRepository.findAll();
    }
}
