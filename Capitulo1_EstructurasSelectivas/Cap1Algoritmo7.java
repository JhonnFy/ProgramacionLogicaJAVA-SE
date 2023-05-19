/*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/

 /*Dado como datos la matrícula y 5 calificaciones de un alumno; 
Imprima la matrícula, el promedio y la palabra “aprobado”
Si el alumno tiene un promedio mayor o igual que 6,"Aprobado" en caso contrario "No Aprobado".*/
package Cap1Algoritmo1;

import java.util.*;
import java.math.*;

public class Cap1Algoritmo7 {

    public static void main(String[] args) {

        Scanner Alg7 = new Scanner(System.in);

        int opc = 0;
        int mtc = 0;
        float nts = 0;
        float prm = 0;

        System.out.print("\n\t\t*****BIENVENIDO*****");
        System.out.print("\n\t\t1-Consultar mi estado");
        System.out.print("\n\t\t2-Salir");
        System.out.print("\n\n\t\tSeleccionar una opción\t\t");
        opc = Alg7.nextInt();

        for (int a = 0; a < 20; a++) {
            System.out.print("\n");
        }

        switch (opc) {
            case 1:
                if (opc == 1) {
                    System.out.print("\t\t*****MODULO #1*****");
                    System.out.print("\n\t\t1-Registrar Matricula");
                    System.out.print("\n\tNúmero Identificación\t\t");
                    mtc = Alg7.nextInt();
                    System.out.print("\n\t\t1-Registrar Calificaciones");
                    float[] calf = new float[5];
                    System.out.print("\n\tCalificación 1:\t");
                    calf[0] = Alg7.nextFloat();
                    System.out.print("\tCalificación 2\t");
                    calf[1] = Alg7.nextFloat();
                    System.out.print("\tCalificación 3\t");
                    calf[2] = Alg7.nextFloat();
                    System.out.print("\tCalificación 4\t");
                    calf[3] = Alg7.nextFloat();
                    System.out.print("\tCalificación 5\t");
                    calf[4] = Alg7.nextFloat();

                    nts = (calf[0] + calf[1] + calf[2] + calf[3] + calf[4]);
                    prm = (nts) / 5;
                }

                for (int b = 0; b < 20; b++) {
                    System.out.print("\n");
                }

                System.out.print("\n\t\t*****MODULO #1*****");
                System.out.print("\n\t\t#Registro\t"+mtc+".");
                System.out.print("\n\t\tAcumulado\t"+nts+".");
                System.out.print("\n\t\tPromedio\t"+prm+".");
                
                if (prm >= 6) {
                    System.out.print("\n\t\tAPROBADO\n\t");
                } else {
                    System.out.print("\n\t\tREPROBADO\n\t");
                }
                break;

            case 2:
                System.out.print("\t\tEXIT\n\t\t");
                break;
        }
    }
}