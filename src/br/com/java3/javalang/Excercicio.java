package br.com.java3.javalang;

import br.com.java3.exercicio.banco.Conta;
import br.com.java3.exercicio.banco.ContaCorrente;

public class Excercicio {
	public static void main(String[] args) {
		System.out.println("============ TESTE STRING ============");
		String s = "fj11";
		String outra = s.replace("1", "2");
		System.out.println(outra);

		String testeContains = "Deus é bom!";
		String teste1 = "x";
		System.out.println(testeContains.contains(teste1));

		String testeTrim = " Deus é Bom! ";
		String teste2 = testeTrim.trim();
		System.out.println(teste2);

		String testeIsEmpty = "Deus é bom!";
		System.out.println(testeIsEmpty.isEmpty());

		String testeLength = "Deus é bom!";
		System.out.println(testeLength.length());
		System.out.println("");

		System.out.println("============ TESTE INTEGER ============");
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		if (x1 == x2) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}

		if (x1.equals(x2)) {
			System.out.println("Igual");
		} else {
			System.out.println("Difenrente");
		}

		System.out.println("============ EXERCICIO 6 ============");

		Conta conta = new ContaCorrente();
		System.out.println(conta);

		System.out.println("============ EXERCICIO 8 ============");

		Conta conta1 = new ContaCorrente();
		Conta conta2 = new ContaCorrente();

		conta1.setNumero(123);
		conta1.setNome("Hugo");

		conta2.setNumero(123);
		conta2.setNome("Hugo");

		if (conta1.equals(conta2)) {
			System.out.println("As contas são iguais");
		} else {
			System.out.println("As contas são diferentes");
		}

		System.out.println("============ EXERCICIO 11 ============");

		Metodos.imprimirLetraPorLetra("Alura");

		System.out.println("-------");

		Metodos palavra = new Metodos();
		palavra.imprimirLetraPorLetra2("Deus é bom!");

		System.out.println("============ EXERCICIO 12 ============");
		Metodos.imprimirDeTrasParaFrente("Deus");
		System.out.println("");

		System.out.println("============ EXERCICIO 13 ============");

		Metodos.inverterPalavrasDaFrase("Socorram-me, subi no ônibus em Marrocos");
		System.out.println("");

		System.out.println("============ EXERCICIO 14 ============");

		Metodos.inverteComStringBuilder("Socorram-me, subi no ônibus em Marrocos");
		System.out.println("");

		System.out.println("============ EXERCICIO 15 ============");

		String numero = "762";
		System.out.println("imprimindo a String: " + numero);

		int resultado = Metodos.converteParaInt(numero);
		System.out.println("Resultado em int: " + resultado);
	}

}
