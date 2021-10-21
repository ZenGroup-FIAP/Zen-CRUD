package br.com.zenGroup.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.zenGroup.to.PacienteTO;

public interface PacienteDao {
	public void insert(PacienteTO paciente) throws SQLException;
	
	public List<PacienteTO> select() throws SQLException;
	
	public PacienteTO select(Integer codigo) throws SQLException;
	
	public List<PacienteTO> select(String email, String senha) throws SQLException;
	
	public void update(PacienteTO paciente) throws SQLException;
	
	public void delete(Integer codigo) throws SQLException;
}
