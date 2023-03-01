package com.Iesam.Sevillafc.presentation;

import com.Iesam.Sevillafc.data.EntrenadorDataRepository;
import com.Iesam.Sevillafc.data.JugadorDataRepository;
import com.Iesam.Sevillafc.data.Local.EntrenadorFileLocalDataSource;
import com.Iesam.Sevillafc.data.Local.JugadorFileLocalDataSource;
import com.Iesam.Sevillafc.domain.AddEntrenadorUseCase;
import com.Iesam.Sevillafc.domain.AddJugadorUseCase;
import com.Iesam.Sevillafc.domain.models.Jugador;

import java.util.Date;
import java.util.jar.JarEntry;

public class NewJugadorForm {


    public void createNewJugador(){
        Jugador jugador = buildJugador();
        saveJugador(jugador);
    }
    public Jugador buildJugador(){
        Jugador jugador = new Jugador();
        jugador.setId(3);
    return jugador;
    }


    public void saveJugador(Jugador jugador){
       AddJugadorUseCase addJugadorUseCase = new AddJugadorUseCase(new JugadorDataRepository(JugadorFileLocalDataSource.getInstance()));
       addJugadorUseCase.execute(jugador);
    }
}
