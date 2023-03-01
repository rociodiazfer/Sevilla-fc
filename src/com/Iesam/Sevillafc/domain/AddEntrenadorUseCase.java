package com.Iesam.Sevillafc.domain;

import com.Iesam.Sevillafc.domain.models.Entrenador;

public class AddEntrenadorUseCase {


    private EntrenadorRepository entrenadorRepository;

    public AddEntrenadorUseCase(EntrenadorRepository entrenadorRepository){
        this.entrenadorRepository = entrenadorRepository;
    }

    public void exectue(Entrenador entrenador){
        this.entrenadorRepository.save(entrenador);
    }
}
