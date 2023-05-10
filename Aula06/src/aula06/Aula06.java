/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06;

/**
 *
 * @author Adelton Silva
 */
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControloRemoto c = new ControloRemoto();
        
       c.ligar();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
    
}
