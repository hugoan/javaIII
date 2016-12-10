package br.com.java3.exercicio.banco;

public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void rodar(Conta c) {
		System.out.println("================================================");
		System.out.println("Saldo anterior: " + c.getSaldo());
		c.atualizar(this.selic);
		System.out.println("Saldo atualizado: " + c.getSaldo());
		this.saldoTotal += c.getSaldo();

	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}

}
