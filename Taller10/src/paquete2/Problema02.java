/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); 
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        String[] nombres = {"Jessica Cole", "Robert Wallace"};
        double[][] ventas;
        ventas = new double[2][5];
        int f;
        int c;
        double total = 0;
        for (f = 0; f < ventas.length; f++) {
            for (c = 0; c < ventas[f].length; c++) {
                System.out.printf("Ingrese las ventas obtenidas el dia "
                        + "%s de %s\n", dias[c], nombres[f]);
                ventas[f][c] = sc.nextDouble();
            }
        }
        for (f = 0; f < ventas.length; f++) {
            for (c = 0; c < ventas[f].length; c++) {
                total = ventas[f][c] + total;
            }
        }
        for (f = 0; f < ventas.length; f++) {
            System.out.printf("Vendedor(a) %s\n", nombres[f]);
        }
        System.out.printf("Ha realizado un total de %.2f en ventas\n",
                total);
    }
}
