package application;

import java.sql.Date;
import java.sql.SQLException;

import br.com.zenGroup.to.PacienteTO;

public class Program {
	public static void main(String[] args) throws SQLException {
		PacienteTO paciente = new PacienteTO();
		paciente.setCodigo(1);
		paciente.setCpf("510.605.523-88");
		paciente.setEmail("sla@email.com");
		paciente.setNascimento(new Date(0));
		paciente.setNome("Jorge");
		paciente.setSenha("1234");
		paciente.setTelefone("119565659");
		
		
		System.out.println(paciente);
	}
}
