package com.Iesam.Sevillafc.data.Local;

import com.Iesam.Sevillafc.domain.models.Jugador;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class JugadorFileLocalDataSource {

    private static JugadorFileLocalDataSource instance = null;

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Jugador>>() {
    }.getType();

    private JugadorFileLocalDataSource() {
    }

    public void save(Jugador jugador) {
        List<Jugador> jugadores = findAll();
        jugadores.add(jugador);
        saveToFile(jugadores);
    }

    private void saveToFile(List<Jugador> jugadores) {
        try {
            FileWriter myWriter = new FileWriter("jugadores.txt");
            myWriter.write(gson.toJson(jugadores));
            myWriter.close();
            System.out.println("Jugador guardado correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }


    public Jugador findById(Integer idJugador) {
        List<Jugador> jugadores = findAll();
        for (Jugador jugador : jugadores) {
            if (Objects.equals(jugador.getId(), idJugador)) {
                return jugador;
            }
        }
        return null;
    }

    public List<Jugador> findAll() {
        try {
            File myObj = new File("jugadores.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return new ArrayList<Jugador>();
    }


    public static JugadorFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new JugadorFileLocalDataSource();
        }
        return instance;
    }
}
