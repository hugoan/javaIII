package br.com.java3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestaOrdenacao {

	public static void main(String[] args) {
		ContaPoupanca cp1 = new ContaPoupanca();
		ContaPoupanca cp2 = new ContaPoupanca();
		ContaPoupanca cp3 = new ContaPoupanca();

		Random rdm = new Random();

		cp1.nome = "José";
		cp1.numero = 789;
		cp1.saldo = 300;

		cp2.nome = "Maria";
		cp2.numero = 456;
		cp2.saldo = (rdm.nextInt(10000) + rdm.nextDouble());

		cp3.nome = "João";
		cp3.numero = 123;
		cp3.saldo = 100;

		List<ContaPoupanca> contas = new ArrayList<>();

		contas.add(cp2);
		contas.add(cp3);
		contas.add(cp1);

		Collections.sort(contas);

		System.out.println("=========== GERA LISTA ORDENADA COM BASE NO NUM DA CONTA ================");
		for (ContaPoupanca conta : contas) {
			System.out.println(conta);
		}

		System.out.println("");

	}
}
