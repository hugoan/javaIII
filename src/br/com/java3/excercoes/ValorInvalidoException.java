package br.com.java3.excercoes;

@SuppressWarnings("serial")
public class ValorInvalidoException extends RuntimeException {
	
	public ValorInvalidoException(double valor){
		super("Valor inválido: " + valor);
	}
}
