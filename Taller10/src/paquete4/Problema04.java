/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double[][] datos = new double[2][2];
        double valor;
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                System.out.printf("Ingrese un valor para la fila %d, "
                        + "columna %d\n",
                        f, c);
                valor = sc.nextDouble();
                if (valor > 1000 && valor < 1199) {
                    datos[f][c] = valor;

                } else {
                    datos[f][c] = 10;
                }

            }
        }
        System.out.printf("\n");
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                System.out.printf("%.0f\n",
                        datos[f][c]);
            }
        }
    }
}
