/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import AlgoritmosBurbuja.Burbuja;
import java.util.Scanner;

/**
 *
 * @author jcmc3
 */
public class MainBurbuja {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Burbuja ordenador = new Burbuja();

        
        System.out.print("¿Cuantos numeros (n) deseas ingresar?: ");
        int n = s.nextInt();
        int[] datos = new int[n];

        System.out.println("Ingresa los " + n + " numeros:");
        for (int i = 0; i < n; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            datos[i] = s.nextInt();
        }

        System.out.println("\nArreglo original:");
        ordenador.imprimirArreglo(datos);

        ordenador.ordenar(datos);

        System.out.println("Arreglo ordenado:");
        ordenador.imprimirArreglo(datos);
        
        s.close();
    }
}
