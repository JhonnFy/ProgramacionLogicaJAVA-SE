/*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/

 /*El número de sonidos emitidos por un grillo en un minuto, es una función de la temperatura. 
Como resultado de esto, es posible determinar el nivel de la temperatura haciendo uso de un grillito como termómetro.
La fórmula para la función es:
T = h / 4 + 40*/
package Cap1Algoritmo1;

import java.util.*;
import java.math.*;

public class Cap1Algoritmo6 {

    public static void main(String[] args) {

        Scanner Alg6 = new Scanner(System.in);
        int opc = '0';
        int emitidos = '0';
        int totals = '0';

        System.out.print("\n\t*****BIENVENIDO Algoritmo#6*****");
        System.out.print("\n\t1-¿Consultar los sonidos del Grillo?");
        System.out.print("\n\t2-Salir");
        System.out.print("\n\n\tSeleccione una opción\t\t");
        opc = Alg6.nextInt();

        for (int a = 0; a < 20; a++) {
            System.out.print("\n");
        }

        if (opc != 1 && opc != 2) {
            System.out.print("\n\tDATOS ERRADOS\n\t");
            System.exit(0);
        } else {

            switch (opc) {
                case 1:

                    if (opc == 1) {
                        System.out.print("\n\t*****BIENVENIDO Algoritmo#6 OPC#1*****");

                        int[] nsonidos = new int[1];
                        System.out.print("\n\t¿Total minutos?\t\t");
                        nsonidos[0] = Alg6.nextInt();
                        /*T = h / 4 + 40*/
                        emitidos = (nsonidos[0] / 4 + 40);
                        totals = emitidos;

                        for (int b = 0; b < 20; b++) {
                            System.out.print("\n");
                        }

                        System.out.print("\n\t*****DATOS Algoritmo#6 OPC#1*****");
                        System.out.print("\n\tTotal sonidos emitidos\t\t" + totals + ".\n");
                        break;

                    }
                case 2:
                    System.out.print("\n\tFin\n\t");
                    System.exit(0);
                    break;
            }
        }
    }
}