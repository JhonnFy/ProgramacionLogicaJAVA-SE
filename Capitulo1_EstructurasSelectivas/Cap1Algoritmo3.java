/*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/

 /*Dado como dato el sueldo de un trabajador, aplique un aumento del 15% si su sueldo es inferior a $2000000 y 12% en caso contrario.
Imprima el nuevo sueldo del trabajador.*/
package Cap1Algoritmo1;

import java.util.*;
import java.math.*;

public class Cap1Algoritmo3 {

    public static void main(String[] args) {
        Scanner Alg3 = new Scanner(System.in);

        final int sbase = 2000000;
        final int porcs = 15;
        final int porci = 12;
        int porc = 0;
        int salario = 0;
        int nsalario = 0;

        System.out.print("\n\t\t*****BIENVENIDO*****");
        System.out.print("\n\t\t¿Salario Actual?\t\t");
        salario = Alg3.nextInt();

        for (int a = 0; a < 20; a++) {
            System.out.print("\n");
        }
        if (salario < sbase) {
            porc = (salario * porcs) / 100;
            nsalario = (salario + porc);
            System.out.print("\n\t\t*****DATOS*****");
            System.out.print("\n\t\t1-Salario Base:\t\t$" + salario + ".");
            System.out.print("\n\t\t2-Aumento 15%:\t\t$" + porc + ".");
            System.out.print("\n\t\t3-Salrio Neto:\t\t$" + nsalario + ".");
            System.out.print("\n");
            porc = (porc * 0);
            nsalario = (nsalario * 0);
        } else {
            porc = (salario * porci) / 100;
            nsalario = (salario + porc);
            System.out.print("\n\t\t*****DATOS*****");
            System.out.print("\n\t\t1-Salario Base:\t\t$" + salario + ".");
            System.out.print("\n\t\t2-Aumento 15%:\t\t$" + porc + ".");
            System.out.print("\n\t\t3-Salrio Neto:\t\t$" + nsalario + ".");
            System.out.print("\n");
            porc = (porc * 0);
            nsalario = (nsalario * 0);
        }
    }
}