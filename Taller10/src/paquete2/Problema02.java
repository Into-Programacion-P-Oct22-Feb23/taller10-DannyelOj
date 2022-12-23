/*
 * To change this license header, choose License Headers in Project Propertines.
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
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        int[][] venta = new int[2][5];
        String reporte = "";
        int ventaDia;
        int suma = 0;

        for (int i = 0; i < venta.length; i++) {
            System.out.printf("Ingrese las ventas de: %s\n\n",vendedores[i]);
            for (int j = 0; j < venta[i].length; j++) {
                System.out.printf("Ingrese el numero de ventas del dia\n");
                ventaDia = entrada.nextInt();
                suma = suma + ventaDia;
                ventaDia = venta[i][j];

            }
        }
        System.out.print("-----------------------------------------------\n");
        System.out.printf("Vendedor(a) %s\nVendedor(a) %s\nHa realizado un total"
                + " de %d en ventas.\n1", vendedores[0], vendedores[1], suma);
        System.out.print("-----------------------------------------------\n");
    }
}
