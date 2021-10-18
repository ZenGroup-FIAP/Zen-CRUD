package br.com.zenGroup.to;

import java.sql.Date;

import br.com.zenGroup.entities.Usuario;

public class PacienteTO extends Usuario {

	public PacienteTO() {
		super();
	}

	public PacienteTO(Integer codigo, String nome, String email, String senha, String cpf, String telefone,
			Date nascimento) {
		super(codigo, nome, email, senha, cpf, telefone, nascimento);
	}
	
}
