/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String acumulador = "";
        String cadena;
        for (int f = 0; f < estudiantes.length; f++) {
            for (int c = 0; c < estudiantes[f].length; c++) {
                cadena = estudiantes[f][c];
                String inicial = cadena.substring(0, 1);
                inicial = inicial.toUpperCase();
                if (inicial.equals("S") || (inicial.equals("P"))
                        || (inicial.equals("T"))) {
                    acumulador = String.format("%s%s\n", acumulador,
                            cadena);
                }

            }
        }
        System.out.printf("%s", acumulador);

    }
}
