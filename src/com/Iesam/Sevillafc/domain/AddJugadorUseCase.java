package com.Iesam.Sevillafc.domain;

import com.Iesam.Sevillafc.domain.models.Jugador;

public class AddJugadorUseCase {

    private JugadorRepository jugadorRepository;

    public AddJugadorUseCase (JugadorRepository jugadorRepository){
        this.jugadorRepository = jugadorRepository;
    }
    public void execute(Jugador jugador){
        this.jugadorRepository.save(jugador);
    }
    }

