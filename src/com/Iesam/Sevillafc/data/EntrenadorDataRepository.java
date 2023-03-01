package com.Iesam.Sevillafc.data;

import com.Iesam.Sevillafc.data.Local.EntrenadorFileLocalDataSource;
import com.Iesam.Sevillafc.domain.EntrenadorRepository;
import com.Iesam.Sevillafc.domain.models.Entrenador;
import com.Iesam.Sevillafc.domain.models.Jugador;

import java.util.List;

public class EntrenadorDataRepository implements EntrenadorRepository {



    private EntrenadorFileLocalDataSource localDataSource;

    public EntrenadorDataRepository (EntrenadorFileLocalDataSource entrenadorFileLocalDataSource){
        this.localDataSource =entrenadorFileLocalDataSource;
    }

    @Override
    public Entrenador findById(Integer idEntrenador) {
        return this.localDataSource.findById(idEntrenador);
    }

    @Override
    public void save(Entrenador entrenador) {
    localDataSource.save(entrenador);
    }

    @Override
    public List<Entrenador> findAll() {
        return this.localDataSource.findAll();
    }

    @Override
    public void delete(Integer idEntrenador) {

    }
}
