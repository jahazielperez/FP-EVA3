/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_arreglo_ejercicios;

/**
 *
 * @author jahaziel
 */
public class EVA3_14_ARREGLO_EJERCICIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        System.out.print("valores: ");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100) + 1;
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println();

        int menor = arreglo[0];
        int mayor = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }

        System.out.println("El mas chico es: " + menor);
        System.out.println("El mas grande es: " + mayor);
    }
}
    
    

