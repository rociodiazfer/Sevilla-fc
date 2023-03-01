package com.Iesam.Sevillafc.presentation;

import com.Iesam.Sevillafc.data.EntrenadorDataRepository;
import com.Iesam.Sevillafc.data.Local.EntrenadorFileLocalDataSource;
import com.Iesam.Sevillafc.domain.AddEntrenadorUseCase;
import com.Iesam.Sevillafc.domain.GetJugadoresUseCase;
import com.Iesam.Sevillafc.domain.models.Entrenador;

import java.util.Date;
import java.util.List;

public class NewEntrenadorForm {

    public void createNewEntrenador(){
        Entrenador entrenador = buildEntrenador();
        saveEntrenador(entrenador);
    }

    public Entrenador buildEntrenador(){
        Entrenador entrenador = new Entrenador();
        entrenador.setId(2);
        entrenador.setNombre("Luis");
        entrenador.setDate((new Date(2012,9,12)));
        entrenador.setSurname("Enrique");
        entrenador.setEstrategia("Avanzada");
        //entrenador.setJugadors();Quiero listar los jugadores que dirige pero no se como

        return entrenador;
    }

    public void saveEntrenador(Entrenador entrenador){
        AddEntrenadorUseCase addEntrenadorUseCase = new AddEntrenadorUseCase(new EntrenadorDataRepository(EntrenadorFileLocalDataSource.getInstance()));
        addEntrenadorUseCase.exectue(entrenador);
    }
}
