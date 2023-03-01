package com.Iesam.Sevillafc.domain;

import com.Iesam.Sevillafc.domain.models.Entrenador;

public class DeleteEntrenadorUseCase {

    private EntrenadorRepository entrenadorRepository;


    public DeleteEntrenadorUseCase(EntrenadorRepository entrenadorRepository){
        this.entrenadorRepository = entrenadorRepository;
    }

    public void execute(Entrenador entrenador){
        this.entrenadorRepository.delete(entrenador.getId());
    }


}
