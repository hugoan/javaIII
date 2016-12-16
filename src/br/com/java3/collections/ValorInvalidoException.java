package br.com.java3.collections;

public class ValorInvalidoException extends RuntimeException {
	
	public ValorInvalidoException(double valor){
		super("Valor inválido: " + valor);
	}
}
