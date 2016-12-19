package br.com.java3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteArrayListDecrescente {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();

		for (int i = 0; i < 1000; i++) {
			lista.add(i);
		}

		Collections.reverse(lista);

		for (Integer i : lista) {
			System.out.print(i + " ");
		}

	}
}
