/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06;

/**
 *
 * @author Adelton Silva
 */
public class ControloRemoto implements Controlador {
    //Atributos
    private boolean ligado;
    private int volume;
    private boolean tocando;
    
    //Metodos especias

    public ControloRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Metodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()){
        System.out.println("------MENU--------");
        System.out.println("Está ligado? "+this.isLigado());
        System.out.println("Está tocando? "+this.isTocando());
        System.out.print("volume: "+this.getVolume());
        for (int i = 0; i <= this.getVolume(); i +=10) {
            System.out.print("|");
        }
        }else{
            System.out.println("Lique o controle remoto primeiro");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando MENU...");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() + 5);
        } else{
            System.out.println("Impossivel aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossivel baixar o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        } else{
            System.out.println("Nao consegui reproduzir!");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }else{
            System.out.println("Nao consegui pausar");
        }
    }
    
    
}
