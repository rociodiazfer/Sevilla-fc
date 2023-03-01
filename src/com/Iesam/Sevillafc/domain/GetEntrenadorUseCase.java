package com.Iesam.Sevillafc.domain;

import com.Iesam.Sevillafc.domain.EntrenadorRepository;
import com.Iesam.Sevillafc.domain.models.Entrenador;

import javax.print.DocFlavor;
import java.util.List;

public class GetEntrenadorUseCase {

    private EntrenadorRepository entrenadorRepository;

    public GetEntrenadorUseCase (EntrenadorRepository entrenadorRepository) {
        this.entrenadorRepository = entrenadorRepository;
    }

    public List<Entrenador> execute(){
        return this.entrenadorRepository.findAll();
    }

}
