package br.com.alura.switchexpression;

public class Test {

	public static void main(String[] args) {
		String nome = "João";
		switch (nome) {
		case "Renata": {
			System.out.println("Acertou: " + nome);
			break;
		}
		case "João": {
			System.out.println("Acertou: " + nome);
			break;
		}
		default: {
			System.out.println("Nenhum nome encontrado!!");
		}
		}

		// Switch expression introduced in Java 14
		switch (nome) {
		case "Renata" -> System.out.println("Acertou: " + nome);
		case "João" -> System.out.println("Acertou: " + nome);
		default -> System.out.println("Nenhum nome encontrado!!");
		}
	}
}
