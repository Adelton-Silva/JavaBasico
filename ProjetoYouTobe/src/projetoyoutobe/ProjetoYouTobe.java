/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoyoutobe;

/**
 *
 * @author Adelton Silva
 */
public class ProjetoYouTobe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Videos v[] = new Videos[3];
        
        v[0] = new Videos("Aula 01 POO");
        v[1] = new Videos("Aula 13 de PHP");
        v[2] = new Videos("Aula 07 de HTML");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Maria", 21, "F", "MariaCampia");
        
        Visualizacao vis[] = new Visualizacao[5]; 
        vis[0] = new Visualizacao(g[1], v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[1], v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());
        
        /*System.out.println("Videos\n--------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGafanhotos\n--------------------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
    
}
