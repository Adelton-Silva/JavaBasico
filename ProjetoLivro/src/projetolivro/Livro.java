/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolivro;

/**
 *
 * @author Adelton Silva
 */
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPagina;
    private int pagAtual;
    private boolean aberto;
    Pessoa leitor;

    public String detalhes() {
        return "Livro{" + "titulo = " + titulo + ", "
                + "autor = " + autor + ",\n totPagina = " +
                totPagina + ", pagAtual = " + pagAtual + ",\n aberto = " 
                + aberto + ",\n nome do leitor = " + leitor.getNome() + 
                ",  idade do  leitor = "+leitor.getIdade()+
                ",  Sexo do leitor = "+leitor.getSexo()+'}';
    }
    
 

    public Livro(String titulo, String autor, int totPagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPagina = totPagina;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPagina() {
        return totPagina;
    }

    public void setTotPagina(int totPagina) {
        this.totPagina = totPagina;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void foliar(int p) {
        if (this.totPagina > p) {
            this.pagAtual = p;
        } else {
            System.out.println("Esta pagina nao existe!");
        }
    }

    @Override
    public void avancarpag() {
        this.pagAtual++;
    }

    @Override
    public void voltarpag() {
        this.pagAtual--;
    }
    
    
    
}
