public class TestaContador {

	public static void main(String[] args) {

		System.out.println("Contador: " + Conta.contador);

		Conta c1 = new Conta();
		System.out.println("Numero da primeira conta: " + c1.numero);

		Conta c2 = new Conta();
		System.out.println("Numero da segunda conta: " + c2.numero);
	}

}
