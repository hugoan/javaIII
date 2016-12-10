package br.com.java3.exercicio.banco;

public class TesteConta3 {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		cc.depositar(1000);
		cp.depositar(1000);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		adc.rodar(cc);
		adc.rodar(cp);

		System.out.printf("Saldo total: %.2f", adc.getSaldoTotal());

	}
}
