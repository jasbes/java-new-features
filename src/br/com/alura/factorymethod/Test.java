package br.com.alura.factorymethod;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		/*
		  List<String> nomes = new ArrayList<>(); nomes.add("primeiroNome");
		  nomes.add("segundoNome"); nomes.add("terceiroNome"); List<String>
		  nomesImutavel = Collections.unmodifiableList(nomes);
		  System.out.println(nomesImutavel);
		 */

		// Since java 9 can be replaced to
		List.of("primeiroNome", "segundoNome", "terceiroNome");
		
		// Other factory methods
		Set.of("primeiroNome", "segundoNome", "terceiroNome");
		Map.of("name", "Jefferson");
	}
}
