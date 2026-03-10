/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

/**
 *
 * @author jcmc3
 */
public class Burbuja {
    public void ordenar(int[] arr){
    int n = arr.length;
    for(int i = 0; i < n - i - 1; i++){
        for (int j = 0; j < n-i-1; j++ ){
        if(arr[j] > arr[j + 1]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j + 1] = temp;
        
        
        /* Expresión algebraica resultante (Peor de los casos):
           T(n) = 3 + 3n + [ (n * (n - 1)) / 2 ] * (K)
           Donde K representa las operaciones internas (comparación + swap + incrementos).
           Simplificado: T(n) = (a)n² + (b)n + c
        */
        
        
                
                }
        
        }
    }
    }
    public void imprimirArreglo(int[] arr){
    for(int num : arr){
        System.out.print(num +" ");
    }
        System.out.println();
    }
    }

   