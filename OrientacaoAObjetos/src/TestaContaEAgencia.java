public class TestaContaEAgencia {
	public static void main(String[] args) {

		Agencia a = new Agencia(1234);

		Conta c = new Conta(a);
		c.numero = 123;
		c.saldo = 1000.0;
		c.limite = 500;

		System.out.println(" Dados da agência ");
		System.out.println(" Número : " + a.numero);

		System.out.println(" ----------------------------------------");
		System.out.println(" Dados da conta ");
		System.out.println(" Número : " + c.numero);
		System.out.println(" Saldo : " + c.saldo);
		System.out.println(" Limite : " + c.limite);
		System.out.println(" ----------------------------------------");

		c.agencia = a;

		System.out.println(" Dados do agência obtidos através da conta ");
		System.out.println(c.agencia.numero);
	}
}
