/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetolivro;

/**
 *
 * @author Adelton Silva
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Carlos", 32, "M");
        
        p[1] = new Pessoa("Joana", 29, "F");
        
        l[0] = new Livro("POO", "Gustavo", 130, p[0]);
        
        l[1] = new Livro("Algoritimo", "Adelton", 400, p[1]);
        
        l[2] = new Livro("Seguranca", "Alfredo", 213, p[0]);
        
        l[0].abrir();
        l[0].foliar(100);
        System.out.println(l[0].detalhes());
        
    }
    
}
