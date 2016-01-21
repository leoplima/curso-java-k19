public class Gerente extends Funcionario {

	private String usuario;
	private String senha;

	@Override
	public double calculaBonificacao() {
		return super.calculaBonificacao() + 1000;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}