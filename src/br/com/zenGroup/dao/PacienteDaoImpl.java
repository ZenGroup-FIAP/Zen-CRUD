package br.com.zenGroup.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.zenGroup.to.PacienteTO;
import br.com.zenGroup.tools.ConnectionOracle;

public class PacienteDaoImpl implements PacienteDao {
	private ConnectionOracle conn;

	@Override
	public void insert(PacienteTO paciente) throws SQLException {
		String sql = "INSERT INTO T_ZSO_PACIENTE (CD_PACIENTE, NM_PACIENTE, DS_EMAIL, DS_SENHA, NR_TELEFONE, NR_CPF, DT_NASCIMENTO) VALUES (?, ?, ?, ?, ?, ?, ?)";
		conn = ConnectionOracle.getInstance();
		PreparedStatement ps = conn.getConnection().prepareStatement(sql);
		
		ps.setInt(1, paciente.getCodigo());
		ps.setString(2, paciente.getNome());
		ps.setString(3, paciente.getEmail());
		ps.setString(4, paciente.getSenha());
		ps.setString(5, paciente.getTelefone());
		ps.setString(6, paciente.getCpf());
		ps.setDate(7, paciente.getNascimento());
		
		
		ps.execute();
		ps.close();
		conn.closeConnection();
	}

	@Override
	public List<PacienteTO> select() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PacienteTO select(Integer codigo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PacienteTO select(String email, String senha) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Integer codigo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer codigo) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
