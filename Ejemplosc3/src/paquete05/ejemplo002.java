/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

/**
 *
 * @author UTPL
 */
public class Ejemplo002 {

    public static void main(String[] args) {
        int[][] arreglo = {{10, 41, 40}, {1, 2, 3}, {1, 12, 4}};
        int suma = 0;
        for (int fila = 0; fila < arreglo.length; fila++) {
            for (int col = 0; col < arreglo[fila].length; col++) {
                if (fila == col) {
                    suma = suma + arreglo[fila][col];
                }
            }
        }
        System.out.printf("Sumatoria total: %d\n", suma);
        /*
        Para poder hacer la sumatoria de los tres numeros: 10, 2, 4 dados en el arreglo,
        utilicé la lógica simple de lo que comparten en común dentro del arreglo
        sus posiciones referentes son: que su fila es siempre igual a su columna
        con un ciclo repetitivo for recorrí el arreglo y con un ciclo if descarté
        los datos que debia sumar.
        */
    }
}
