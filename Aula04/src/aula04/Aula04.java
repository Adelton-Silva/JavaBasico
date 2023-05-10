/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04;

/**
 *
 * @author Adelton Silva
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta("Bic", 0.5f, "Azul", true);
        c1.status();
        System.out.println("----------------------------------\n");
        Caneta c2 = new Caneta("Bac", 0.6f, "Preta", false);
        c2.status();
    }
    
}
