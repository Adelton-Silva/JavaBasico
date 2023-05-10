/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07;

/**
 *
 * @author Adelton Silva
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LutaMetodo l [] = new LutaMetodo[6];
        l[0]= new LutaMetodo("PretyBoy", "Franca", 31, 1.75f, 
                68.9f, 11, 2, 1);
        l[1] = new LutaMetodo("PutScript", "Brasil", 29, 1.68f,
                 57.8f,14,2,3);
        l[2] = new LutaMetodo("SnapShadow", "EAU", 35, 1.65f,
                 80.9f,12,2,1);
        l[3] = new LutaMetodo("Dead Code", "Australia", 28, 1.93f,
                 81.6f,13,0,2);
        l[4] = new LutaMetodo("UfoCobol", "Brasil", 37, 1.70f,
                 119.3f,5,4,3);
        l[5] = new LutaMetodo("Nerdaart", "EUA", 30, 1.81f,
                 105.7f,12,2,4);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();
    }
}
