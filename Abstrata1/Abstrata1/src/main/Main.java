package main;
import contas.*;
public class Main {
    public static void main(String[] args) {
//Exibindo a classe conta Poupança e mostrando as taxas determinadas, oque dará uma leve alteração no valor
    	Conta contaPoupanca = new Poupanca(2300);
        contaPoupanca.consultarSaldo();
        contaPoupanca.deposito(220);
        contaPoupanca.saque(90);
        contaPoupanca.consultarSaldo();
//Exibindo a classe conta corrente e mostrando as taxas determinadas, oque dará uma leve alteração no valor
        Conta contaCorrente = new Corrente(500, 400); 
        contaCorrente.consultarSaldo();
        contaCorrente.deposito(200);
        contaCorrente.saque(1400); 
        contaCorrente.consultarSaldo();
    }
}

