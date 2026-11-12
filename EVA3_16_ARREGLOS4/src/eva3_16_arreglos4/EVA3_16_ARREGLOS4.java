/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_16_arreglos4;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA3_16_ARREGLOS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] asistencia = new int[3][5]; // 3 alumnos, 5 días

    
        for (int i = 0; i < 3; i++) {
            System.out.println("--- Estudiante " + (i + 1) + " ---");
            for (int j = 0; j < 5; j++) {
                System.out.print("Dia: " + (j + 1) + " (1 = Asistio , 0 = Falto ): ");
                asistencia[i][j] = scanner.nextInt();
            }
            System.out.println("");
        }

        
        System.out.println("--- RESULTADOS ---");
    for (int i = 0; i < 3; i++) {
            int asistencias = 0;
            int inasistencias = 0;

            for (int j = 0; j < 5; j++) {
                if (asistencia[i][j] == 1) {
                    asistencias++;
                } else {
                    inasistencias++;
                }
            }

            System.out.println("Estudiante " + (i + 1) + ": " + asistencias + " asistencias, " + inasistencias + " inasistencias.");
        }
    }
}
    
    

