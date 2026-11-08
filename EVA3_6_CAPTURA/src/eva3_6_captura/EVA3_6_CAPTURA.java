/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_captura;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA3_6_CAPTURA {

    
    public static void main(String[] args) {
       Scanner captu = new Scanner(System.in);
       String nombres [];
       int edad[];
       int cant; 
       System.out.println("cantidad de clientes a capturar");
       cant = captu.nextInt();
       captu.nextLine();
       nombres = new String[cant];
        edad = new int[cant];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("introduce los nombres delos clientes:");
            nombres[i] = captu.nextLine();
            System.out.println("introduce la edad del cliente; ");
            edad[i] = captu.nextInt();
            captu.nextLine();
        }
        System.out.println("datos capturados");
           for (int i = 0; i < nombres.length; i++) {
            System.out.println("nombre: " + nombres[i] + ",edad: " + edad[i]); 
        }
               
    }
}

