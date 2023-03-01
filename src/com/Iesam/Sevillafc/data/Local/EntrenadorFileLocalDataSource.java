package com.Iesam.Sevillafc.data.Local;


import com.Iesam.Sevillafc.data.EntrenadorDataRepository;
import com.Iesam.Sevillafc.domain.models.Entrenador;
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

public class EntrenadorFileLocalDataSource {


    private static EntrenadorFileLocalDataSource instance = null;

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Entrenador>>() {
    }.getType();

    private EntrenadorFileLocalDataSource() {
    }

    public void save(Entrenador entrenador) {
        List<Entrenador> entrenadores = findAll();
        entrenadores.add(entrenador);
        saveToFile(entrenadores);
    }

    private void saveToFile(List<Entrenador> entrenadores) {
        try {
            FileWriter myWriter = new FileWriter("entrenadores.txt");
            myWriter.write(gson.toJson(entrenadores));
            myWriter.close();
            System.out.println("Entrenador guardado correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }


    public Entrenador findById(Integer idEntrenador) {
        List<Entrenador> entrenadores = findAll();
        for (Entrenador entrenador : entrenadores) {
            if (Objects.equals(entrenador.getId(), idEntrenador)) {
                return entrenador;
            }
        }
        return null;
    }

    public List<Entrenador> findAll() {
        try {
            File myObj = new File("entrenadores.txt");
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
        return new ArrayList<Entrenador>();
    }

    public static EntrenadorFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new EntrenadorFileLocalDataSource();
        }
        return instance;
    }
}
