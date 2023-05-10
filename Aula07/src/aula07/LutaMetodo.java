/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author Adelton Silva
 */
public class LutaMetodo {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empate;

    public LutaMetodo(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empate = empate;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2f) {
            this.categoria = "Invalido";
        }else if(this.peso <= 70.3){
           this.categoria = "Leve"; 
        }else if(this.peso < 83.9){
            this.categoria = "Medio";
        }else if(this.peso < 120.2){
            this.categoria = "Pesado";
        } else{
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public void apresentar() {
        System.out.println("---------------------------------------------------------");
        System.out.println("Chegou a hora! vamos apresentar o lutador : "+this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("Com: "+this.getIdade()+ " anos e "+this.getAltura()+"m" );
        System.out.println("Pesando: "+ this.getPeso()+ " kg");
        System.out.println(this.getVitorias()+" vitorias");
        System.out.println(this.getDerrotas()+" derotas");
        System.out.println(this.getEmpate()+" emapates");
    }

    public void status() {
        System.out.println("-----------------------------------------");
        System.out.println(this.getNome()+ "e um peso "+this.getCategoria());
        System.out.println("Ganhou: "+this.getVitorias()+" vezes");
        System.out.println("Perdeu: "+this.getDerrotas()+" vezes");
        System.out.println("Empatou: "+this.getEmpate()+" vezes");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpate(this.getEmpate() + 1);
    }
    
    
    
}
