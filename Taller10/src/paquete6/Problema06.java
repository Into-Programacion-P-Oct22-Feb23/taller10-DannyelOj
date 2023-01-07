/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {

        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
                                    {"Carrie Burton", "Lauren Rice"},
                                    {"Emma Escobar", "Lori Flores"},
                                    {"Steven West", "Toni Martin"}
                                    };

        String cadena = "";
        String nombreEs = "";
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < 2; j++) {//usamos el limite para controlar el error de longitud
                nombreEs = estudiantes[i][j];
                if (nombreEs.length() == 11) {
                    cadena = String.format(" %s", nombreEs);
                    System.out.println(cadena);
                }

            }
        }

    }
}
