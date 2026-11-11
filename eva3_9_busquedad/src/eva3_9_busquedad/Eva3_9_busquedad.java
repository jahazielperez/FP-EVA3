/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_busquedad;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class Eva3_9_busquedad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int valor;
        boolean valorencontrado = false ;
        int[] valores = new int[10];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random() * 100);
           }
        for (int i = 0; i < valores.length; i++) {
            System.out.println("[" + valores[i] + "]");
    }
        
        do {
            //pedir el valor
            System.out.println("introduce el valor a buscar en el arreglo");
            valor = captu.nextInt();
            captu.nextLine();
            
            //buscar
            //recorrer todos los valores del arreglo 
            for (int i = 0; i < valores.length; i++) {
              if(valor == valores[i]){
                  System.out.println("encontraste el valor: esta en la posicion: " + i);
                  valorencontrado = true;
                  break;
              }
            }
            //si esta en el arreglo , salimos del ciclo
       if(valorencontrado)
           break;
        }while(true);
        
    }  
}
    
    

