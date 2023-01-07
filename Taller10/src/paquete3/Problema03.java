/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        String[][] notaCuali = new String[3][3];
        double[][] notaCuanti = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};

        for (int i = 0; i < notaCuanti.length; i++) {
            for (int j = 0; j < notaCuanti.length; j++) {
                if (notaCuanti[i][j] > 0 && notaCuanti[i][j] < 3) {
                    notaCuali[i][j] = "Insuficiente";
                } else if (notaCuanti[i][j] >= 3 && notaCuanti[i][j] < 5) {
                    notaCuali[i][j] = "Regular";
                } else if (notaCuanti[i][j] >= 5 && notaCuanti[i][j] < 8) {
                    notaCuali[i][j] = "Buena";
                } else if (notaCuanti[i][j] >= 8 && notaCuanti[i][j] <= 9.5) {
                    notaCuali[i][j] = "Muy Buena";
                } else if (notaCuanti[i][j] >= 9.6 && notaCuanti[i][j] <= 10) {
                    notaCuali[i][j] = "Sobresaliente";
                }
            }
        }
        for (int i = 0; i < notaCuanti.length; i++) {
            for (int j = 0; j < notaCuanti.length; j++) {
                System.out.println(notaCuanti[i][j]);
                System.out.println(notaCuali[i][j]);

            }

        }

    }
}
