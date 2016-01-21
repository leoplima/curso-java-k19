public class TestaAgencia {

	public static void main(String[] args) {

		Agencia a1 = new Agencia(1234);

		Agencia a2 = new Agencia(5678);

		System.out.println("Dados da primeira agencia:");
		System.out.println(" Numero: " + a1.numero);
		System.out.println("--------------------------------");
		System.out.println("Dados da segunda agencia:");
		System.out.println("Numero: " + a2.numero);

	}

}
