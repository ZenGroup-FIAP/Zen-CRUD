package br.com.zenGroup.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.zenGroup.bo.PsicologoTO;
import br.com.zenGroup.enums.Disponibilidade;

public interface PsicologoDao {
	public void insert(PsicologoTO psicologo) throws SQLException;
	
	public List<PsicologoTO> select() throws SQLException;
	
	public List<PsicologoTO> select(Double rating, Disponibilidade disponibilidade, Integer consultas) throws SQLException;

	public PsicologoTO select(Integer codigo) throws SQLException;
	
	public PsicologoTO select(String email, String senha) throws SQLException;
	
	public void update(Integer codigo) throws SQLException;
	
	public void delete(Integer codigo) throws SQLException;
}
