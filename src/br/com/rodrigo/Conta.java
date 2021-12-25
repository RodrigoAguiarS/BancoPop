package br.com.rodrigo;

public abstract class Conta implements IConta {
    private int agencia;
    private int numero;
    private double saldo;

    public int getAgencia(){
        return agencia;
    }
    public int getNumero(){
        return numero;
    }
    private double getSaldo(){
        return saldo;
    }

    @Override
    public void sacar(double valor) {

    }
    @Override
    public void depositar(double valor) {
    }
    @Override
    public void transferir(Conta contaDestino, double valor) {
    }
}

