package br.com.k19.banco.sistema;

public class Funcionario {

	private double salario;

	public void aumentaSalario(double aumento) {

		if (aumento < 0) {

			IllegalArgumentException erro = new IllegalArgumentException();

			throw erro;

		}
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
