/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] notas = {{9, 10, 7, 8},
        {10, 5, 7, 9},
        {7, 9.4, 10, 9}};
        String[] nombres = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double[] promedio;
        promedio = new double[3];
        double suma = 0;
        int f;
        int c;
        for (f = 0; f < notas.length; f++) {
            for (c = 0; c < notas[f].length; c++) {
                suma = suma + notas[f][c];
            }
            promedio[f] = suma / 4;
            suma= 0;
        }
        for (f = 0; f < notas.length; f++) {
            System.out.printf("Estudiante: %s tiene un promedio de %.2f \n",
                    nombres[f],promedio[f]);
        }
    }
}
