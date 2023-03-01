package com.Iesam.Sevillafc.presentation;

import com.Iesam.Sevillafc.data.JugadorDataRepository;
import com.Iesam.Sevillafc.data.Local.JugadorFileLocalDataSource;
import com.Iesam.Sevillafc.domain.GetJugadoresUseCase;
import com.Iesam.Sevillafc.domain.JugadorRepository;
import com.Iesam.Sevillafc.domain.models.Jugador;

import java.util.List;

public class PrintJugadorView {


    public void print(){

       GetJugadoresUseCase useCase = new GetJugadoresUseCase(new JugadorDataRepository(JugadorFileLocalDataSource.getInstance()));
       List<Jugador> jugadores = useCase.execute();
       for(Jugador jugador : jugadores){
           System.out.println(jugador.toString());
       }
    }
}
