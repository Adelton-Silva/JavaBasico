/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author Adelton Silva
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre o ano de nascimento: ");
        int ano = teclado.nextInt();
        int idade = 2023 - ano;
        System.out.println("Voce tem "+idade+" anos");
        if(idade >= 18){
            System.out.println("Voce ja e maior de idade!");
        }else{
            System.out.println("Voce e menor de idade, seja paciente a sua hora vai chegar");
        }
    }
    
}
