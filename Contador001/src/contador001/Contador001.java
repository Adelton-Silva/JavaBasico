/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador001;

/**
 *
 * @author Adelton Silva
 */
public class Contador001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        while(cc < 10){
            cc++;
            if(cc == 2 || cc == 3 || cc == 4){
                continue;
            }
            if(cc == 7){
                break;
            }
            System.out.println("Camalhota " +cc);
        }
    }
    
}
