/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testetipo;

/**
 *
 * @author Adelton Silva
 */
public class TesteTipo {
    public static void main(String[] args){
        
        /*int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);*/
        
        String valor = "30";
        String val = "30.5";
        int idade = Integer.parseInt(valor);
        float age = Float.parseFloat(val);
        System.out.println("idade "+idade);
        System.out.printf("%.2f",age);
    } 
}
