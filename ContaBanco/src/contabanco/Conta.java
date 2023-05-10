/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabanco;

/**
 *
 * @author Adelton Silva
 */
public class Conta {
    public int numeroConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("-------------------------------------");
        System.out.println("Numero da conta: "+this.getNumeroConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.isStatus());
    }
    
    public Conta() {
        this.saldo = 0;
        this.status = false; 
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t)){
            this.setSaldo(50);
        } else if("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("ERRO!, Conta com dinheiro nao pode ser fechado");
        } else if(this.getSaldo() < 0){
            System.out.println("ERRO!, Conta tem debito nao pode ser fechado");
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if (this.isStatus() == true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de "+this.getDono());
        } else {
            System.out.println("Inpossivel depositar numa conta fechada!");
        }
        
    }
    public void sacar(float v){
        if(isStatus() == true){
            if(getSaldo()>= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de "+this.getDono()+" no valor de "+v);
            }else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else{
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
    }
    public void pagarMensal(){
        float v = 0;
        if("CC".equals(this.getTipo())){
            v = 12f;
        }else if("CP".equals(this.getTipo())){
            v = 20f;
        }
        if(this.isStatus() == true){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Mensalidade paga com sucesso pelo "+this.getDono());
            }else{
                System.out.println("Saldo Insuficiente");
            }
        }else{ 
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }

}
