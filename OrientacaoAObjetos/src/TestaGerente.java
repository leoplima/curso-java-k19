public class TestaGerente {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.salario = 1000;

		System.out.println("Salário : " + g.salario);
		System.out.println(" Aumentanto o salário em 10%");

		g.aumentaSalario();

		System.out.println("Salário Atual: " + g.salario);
		System.out.println(" Aumentanto o salário em 30%");

		g.aumentaSalario(0.3);

		System.out.println("Salário atual: " + g.salario);

	}

}
