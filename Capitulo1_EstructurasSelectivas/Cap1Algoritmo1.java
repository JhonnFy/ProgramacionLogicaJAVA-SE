/*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/

 /*Dado como dato la calificación de un alumno en un examen, escriba “aprobado” en caso de que esa calificación sea mayor a 8.*/
package Cap1Algoritmo1;

import java.util.*;

public class Cap1Algoritmo1 {

    public static void main(String[] args) {

        int cal = 0;
        int opc = 0;
        int rep = 0;

        Scanner Alg1 = new Scanner(System.in);

        System.out.print("\t\t****BIENVENIDO****");
        System.out.print("\n\tMenu:");
        System.out.print("\n\t1-Evaluar Mi Estado");
        System.out.print("\n\t2-Salir");
        System.out.print("\n\n\tSeleccionar Una Opción:\t\t");
        opc = Alg1.nextInt();
        do {
            for (int i = 0; i < 10; i++) {
                System.out.print("\n");
            }
            switch (opc) {

                case 1:
                    int cla = 0;
                    if (opc == 1) {
                        System.out.print("\n\t¿Su calificación?\t\t");
                        cla = Alg1.nextInt();
                        for (int a = 0; a < 20; a++) {
                            System.out.print("\n");
                        }
                        if (cla >= 8) {
                            System.out.print("\tAprobado " + cla + ".");
                            System.out.print("\n");
                        } else {
                            System.out.print("\tReprobado " + cla + ".");
                            System.out.print("\n");
                        }
                    }
                    break;

                case 2:
                    System.out.println("SIN DATOS");
                    System.exit(0);
                    System.out.print("\n\n");
                    break;
            }
            System.out.print("\n\t****ESTADO****");
            System.out.print("\n\tPara Reptetir Seleccione 1, Caso Contrario 2\t\t\t");
            rep = Alg1.nextInt();
        } while (rep != 2);
    }
}