package Entites;

public class Acount {
	private String nome;
	private String email;
	private String senha;
	private Integer numero;
	
	public Acount() {
	}

	public Acount(String nome, String email, String senha, Integer numero) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return nome+", "+email+", senha: "+senha+", Numero: "+numero;
	}
}
