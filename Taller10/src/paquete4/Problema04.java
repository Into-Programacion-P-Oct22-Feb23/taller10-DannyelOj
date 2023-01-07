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
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] datoIngresar = new double[2][2];
        for (int i = 0; i < datoIngresar.length; i++) {
            for (int j = 0; j < datoIngresar.length; j++) {
                System.out.println("Ingrese los valores del arreglo");
                datoIngresar[i][j] = entrada.nextDouble();
            }
        }
        System.out.println("Los valores ingresados para el arreglo son");

        for (int i = 0; i < datoIngresar.length; i++) {
            for (int j = 0; j < datoIngresar.length; j++) {
                // System.out.println("Los valores ingresados son");
                System.out.println(datoIngresar[i][j]);
            }
        }
    }
    
}
