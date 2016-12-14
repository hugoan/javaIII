package br.com.java.javaio;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class TesteIOComSaida {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		Scanner entrada = new Scanner(is);

		System.out.println("Digite a mensagem:");
		while (entrada.hasNextLine()) {
			System.out.println(entrada.nextLine());
		}

		entrada.close();
	}

}
