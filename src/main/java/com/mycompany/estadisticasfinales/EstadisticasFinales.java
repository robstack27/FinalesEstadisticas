/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estadisticasfinales;

import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class EstadisticasFinales {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del curso: ");
        String nombreCurso = scanner.nextLine();

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();

        // Crear una instancia de la clase Curso
        Curso curso = new Curso(nombreCurso, cantidadEstudiantes);

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Ingrese información para el estudiante #" + (i + 1));

            System.out.print("Ingrese la nota del estudiante: ");
            float nota = scanner.nextFloat();

            System.out.print("Ingrese el semestre del estudiante: ");
            int semestre = scanner.nextInt();

            Estudiante estudiante = new Estudiante(nota, semestre);
            curso.cantidadEstudiantes(estudiante, i);
        }

        System.out.println("\nEstadísticas del curso '" + nombreCurso + "':");
        System.out.println("Nota promedio: " + curso.notaPromedio());
        System.out.println("Número de ganadores: " + curso.ganadores());
        System.out.println("Número de perdedores: " + curso.perdedores());
        System.out.println("Semestre promedio: " + curso.semestreProm());
    }
}
