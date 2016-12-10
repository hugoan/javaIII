package br.com.java3.javalang;

public class Metodos {

	public static void imprimirLetraPorLetra(String palavra) {
		for (int i = 0; i < palavra.length(); i++)
			System.out.println(palavra.charAt(i));
	}

	// Nesse caso, não tem a palavra static o que obriga a classe que implemente
	// a criar uma instancia do objeto Método.
	public void imprimirLetraPorLetra2(String palavra) {
		for (int i = 0; i < palavra.length(); i++)
			System.out.println(palavra.charAt(i));
	}

	public static void imprimirDeTrasParaFrente(String palavra) {
		for (int i = palavra.length() - 1; i >= 0; i--) {
			System.out.print(palavra.charAt(i));
		}
	}

	public static void inverterPalavrasDaFrase(String texto) {
		String[] palavras = texto.split("");
		for (int i = palavras.length - 1; i >= 0; i--) {
			System.out.print(palavras[i] + " ");
		}
		System.out.println("");
	}

	public static void inverteComStringBuilder(String texto) {
		System.out.print("\t"); // comando de tab na impressão do texto
		StringBuilder invertido = new StringBuilder(texto).reverse();
		System.out.println(invertido);
	}

	
	public static int converteParaInt(String numero) {
		int resultado = 0;
		while (numero.length() > 0) {
			char algarismo = numero.charAt(0);
			resultado = resultado * 10 + (algarismo - '0');
			numero = numero.substring(1);
		}
		return resultado;
	}
}
