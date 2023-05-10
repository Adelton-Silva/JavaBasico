/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetormes02;

import java.util.Scanner;

/**
 *
 * @author Adelton Silva
 */
public class VetorMes02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Entre o ano atual ");
        int ano = tec.nextInt();
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun",
            "Jul","Ago","set","Out","Nuv","Dec"};
        String dia[] = {"31","28","31","30","31","30","31","31","30","31","30","31"};
        if (ano % 4 == 0){
            dia[1] = "29";
        }
        for(int c = 0; c < mes.length; c++){
            System.out.println("O mes "+mes[c]+
                    " tem "+dia[c]+" dias ao todo.");
        }
    }
    
}
