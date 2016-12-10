package br.com.java3.exercicio.banco;

import br.com.java3.excercoes.ValorInvalidoException;

public abstract class Conta {

	protected double saldo;

	private int numero;

	private String nome;

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void depositar(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}

	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	public abstract void atualizar(double taxa);

	@Override
	public String toString() {
		return "esse objeto é uma conta com o saldo R$: " + this.saldo;
	}

	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero && this.nome.equals(outraConta.nome);


	}

}
