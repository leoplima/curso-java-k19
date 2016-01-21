package br.com.k19.testes;

public class TestaImutabilidade {

	public static void main(String[] args) {

		String nome = " Rafael Cosentino ";

		String nomeAlterado = nome.toUpperCase();

		// exibe Rafael Cosentino

		System.out.println(nome);

		// exibe RAFAEL COSENTINO

		System.out.println(nomeAlterado);

	}

}
