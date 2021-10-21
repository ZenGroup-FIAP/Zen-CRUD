package br.com.zenGroup.entities;

import java.sql.Date;

abstract public class Usuario {
	private Integer codigo;
	private String nome;
	private String email;
	private String senha;
	private String cpf;
	private String telefone;
	private Date nascimento;
	
	public Usuario() {
		
	}
	
	public Usuario(Integer codigo, String nome, String email, String senha, String cpf, String telefone,
			Date nascimento) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
		this.telefone = telefone;
		this.nascimento = nascimento;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", senha=" + senha
				+ ", cpf=" + cpf + ", telefone=" + telefone + ", nascimento=" + nascimento + "]";
	}
}
