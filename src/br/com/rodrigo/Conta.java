package br.com.rodrigo;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;

    }

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

