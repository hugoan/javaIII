package br.com.java3.exercicio.banco;

public class TesteDeImpostoDeRenda {
	public static void main(String[] args) {
		
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adicionar(sv);
		
		ContaCorrente cc = new ContaCorrente();
		gerenciador.adicionar(cc);
		
		System.out.println(gerenciador.getTotal());
	}
}
