package br.com.k19.banco.testes;

import br.com.k19.banco.sistema.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario f = new Funcionario();
		try {
			f.aumentaSalario(-1000);
		} catch (IllegalArgumentException e) {
			System.out
					.println(" Houve uma IllegalArgumentException ao aumentar o salário ");
		}

	}
}