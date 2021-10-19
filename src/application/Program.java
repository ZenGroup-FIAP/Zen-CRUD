package application;

import java.sql.SQLException;

import br.com.zenGroup.bo.PacienteBO;
import br.com.zenGroup.bo.PsicologoBO;

public class Program {
	public static void main(String[] args) throws SQLException {
		// Testes
		PacienteBO bo = new PacienteBO();
		PsicologoBO bops = new PsicologoBO();
		
		// Lista de pacientes
		
		
		//System.out.println(bo.listar());
		//bops.excluir(10);
		System.out.println(bops.listar());
		// Cadastrar paciente
		
	}
}
