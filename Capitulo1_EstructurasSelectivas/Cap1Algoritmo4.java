/*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/

/*Dado como datos la categoría y el sueldo de un trabajador, calcule el aumento correspondiente teniendo en cuenta la siguiente tabla. 
Categoria-Aumento
1-15%
2-10%
3-8%
4-7%
Imprima la categoría del trabajador y su nuevo sueldo.*/
package Cap1Algoritmo1;

import java.util.*;
import java.math.*;

public class Cap1Algoritmo4 {

    public static void main(String[] args) {

        Scanner Alg4 = new Scanner(System.in);

        final int pct1 = 15;
        final int pct2 = 10;
        final int pct3 = 8;
        final int pct4 = 7;

        final int cat1 = 1;
        final int cat2 = 2;
        final int cat3 = 3;
        final int cat4 = 4;

        int opc = 0;
        int sueldo = 0;
        int nsueldoi = 0;
        int nsueldof = 0;

        System.out.print("\n\t\t*****BIENVENIDO*****");
        System.out.print("\n\t\tOPCIONES DISPONIBLES:");
        System.out.print("\n\t\t1-Calcular Su Nuevo Salario.");
        System.out.print("\n\t\t2-Salir Del Sistema.");
        System.out.print("\n\n\t\tSeleccione Una Opcion:\t\t");
        opc = Alg4.nextInt();

        sueldo = (sueldo * 0);
        nsueldoi = (nsueldoi * 0);
        nsueldof = (nsueldof * 0);

        for (int a = 0; a < 40; a++) {
            System.out.print("\n");
        }

        if (opc != 1 && opc != 2) {
            System.out.print("\n\tIdiota Las Opciones Son 1 & 2.\n\t" + opc + ",Es Diferente.\t");
            System.exit(0);
        } else if (opc == 1) {
            int catg = 0;
            do {
                System.out.print("\n\t\t*****OPCION #1*****");
                System.out.print("\n\t\t1-Calcular Su Nuevo Salario");
                System.out.print("\n\t\t¿Informe Su Categoria?\t\t");
                catg = Alg4.nextInt();

                for (int b = 0; b < 40; b++) {
                    System.out.print("\n");
                }
                if (catg != 1 && catg != 2 && catg != 3 && catg != 4) {
                    System.out.print("\n\tCATEGORIA ERRADA");
                }

            } while (catg != 1 && catg != 2 && catg != 3 && catg != 4);

            for (int c = 0; c < 40; c++) {
                System.out.print("\n");
            }

            switch (catg) {
                case 1:
                    if (catg == cat1) {
                        System.out.print("\n\t\t*****OPCION #1 CAT1 15%*****");
                        System.out.print("\n\t\t1-Calcular Su Nuevo Salario");
                        System.out.print("\n\t\t¿Informe Su Salario?\t\t$");
                        sueldo = Alg4.nextInt();

                        nsueldoi = (sueldo * pct1) / 100;
                        nsueldof = (sueldo + nsueldoi);

                        for (int d = 0; d < 20; d++) {
                            System.out.println("\n");
                        }
                        System.out.print("\n\t\t*****OPCION #1 CAT1 15%*****");
                        System.out.print("\n\t\t1-Calcular Su Nuevo Salario");
                        System.out.print("\n\t\tSalario Actual:\t\t\t\t$" + sueldo + ".");
                        System.out.print("\n\t\tAumento Del 15%:\t\t\t$" + nsueldoi + ".");
                        System.out.print("\n\t\tSalario Neto:\t\t\t\t$" + nsueldof + ".\n");
                    }
                    break;
                case 2:
                    if (catg == cat2) {
                        System.out.print("\n\t\t*****OPCION #1 CAT2 10%*****");
                        System.out.print("\n\t\t1-Calcular Su Nuevo Salario");
                        System.out.print("\n\t\t¿Informe Su Salario?\t\t$");
                        sueldo = Alg4.nextInt();

                        nsueldoi = (sueldo * pct2) / 100;
                        nsueldof = (sueldo + nsueldoi);

                        for (int d = 0; d < 20; d++) {
                            System.out.println("\n");
                        }

                        System.out.print("\n\t\t*****OPCION #1 CAT2 10%*****");
                        System.out.print("\n\t\t1-Calcular Su Nuevo Salario");
                        System.out.print("\n\t\tSalario Actual:\t\t\t\t$" + sueldo + ".");
                        System.out.print("\n\t\tAumento Del 15%:\t\t\t$" + nsueldoi + ".");
                        System.out.print("\n\t\tSalario Neto:\t\t\t\t$" + nsueldof + ".\n");
                    }
                    break;
                case 3:
                    if (catg == cat3) {
                        System.out.print("\n\t\t*****OPCION #1 CAT3 8%*****");
                        System.out.print("\n\t\t1-Calcular Su Nuevo Salario");
                        System.out.print("\n\t\t¿Informe Su Salario?\t\t$");
                        sueldo = Alg4.nextInt();

                        nsueldoi = (sueldo * pct3) / 100;
                        nsueldof = (sueldo + nsueldoi);

                        for (int d = 0; d < 20; d++) {
                            System.out.println("\n");
                        }

                        System.out.print("\n\t\t*****OPCION #1 CAT2 8%*****");
                        System.out.print("\n\t\t1-Calcular Su Nuevo Salario");
                        System.out.print("\n\t\tSalario Actual:\t\t\t\t$" + sueldo + ".");
                        System.out.print("\n\t\tAumento Del 15%:\t\t\t$" + nsueldoi + ".");
                        System.out.print("\n\t\tSalario Neto:\t\t\t\t$" + nsueldof + ".\n");
                    }
                    break;
                case 4:
                    if (catg == cat4) {
                        System.out.print("\n\t\t*****OPCION #1 CAT3 7%*****");
                        System.out.print("\n\t\t1-Calcular Su Nuevo Salario");
                        System.out.print("\n\t\t¿Informe Su Salario?\t\t$");
                        sueldo = Alg4.nextInt();

                        nsueldoi = (sueldo * pct4) / 100;
                        nsueldof = (sueldo + nsueldoi);

                        for (int d = 0; d < 20; d++) {
                            System.out.println("\n");
                        }

                        System.out.print("\n\t\t*****OPCION #1 CAT4 7%*****");
                        System.out.print("\n\t\t1-Calcular Su Nuevo Salario");
                        System.out.print("\n\t\tSalario Actual:\t\t\t\t$" + sueldo + ".");
                        System.out.print("\n\t\tAumento Del 15%:\t\t\t$" + nsueldoi + ".");
                        System.out.print("\n\t\tSalario Neto:\t\t\t\t$" + nsueldof + ".\n");
                    }
                    break;
            }
        } else if (opc == 2) {
            System.out.print("\tFUERA DE LINEA\n\t");
            System.exit(0);
        }
    }
}