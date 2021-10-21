package application;

import java.sql.SQLException;

import br.com.zenGroup.bo.PacienteBO;

public class Program {
	public static void main(String[] args) throws SQLException {
		// Testes
		PacienteBO bo = new PacienteBO();
		
		// Lista de pacientes
		System.out.println(bo.listar());
		
		// Cadastrar paciente
	}
}
