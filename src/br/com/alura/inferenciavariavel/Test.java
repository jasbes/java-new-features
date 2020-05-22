package br.com.alura.inferenciavariavel;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		//Map<String, String> cpfPorNomes = new HashMap<>();
		
		// Since java 10 can be replaced to
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("João", "04813189");

		System.out.println(cpfPorNomes);
	}
}
