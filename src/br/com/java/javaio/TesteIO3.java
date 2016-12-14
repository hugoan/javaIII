package br.com.java.javaio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteIO3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
								new InputStreamReader(
										new FileInputStream("arquivo.txt")));

		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();
	}

}
