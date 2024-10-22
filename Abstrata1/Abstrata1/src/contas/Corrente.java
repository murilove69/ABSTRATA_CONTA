package contas;
public class Corrente extends Conta {
    private final double limite; // Limite extra após saldo esgotar
    private final double taxaSaque = 0.05;
    private final double taxaDeposito = 0.01; 
    private final double taxaConsulta = 0.0; 
    
    public Corrente(double primeiroSaldo, double limite) {
        super(primeiroSaldo);
        this.limite = limite;
    }

    @Override
    public void saque(double valor) {
        double valorComTaxa = valor + (valor * taxaSaque);
        if (valorComTaxa <= saldo + limite) {
            saldo -= valorComTaxa;
            System.out.println(String.format("Saque realizado: R$ %.2f com a taxa de: R$ %.2f adicionada.", valor, valor * taxaSaque));
        } else {
            System.out.println("Saque não permitido. Valor excede o saldo + limite.");
        }
    }

    @Override
    public void deposito(double valor) {
        double valorComTaxa = valor - (valor * taxaDeposito);
        saldo += valorComTaxa;
        System.out.println(String.format("Depósito realizado: R$%.2f com a taxa de: R$ %.2f adicionada.", valor, valor * taxaDeposito));
    }

    @Override
    public void consultarSaldo() {
        System.out.println(String.format("Saldo atual: R$%.2f", saldo));
    }
}
