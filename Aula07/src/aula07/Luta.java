/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

import java.util.Random;

/**
 *
 * @author Adelton Silva
 */
public class Luta {
    //Atributos
    private LutaMetodo desafiante;
    private LutaMetodo desafiado;
    private int round;
    private boolean aprovado;
    
    //Métudos publícos
    public void marcarLuta(LutaMetodo l1, LutaMetodo l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovado){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0, 1, 2
            System.out.println("===== RESULTADO DA LUTA ======");
            switch(vencedor){
                case 0: // empate
                    System.out.println("Empatado");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiado vence
                    System.out.println("Vitoria do "+this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante vence
                    System.out.println("Vitoria do "+this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("===================================");
        }else{
            System.out.println("A luta nao pode acontecer!");
        }
    }
    
    //Métudos especiais

    public LutaMetodo getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(LutaMetodo desafiante) {
        this.desafiante = desafiante;
    }

    public LutaMetodo getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(LutaMetodo desafiado) {
        this.desafiado = desafiado;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
