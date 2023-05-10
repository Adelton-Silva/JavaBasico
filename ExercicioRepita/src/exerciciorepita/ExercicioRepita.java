/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author Adelton Silva
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int s=0;
        int cont = 0;
        int par = 0;
        int impar = 0;
        int acima = 0;
        int m;
        do {
             n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                     "<html>informe um numero: <br><em>(valor 0 interompe)</em></html> "));
             s +=n;
             cont++;
             if(n%2 == 0 && n !=0){
                 par++;
             }else if(n%2 != 0 && n !=0){
                 impar++;
             }
             if(n > 100){
                 acima++;
             }
        } while(n != 0);
        JOptionPane.showMessageDialog(null, 
                "<html>Resultado final <br><hr>"+"Total de entradas: "
                        +(cont-1)+"<br>Somatorio final: "+s
                        +"<br>Total par: "+par+
                        "<br>Total impar: "+impar+
                        "<br>Acima de 100: "+acima+
                        "<br>Média dos valores: "+(s/(cont-1))+"</htmal>","Tabela de Resultado",JOptionPane.WARNING_MESSAGE);
    }
    
}
