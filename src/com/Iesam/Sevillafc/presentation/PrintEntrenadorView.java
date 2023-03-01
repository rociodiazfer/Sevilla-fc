package com.Iesam.Sevillafc.presentation;

import com.Iesam.Sevillafc.data.EntrenadorDataRepository;
import com.Iesam.Sevillafc.data.Local.EntrenadorFileLocalDataSource;
import com.Iesam.Sevillafc.domain.EntrenadorRepository;
import com.Iesam.Sevillafc.domain.GetEntrenadorUseCase;
import com.Iesam.Sevillafc.domain.models.Entrenador;

import java.util.List;

public class PrintEntrenadorView {


    public void print(){

        GetEntrenadorUseCase useCase = new GetEntrenadorUseCase(new EntrenadorDataRepository(EntrenadorFileLocalDataSource.getInstance()));
        List<Entrenador> entrenadores = useCase.execute();
        for(Entrenador entrenador:entrenadores){
            System.out.println(entrenador.toString());
        }


    }
}
