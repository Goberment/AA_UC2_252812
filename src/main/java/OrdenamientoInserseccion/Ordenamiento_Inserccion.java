
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
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int llave = arr[i]; 
            int j = i - 1;

            while (j >= 0 && arr[j] > llave) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = llave;
        }
    }

    public static void imprimirArreglo(int[] arr) {
        for (int valor : arr) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}

