/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estadisticasfinales;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author labctr
 */
public class Curso {
    private String nombre;
    private Estudiante[] estudiantes;

    public Curso(String nombre, int cantidadEstudiantes) {
        this.nombre = nombre;
        this.estudiantes = new Estudiante[cantidadEstudiantes];
    }

    public void cantidadEstudiantes(Estudiante estudiante, int indice) {
        if (indice >= 0 && indice < estudiantes.length) {
            estudiantes[indice] = estudiante;
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public float notaPromedio() {
        float sumaNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getNota();
        }
        return sumaNotas / estudiantes.length;
    }

    public int ganadores() {
        int ganadores = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() >= 14) {
                ganadores++;
            }
        }
        return ganadores;
    }

    public int perdedores() {
        int perdedores = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() < 14) {
                perdedores++;
            }
        }
        return perdedores;
    }

    public int semestreProm() {
        //almacena la frecuencia de cada semestre
        Map<Integer, Integer> frecuenciaSemestres = new HashMap<>();

        // Cuenta la frecuencia de cada semestre
        for (Estudiante estudiante : estudiantes) {
            int semestre = estudiante.getSemestre();
            frecuenciaSemestres.put(semestre, frecuenciaSemestres.getOrDefault(semestre, 0) + 1);
        }

        // Encuentra el semestre con la mayor frecuencia (moda)
        int moda = 0; // Valor predeterminado si no hay moda
        int maxFrecuencia = 0;

        for (Map.Entry<Integer, Integer> entry : frecuenciaSemestres.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                moda = entry.getKey();
            }
        }

        return moda;
    }

}
