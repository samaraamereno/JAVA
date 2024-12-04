package br.com.fiap.banco;

public class Contas implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int agencia;
	private int numero;
	private double saldo;
	
	public Contas () {

}
	
	public Contas (int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public int getAgencia() {
		return agencia;
		
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
		
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		
	}
	
	public void retirar (double valor) {
		this.saldo -= valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
}


