/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Antes de analizar el presente ejercicio,
        usted debe revisar y entender lo desarrollado
        en el archivo Ayuda01.java del paquete2
         */
        Scanner entrada = new Scanner(System.in);
        String[][] estudiantes =    {{"Sarah Ward", "Philip Payne"},
                                    {"Carrie Burton", "Lauren Rice"},
                                    {"Emma Escobar", "Lori Flores"},
                                    {"Steven West", "Toni Martin"}
                                    };
        String inicial;
        char inicialLetra;
        boolean bandera = true;
        String opcion;
        while (bandera) {
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            
            
            for (int i = 0; i < estudiantes.length; i++) {
                
                inicialLetra = estudiantes[i].charAt(0);
                String inicialDos = String.valueOf(inicialLetra);
                
                if (inicial.equals(inicialDos)) {
                    
                    bandera = false;
                    
                }
            }
            
           
        }

    }

}