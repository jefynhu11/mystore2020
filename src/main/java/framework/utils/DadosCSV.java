package framework.utils;

public class DadosCSV {
	
	private String nome;
	private String sobrenome;
	private String senha;

	private void DadosCSV(String nome, String sobrenome, String senha) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
