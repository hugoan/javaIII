package br.com.java3.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	private List<Conta> contas = new ArrayList<>();
	private Map<String, Conta> indexadoPorNome = new HashMap<>();

	public void adicionar(Conta c) {
		contas.add(c);
		indexadoPorNome.put(c.getNome(), c);
	}

	public Conta pegar(int posicao) {
		return contas.get(posicao);
	}

	public int getQuantidadeDeContas() {
		return contas.size();
	}

	public Conta buscarPorNome(String nome){
		return indexadoPorNome.get(nome);
	}

}
