package com.Iesam.Sevillafc.data;

import com.Iesam.Sevillafc.data.Local.JugadorFileLocalDataSource;
import com.Iesam.Sevillafc.domain.JugadorRepository;
import com.Iesam.Sevillafc.domain.models.Jugador;

import java.util.List;

public class JugadorDataRepository implements JugadorRepository {



    private JugadorFileLocalDataSource localDataSource;

    public JugadorDataRepository(JugadorFileLocalDataSource jugadorFileLocalDataSource){
        this.localDataSource= jugadorFileLocalDataSource;
    }

    @Override
    public void save(Jugador jugador) {
    localDataSource.save(jugador);
    }

    @Override
    public List<Jugador> findAll() {
        return this.localDataSource.findAll();
    }

    @Override
    public void delete(Integer idJugador) {

    }
}
