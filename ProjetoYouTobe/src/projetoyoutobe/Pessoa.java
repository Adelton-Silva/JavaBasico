/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutobe;

/**
 *
 * @author Adelton Silva
 */
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experencia;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experencia = 0;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperencia() {
        return experencia;
    }

    public void setExperencia(float experencia) {
        this.experencia = experencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" 
                + sexo + ", experencia=" + experencia + '}';
    }
    
    
}
