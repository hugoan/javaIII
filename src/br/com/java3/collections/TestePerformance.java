package br.com.java3.collections;

import java.util.Collection;
import java.util.TreeSet;

public class TestePerformance {

	public static void main(String[] args) {

		System.out.println("Iniciando...");
		Collection<Integer> teste = new TreeSet<>();

		long inicio = System.currentTimeMillis();

		int total = 30000;

		long inicioAdd = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		long fimAdd = System.currentTimeMillis();

		long inicioContains = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		long fimContains = System.currentTimeMillis();

		long fim = System.currentTimeMillis();

		long tempoAdd = fimAdd - inicioAdd;
		long tempoContains = fimContains - inicioContains;
		long tempo = fim - inicio;

		System.out.println("Tempo gasto para add: " + tempoAdd);
		System.out.println("Tempo gasto para contains: " + tempoContains);
		System.out.println("Tempo gasto: " + tempo);

	}
}
