package br.com.rodrigo;
public class Main {

    public static void main(String[] args) {
        Cliente rodrigo = new Cliente();
        rodrigo.setNome("Rodrigo");
        Conta cc = new ContaCorrente(rodrigo);
        cc.depositar(100);
        Conta poupança = new ContaPoupanca(rodrigo);
        cc.transferir(poupança, 10);
        cc.imprimirExtrato();
        poupança.imprimirExtrato();
    }
}
