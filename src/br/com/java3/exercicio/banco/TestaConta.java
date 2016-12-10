package br.com.java3.exercicio.banco;

public class TestaConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();

		System.out.println("//// CONTA CORRENTE ////");
		cc.depositar(1000);
		System.out.println("Saldo: " + cc.getSaldo());

		cc.sacar(500);
		System.out.println("Saldo depois do saque: " + cc.getSaldo());

		cc.atualizar(0.10);
		System.out.println("Saldo atualizado: " + cc.getSaldo());

		System.out.println();
		
		System.out.println("//// CONTA POUPANÇA ////");
		ContaPoupanca cp = new ContaPoupanca();
		cp.depositar(1000);
		System.out.println("Saldo: " + cp.getSaldo());

		cp.sacar(500);
		System.out.println("Saldo depois do saque: " + cp.getSaldo());

		cp.atualizar(0.10);
		System.out.println("Saldo atualizado: " + cp.getSaldo());
	}

}
