package br.com.k19.banco.sistema;

public class Conta {

	private double saldo;

	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println(" Valor de " + valor
					+ " foi depositado com sucesso!");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
