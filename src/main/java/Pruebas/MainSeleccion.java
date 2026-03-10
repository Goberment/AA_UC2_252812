/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import Ordenamienti.OrdenamientoSeleccion;

/**
 *
 * @author jcmc3
 */
public class MainSeleccion {
    public static void main(String[] args) {
        OrdenamientoSeleccion ordenador = new OrdenamientoSeleccion();
        int[] datos = {64, 25, 12, 22, 11};

        System.out.println("Arreglo original:");
        imprimirArreglo(datos);

        ordenador.seleccion(datos);

        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(datos);
    }

    public static void imprimirArreglo(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
