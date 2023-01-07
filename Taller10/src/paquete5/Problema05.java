/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {
 public static void main(String[] args) {

        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
                                    {"Carrie Burton", "Lauren Rice"},
                                    {"Emma Escobar", "Lori Flores"},
                                    {"Steven West", "Toni Martin"}
                                    };
        String cadenaFinal = "";
        String nombre = "";
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < 2; j++) {//usamos el limite para controlar el error de longitud
                nombre = estudiantes[i][j];
                if (nombre.startsWith("S") || nombre.startsWith("P") || nombre.startsWith("T")) {
                    cadenaFinal = String.format(" %s", nombre);
                    System.out.println(cadenaFinal);
                }

            }

        }

    }
    
}
