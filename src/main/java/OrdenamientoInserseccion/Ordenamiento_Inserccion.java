
package OrdenamientoInserseccion;

/**
 *
 * @author jcmc3
 */
public class Ordenamiento_Inserccion {
   

    public static void main(String[] args) {
        int[] miArreglo = {12, 11, 13, 5, 6};

        System.out.println("Arreglo original:");
        imprimirArreglo(miArreglo);

        ordenarPorInsercion(miArreglo);

        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(miArreglo);
    }

    public static void ordenarPorInsercion(int[] arr) {
        int n = arr.length; //1
        
        for (int i = 1; i < n; i++) { //1 + n + (n-1) = 2n
            int llave = arr[i]; //n-1
            int j = i - 1; //n-1 

            while (j >= 0 && arr[j] > llave) { // 2 * [(n^2 - n) / 2]
                arr[j + 1] = arr[j];    // 2 * [(n^2 - n) / 2]
                j = j - 1;  // 2 * [(n^2 - n) / 2]
            }
            arr[j + 1] = llave; //n-1
        }
    }

    public static void imprimirArreglo(int[] arr) {
        for (int valor : arr) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}

/* EXPRESIÓN ALGEBRAICA FINAL: 
       T(n) = 1 + 2n + 3(n-1) + 3[(n^2 - n) / 2]
       Simplificando los términos dominantes para el reporte:
       T(n) = 1.5n^2 + 3.5n - 2
       
       NOTACIÓN ASINTÓTICA:
       O(n^2) 
       Justificación: El término de mayor orden en la expresión algebraica es n^2, 
       lo que indica que el tiempo de ejecución crece de forma cuadrática 
       respecto al tamaño de la entrada. 
*/
