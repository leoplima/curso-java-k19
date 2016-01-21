public class TestaConta {

	public static void main(String[] args) {

		Agencia a = new Agencia(123);

		Conta c1 = new Conta(a);
		c1.numero = 1234;
		c1.saldo = 1000;
		c1.limite = 500;

		Conta c2 = new Conta(a);
		c2.numero = 5678;
		c2.saldo = 2000;
		c2.limite = 250;

		System.out.println("Dados da primeira conta");
		System.out.println("Número : " + c1.numero);
		System.out.println("Saldo : " + c1.saldo);
		System.out.println("Limite : " + c1.limite);
		System.out.println("----------------------------------------");
		System.out.println("Dados da segunda conta");
		System.out.println("Número : " + c2.numero);
		System.out.println("Saldo : " + c2.saldo);
		System.out.println("Limite : " + c2.limite);

	}

}
