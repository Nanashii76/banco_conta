package entities;

public class Conta {

	private int numeroConta;
	private String nome;
	private double depositoInicial;
	private double saldo;
	
	//  ->  criando construtores
	
	public Conta() {
	}
	
	public Conta(int numeroConta, String nome, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.depositoInicial = depositoInicial;
		this.saldo = depositoInicial;
	}
	
	public Conta(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = 0;
	}
	
	// ->  cirando getters e setters
	
	// pegando o número da conta que não pode ser mais alterado
	public int getNumeroConta() {
		return numeroConta;
	}
	
	// pegando o nome da conta e alterando também
	public String getNome() {
		return nome;
	}
		
	public double getDepositoInicial() {
		return depositoInicial;
	}
	
	// Vendo o Saldo atual
	public double getSaldo() {
		return saldo;
	}
	
	//  -> criando metodos
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	
	public void saque(double saque) {
		this.saldo -= 5+saque;
	}
	
	public String toString() {
		return "Account " + 
				getNumeroConta() +
				", " + "Holder: " + getNome() +
				", " + "Balance: $ " + getSaldo();
	}
	
	
}
