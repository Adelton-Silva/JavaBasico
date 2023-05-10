/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author Adelton Silva
 */
public class Caneta {
    public String model;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String model, float ponta, String cor, boolean tampada) {
        this.model = model;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = tampada;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    public void status(){
        System.out.println("Modelo: "+this.getModel());
        System.out.println("Cor: "+this.getCor());
        System.out.println("Ponta "+this.getPonta());
        System.out.println("Tampada: "+this.isTampada());
    }
}
