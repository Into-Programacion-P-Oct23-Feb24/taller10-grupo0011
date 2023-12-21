/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        int f;
        int c;
        for (f = 0; f < notasCualitativas.length; f++) {
            for (c = 0; c < notasCualitativas[f].length; c++) {
                if (notasCuantitativas[f][c] >= 0 && notasCuantitativas[f][c]
                        < 3) {
                    notasCualitativas[f][c] = "Insuficiente";
                } else if (notasCuantitativas[f][c] >= 3
                        && notasCuantitativas[f][c] < 5) {
                    notasCualitativas[f][c] = "Regular";
                } else if (notasCuantitativas[f][c] >= 5
                        && notasCuantitativas[f][c] < 8) {
                    notasCualitativas[f][c] = "Buena";
                } else if (notasCuantitativas[f][c] >= 8
                        && notasCuantitativas[f][c] <= 9.5) {
                    notasCualitativas[f][c] = "Muy buena";
                } else if (notasCuantitativas[f][c] >= 9.6
                        && notasCuantitativas[f][c] <= 10) {
                    notasCualitativas[f][c] = "Sobresaliente";

                }

            }
        }
        for (f = 0; f < notasCualitativas.length; f++) {
            for (c = 0; c < notasCualitativas[f].length; c++) {
                System.out.printf("La nota de la fila %d, columna %d es %s\n",
                         f, c, notasCualitativas[f][c]);

            }
        }
    }
}
