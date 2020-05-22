package br.com.alura.switchexpression;

public class Test {

	public static void main(String[] args) {
		String nome = "Jo�o";
		switch (nome) {
		case "Renata": {
			System.out.println("Acertou: " + nome);
			break;
		}
		case "Jo�o": {
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
		case "Jo�o" -> System.out.println("Acertou: " + nome);
		default -> System.out.println("Nenhum nome encontrado!!");
		}
	}
}
