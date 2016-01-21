public class Conta {

	static int contador;
	int numero;

	Conta() {
		Conta.contador++;
		this.numero = Conta.contador;
	}

	static void zeraContador() {
		System.out.println("Valor atual do contador: " + Conta.contador);
	}
}
