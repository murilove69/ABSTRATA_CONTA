package contas;

public abstract class Conta {
	//Criando o atributo que será presente em todas as classes, ou seja, o saldo
	protected double saldo;

	public Conta(double primeiroSaldo) {
		this.saldo = primeiroSaldo;
	}

	// Criando os métodos abstratos, que neste caso, são o 
	// modelo ou base para outras classes derivadas (subclasses), que devem implementar ou complementar os métodos abstratos nela definidos.
	public abstract void saque(double valor);

	public abstract void deposito(double valor);

	public abstract void consultarSaldo();
}
