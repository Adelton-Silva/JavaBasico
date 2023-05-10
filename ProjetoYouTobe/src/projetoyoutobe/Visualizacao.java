/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutobe;

/**
 *
 * @author Adelton Silva
 */
public class Visualizacao {
    private Gafanhoto espectador;
    private Videos filme;

    public Visualizacao(Gafanhoto espectador, Videos filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if(porc <= 50) {
            tot = 5;
        }else if(porc <= 90){
            tot = 8;
        } else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Videos getFilme() {
        return filme;
    }

    public void setFilme(Videos filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}
