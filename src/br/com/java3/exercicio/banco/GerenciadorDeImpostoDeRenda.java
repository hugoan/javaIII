package br.com.java3.exercicio.banco;

public class GerenciadorDeImpostoDeRenda {
	private double total;

	void adicionar(Tributavel t) {
		System.out.println("Adiciona tributavel: " + t);

		this.total += t.calculoTributos();
	}

	public double getTotal() {
		return this.total;
	}
	
	
}
