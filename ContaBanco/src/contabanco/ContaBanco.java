/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabanco;

/**
 *
 * @author Adelton Silva
 */
public class ContaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta p1 = new Conta();
        p1.setNumeroConta(111111111);
        p1.setDono("Adelton");
        p1.abrirConta("CC");
        
        
        Conta p2 = new Conta();
        p2.setNumeroConta(222222222);
        p2.setDono("Joana");
        p2.abrirConta("CP");
        
        p1.depositar(300);
        p2.depositar(500);
        p2.sacar(100);
        p1.sacar(350);
        p1.fecharConta();
        
        p2.estadoAtual();
        p1.estadoAtual();
    }
    
}
