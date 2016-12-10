package br.com.java3.exercicio.banco;

public class ContaPoupanca extends Conta {

	public void atualizar(double taxa) {
		this.saldo = this.saldo * taxa * 3;
	}

	public void depositar(double valor) {
		super.depositar(valor - 0.10);
	}

}
