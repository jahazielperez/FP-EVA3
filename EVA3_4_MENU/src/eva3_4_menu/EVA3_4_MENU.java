/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_menu;

/**
 *
 * @author jahaziel
 */
public class EVA3_4_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] menu = {"tscos", "tortss", "tamales", "tlacoyos","flauta"};
                        //0      // 1      // 2       // 3        //4   
        System.out.println("cantidad de elementos del arreglo: " +  menu.length);
        for (int i = 0; i < menu.length; i++){
          System.out.println(menu[i]);
        }
           System.out.println("Elemento en la posicion 4: " + menu[4]);
        }
    }
    

