/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_restaurante;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA3_7_RESTAURANTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
    
        // Arreglo con los 10 productos
        String[] productos = {
            "Hamburguesa Clásica", 
            "Pizza Familiar", 
            "Tacos al Pastor", 
            "Ensalada César", 
            "Papas Fritas", 
            "Alitas de Pollo", 
            "Spaghetti Boloñesa", 
            "Sopa de Tortilla", 
            "Limonada Natural", 
            "Refresco de Lata"
        };
        
        // Arreglo con los precios correspondientes
        double[] precios = {
            125.50, 
            220.00, 
            85.50, 
            95.00, 
            45.00, 
            110.00, 
            135.00, 
            65.00, 
            35.00, 
            30.00
        };

        // Imprimir el menú de forma sencilla
        System.out.println("=== MENU DEL RESTAURANTE ===");
        
        // Recorrer los arreglos con un ciclo for normal
        for (int i = 0; i < productos.length; i++) {
            // Mostramos el número, el producto y el precio unidos con el signo '+'
            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
        }
        
        System.out.println("============================");
    }
}
    

