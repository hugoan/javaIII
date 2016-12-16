package br.com.java3.collections;

import java.util.HashMap;
import java.util.Map;

public class TestaMap {

	public static void main(String[] args) {
		
		Conta c1 = new ContaPoupanca();
		c1.depositar(10000);
		
		Conta c2 = new ContaPoupanca();
		c2.depositar(30000);
		
		//Cria o Map
		Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();
		
		//adiciona chaves e seus valores
		mapaDeContas.put("Diretor", c2);
		mapaDeContas.put("Gerente", c1);
		
		// pesquisa a conta do diretor
		Conta contaDiretor = (Conta) mapaDeContas.get("Diretor");
		System.out.println(contaDiretor.getSaldo());
		
	}
}
