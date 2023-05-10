/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Adelton Silva
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Entre a segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/2;
        System.out.println("A sua media e "+m);
        if(m >= 9){
            System.out.println("Meus Parabens");
        }
    }
    
}
