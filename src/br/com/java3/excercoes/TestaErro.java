package br.com.java3.excercoes;

public class TestaErro {
	public static void main(String[] args) {
		System.out.println("inicio do main");
		metodo1();
		System.out.println("fim do mains");
	}

	static void metodo1() {
		System.out.println("inicio do metodo 1");
		metodo2();
		System.out.println("fim do metodo 1");
	}

	static void metodo2() {
		System.out.println("inicio do metodo 2");
		int[] array = new int[10];

		for (int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
		}

		System.out.println("fim do metodo 2");
	}

}
