/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polomorfismoaula12;

/**
 *
 * @author Adelton Silva
 */
public class PolomorfismoAula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Repetil r = new Repetil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
       Canguru c = new Canguru();
       Cachoro k = new Cachoro();
       Cobra s = new Cobra();
       Arara b = new Arara();
       Tartaruga t = new Tartaruga();
       GoldFish g = new GoldFish();
       
       c.locomover();
       k.locomover();
       k.emitirSom();
       c.emitirSom();
    }
    
}
