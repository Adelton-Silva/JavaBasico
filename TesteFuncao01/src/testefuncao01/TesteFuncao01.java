/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author Adelton Silva
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    static void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma e "+s);
    }
    static int soma1 (int a, int b){
        int s = a + b;
        return s;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Comecou o programa:");
        soma(5,8);
        System.out.println("A soma e "+soma1(6,10));
    }
    
}
