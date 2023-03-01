package com.Iesam.Sevillafc.domain;



import com.Iesam.Sevillafc.domain.models.Jugador;

import java.util.Date;

public class DeleteJugadorUseCase {


    private JugadorRepository jugadorDataRepository;


    public DeleteJugadorUseCase (JugadorRepository jugadorRepository){
        this.jugadorDataRepository=jugadorRepository;
    }
    public void execute(Jugador jugador){
        this.jugadorDataRepository.delete(jugador.getId());
    }
}
