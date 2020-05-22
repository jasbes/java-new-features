package br.com.alura.factorymethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("primeiroNome");
		nomes.add("segundoNome");
		nomes.add("terceiroNome");
		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
		System.out.println(nomesImutavel);

		List.of("primeiroNome", "segundoNome", "terceiroNome");
		Set.of("primeiroNome", "segundoNome", "terceiroNome");
		Map.of("name", "Jefferson");
	}
}
