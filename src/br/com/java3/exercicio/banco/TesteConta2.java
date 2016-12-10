package br.com.java3.exercicio.banco;

public class TesteConta2 {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		cc.depositar(1000);
		cp.depositar(1000);

		cc.atualizar(0.01);
		cp.atualizar(0.01);

		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}

}
