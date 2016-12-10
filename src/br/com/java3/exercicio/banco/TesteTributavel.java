package br.com.java3.exercicio.banco;

public class TesteTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(100);
		System.out.println(cc.calculoTributos());

		Tributavel t = cc;
		System.out.println(t.calculoTributos());

	}
}
