package contas;

public class Poupanca extends Conta {
    // Criando as taxas que serão cobradas de acordo com a sua funcionalidade
    private final double taxaSaque = 0.03; 
    private final double taxaDeposito = 0.010;
    private final double taxaConsulta = 0.0; 

    public Poupanca(double primeiroSaldo) {
        super(primeiroSaldo);
    }

    // Usando o @Override para alterar ou personalizar o comportamento de um método herdado de uma superclasse.
    @Override
    public void saque(double valor) {
        // Criando o "if" para realizar o saque e cobrar a taxa ou não permitir dependendo da ação do cliente
        double valorComTaxa = valor + (valor * taxaSaque);
        if (valorComTaxa <= saldo) {
            saldo -= valorComTaxa;
            System.out.println(String.format("Saque realizado: R$%.2f com a taxa de R$%.2f adicionada.", valor, valor * taxaSaque));
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente.");
        }
    }

    @Override
    public void deposito(double valor) {
        double valorComTaxa = valor - (valor * taxaDeposito);
        saldo += valorComTaxa;
        System.out.println(String.format("Depósito realizado: R$%.2f com a taxa de R$%.2f adicionada.", valor, valor * taxaDeposito));
    }

    @Override
    public void consultarSaldo() {
        System.out.println(String.format("Saldo atual: R$%.2f", saldo));
    }
}
