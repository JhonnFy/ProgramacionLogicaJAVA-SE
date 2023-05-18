/*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/

 /*Dado como dato el sueldo de un trabajador, aplíquele un aumento del 15% si su
sueldo es inferior a $1000000. Imprima en este caso el nuevo sueldo del trabajador.*/
package Cap1Algoritmo1;

import java.util.*;

public class Cap1Algoritmo2 {

    public static void main(String[] args) {

        final int salIni = 1000000;
        int sIni = '0';
        int prom = '0';
        int sFin = '0';
        
        sIni = (sIni*0);
        prom = (prom*0);
        sFin = (sFin*0);
        
        Scanner Alg2 = new Scanner(System.in);

        System.out.print("\n\t\t****BIENVENIDO****");
        System.out.print("\n\t\t¿Sueldo Del Trbajador?\t\t");
        sIni = Alg2.nextInt();

        for (int a = 0; a < 10; a++) {
            System.out.print("\n");
        }

        if (sIni < salIni) {
            prom = (sIni * 15) / 100;
            sFin = (sIni + prom);
            System.out.print("\n\t****DATOS****");
            System.out.print("\n\tSueldo Inicial:\t\t$"+sIni+".");
            System.out.print("\n\tAumento De Sueldo:\t$"+prom+".");
            System.out.print("\n\tSueldo Neto:\t\t$"+sFin+".");
            System.out.print("\n\n");
        }else{
            System.out.print("\n\t****DATOS****");
            System.out.print("\n\tSueldo Inicial:\t\t$"+sIni+".");
            System.out.print("\n\tAumento De Sueldo:\t$"+prom+".");
            System.out.print("\n\tSueldo Neto:\t\t$"+sFin+".");
            System.out.print("\n\n");
        }
    }
}