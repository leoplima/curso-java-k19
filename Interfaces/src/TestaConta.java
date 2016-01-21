public class TestaConta {

	public static void main(String[] args) {

		ContaCorrente c1 = new ContaCorrente();

		ContaPoupanca c2 = new ContaPoupanca();
		c1.deposita(1000);
		c2.deposita(1000);
		c1.saca(100);
		c2.saca(100);

		System.out.println("Saldo da Conta Corrente é: " + c1.getSaldo());

		System.out.println("Saldo da Conta Poupança é: " + c2.getSaldo());

	}

}
