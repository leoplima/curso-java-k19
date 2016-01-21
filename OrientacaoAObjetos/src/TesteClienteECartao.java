public class TesteClienteECartao {

	public static void main(String[] args) {

		Cliente c = new Cliente();
		CartaoDeCredito cdc = new CartaoDeCredito(111111);

		c.nome = "Rafael Consentino";
		c.codigo = 123;

		cdc.dataDeValidade = "";

		System.out.println(" Dados do cliente ");
		System.out.println(" Nome : " + c.nome);
		System.out.println(" Código : " + c.codigo);
		System.out.println(" ----------------------------------------");
		System.out.println(" Dados do cartão ");
		System.out.println(" Número : " + cdc.numero);
		System.out.println(" Data de validade : " + cdc.dataDeValidade);
		System.out.println(" ----------------------------------------");

		cdc.cliente = c;

		System.out.println(" Dados do cliente obtidos através do cartão ");
		System.out.println(cdc.cliente.nome);
		System.out.println(cdc.cliente.codigo);
	}
}
