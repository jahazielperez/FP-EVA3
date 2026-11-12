/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_17_arreglo5;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA3_17_ARREGLO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ciudades = {"Chihuahua", "Ojinaga", "Juarez", "Delicias", "Cuauhtemoc"};
        double[][] temperaturas = new double[5][7];

        // Captura de datos
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Temperaturas para " + ciudades[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Dia " + (j + 1) + ": ");
                temperaturas[i][j] = scanner.nextDouble();
            }
        }

        // Cálculo de promedios
        System.out.println("--- PROMEDIOS ---");
        for (int i = 0; i < ciudades.length; i++) {
            double suma = 0;
            for (int j = 0; j < 7; j++) {
                suma += temperaturas[i][j];
            }
            double promedio = suma / 7;
            System.out.println(ciudades[i] + ": Promedio = grados" + promedio);
        }
    }
}
    
    

