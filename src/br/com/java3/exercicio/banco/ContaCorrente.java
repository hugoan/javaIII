package br.com.java3.exercicio.banco;

public class ContaCorrente extends Conta implements Tributavel {

	public void atualizar(double taxa) {
		this.saldo = this.saldo * taxa * 2;
	}

	@Override
	public double calculoTributos() {
		return this.getSaldo() * 0.01;
	}
}
