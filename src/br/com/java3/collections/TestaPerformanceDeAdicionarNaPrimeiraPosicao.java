package br.com.java3.collections;

import java.util.ArrayList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();

		List<Integer> teste = new ArrayList<>();

		long inicioAdd = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		long fimAdd = System.currentTimeMillis();

		long inicioPercorrer = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {
			teste.get(i);
		}
		long fimPercorrer = System.currentTimeMillis();

		long fim = System.currentTimeMillis();

		long tempoAdd = fimAdd - inicioAdd;
		long tempoPercorrer = fimPercorrer - inicioPercorrer;
		long tempo = fim - inicio;
		System.out.println("Tempo gasto para Add: " + tempoAdd);
		System.out.println("Tempo gasto para percorrer: " + tempoPercorrer);
		System.out.println("Tempo gasto: " + tempo);
	}
}
