/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcao01;

import classes.Factorial;

/**
 *
 * @author Adelton Silva
 */
public class Funcao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Factorial f = new Factorial();
        f.setValor(5);
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
    }
    
}
