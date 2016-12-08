package br.com.java3.javalang;

public class excercicio {
	public static void main(String[] args) {
		System.out.println("============ TESTE STRING ============");
		String s = "fj11";
		String outra = s.replace("1", "2");
		System.out.println(outra);

		String testeContains = "Deus é bom!";
		String teste1 = "x";
		System.out.println(testeContains.contains(teste1));

		String testeTrim = " Deus é Bom! ";
		String teste2 = testeTrim.trim();
		System.out.println(teste2);

		String testeIsEmpty = "Deus é bom!";
		System.out.println(testeIsEmpty.isEmpty());

		String testeLength = "Deus é bom!";
		System.out.println(testeLength.length());
		System.out.println("");

		System.out.println("============ TESTE INTEGER ============");
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		if (x1 == x2) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}

		if (x1.equals(x2)) {
			System.out.println("Igual");
		} else {
			System.out.println("Difenrente");
		}

	}

}
