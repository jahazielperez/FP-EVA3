/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_arreglo_ejercicios;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA3_13_ARREGLO_EJERCICIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];

        
        System.out.print("VALORES GENERADOS: ");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 10);
            System.out.print("[ " + arreglo[i] + " ]");
        }
        System.out.println();

        
                
        System.out.print("Ingresa un valor a buscar (0-9): ");
        int valorBuscado = scanner.nextInt();

        // Contar repeticiones
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                contador++;
            }
        }

        System.out.println("El valor " + valorBuscado + " se repite " + contador + " veces.");
    }
}
    
    

