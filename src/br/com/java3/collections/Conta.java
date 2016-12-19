package br.com.java3.collections;

public abstract class Conta implements Comparable<Conta> {

	protected double saldo;
	protected int numero;
	protected String nome;

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public String getNome() {
		return this.nome;
	}

	public void depositar(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}

	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	public abstract void atualizar(double taxa);

	@Override
	public int compareTo(Conta outra) {
		return this.nome.compareTo(outra.nome);
	}

	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", saldo=" + saldo + ", numero=" + numero + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

}
