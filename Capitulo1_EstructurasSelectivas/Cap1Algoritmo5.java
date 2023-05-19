/**Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/

/*Dados los datos A, B y C que representan números enteros diferentes, 
imprimir estos números en forma descendente.*/

package Cap1Algoritmo1;
import java.util.*;
import java.math.*;


public class Cap1Algoritmo5 {
    public static void main(String[] args) {
        
        Scanner Alg5 = new Scanner(System.in);
        
        int[] numeros = new int[3];
        System.out.print("\t*****BIENVENIDO*****\n");
        System.out.print("\t¿Valor De A?\t");
        numeros[0] = Alg5.nextInt();
        System.out.print("\t¿Valor De B?\t");
        numeros[1] = Alg5.nextInt();
        System.out.print("\t¿Valor De C?\t");
        numeros[2] = Alg5.nextInt();
        
        for(int i=0; i<20; i++){
            System.out.print("\n");
        }
        
        System.out.print("\n\t*****DATOS*****");
        System.out.print("\n\t¿Valor De C?\t\t"+numeros[2]+".");
        System.out.print("\n\t¿Valor De B?\t\t"+numeros[1]+".");
        System.out.print("\n\t¿Valor De A?\t\t"+numeros[0]+".\n");
    }
}