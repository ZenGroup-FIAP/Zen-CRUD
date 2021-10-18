package br.com.zenGroup.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		conn = ConnectionOracle.getInstance();
		List<PacienteTO> lista = new ArrayList<>();
		String sql = "SELECT * FROM T_ZSO_PACIENTE";
		PreparedStatement ps = conn.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			PacienteTO paciente = new PacienteTO();
			paciente.setCodigo(rs.getInt("CD_PACIENTE"));
			paciente.setNome(rs.getString("NM_PACIENTE"));
			paciente.setEmail(rs.getString("DS_EMAIL"));
			paciente.setSenha(rs.getString("DS_SENHA"));
			paciente.setTelefone(rs.getString("NR_TELEFONE"));
			paciente.setCpf(rs.getString("NR_CPF"));
			paciente.setNascimento(rs.getDate("DT_NASCIMENTO"));
			
			lista.add(paciente);
		}
		
		rs.close();
		ps.close();
		conn.closeConnection();
		
		
		return lista;
	}

	@Override
	public PacienteTO select(Integer codigo) throws SQLException {
		conn = ConnectionOracle.getInstance();
		PacienteTO paciente = new PacienteTO();
		String sql = "SELECT * FROM T_ZSO_PACIENTE WHERE CD_PACIENTE = " + codigo;
		PreparedStatement ps = conn.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			paciente.setCodigo(rs.getInt("CD_PACIENTE"));
			paciente.setNome(rs.getString("NM_PACIENTE"));
			paciente.setEmail(rs.getString("DS_EMAIL"));
			paciente.setSenha(rs.getString("DS_SENHA"));
			paciente.setTelefone(rs.getString("NR_TELEFONE"));
			paciente.setCpf(rs.getString("NR_CPF"));
			paciente.setNascimento(rs.getDate("DT_NASCIMENTO"));
		} else {
			paciente = null;
		}
		
		rs.close();
		ps.close();
		conn.closeConnection();
		
		return paciente;
	}

	@Override
	public PacienteTO select(String email, String senha) throws SQLException {
		conn = ConnectionOracle.getInstance();
		PacienteTO paciente = new PacienteTO();
		String sql = "SELECT * FROM T_ZSO_PACIENTE WHERE DS_EMAIL = " + email + " AND DS_SENHA = " + senha;
		PreparedStatement ps = conn.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			paciente.setCodigo(rs.getInt("CD_PACIENTE"));
			paciente.setNome(rs.getString("NM_PACIENTE"));
			paciente.setEmail(rs.getString("DS_EMAIL"));
			paciente.setSenha(rs.getString("DS_SENHA"));
			paciente.setTelefone(rs.getString("NR_TELEFONE"));
			paciente.setCpf(rs.getString("NR_CPF"));
			paciente.setNascimento(rs.getDate("DT_NASCIMENTO"));
		} else {
			paciente = null;
		}
		
		rs.close();
		ps.close();
		conn.closeConnection();
		
		return paciente;
	}

	@Override
	public void update(Integer codigo, PacienteTO paciente) throws SQLException {
		conn = ConnectionOracle.getInstance();
		String sql = "UPDATE T_ZSO_PACIENTE SET NM_PACIENTE=?, DS_EMAIL=?, DS_SENHA=?, NR_TELEFONE=?, NR_CPF=?, DT_NASCIMENTO=?";
		PreparedStatement ps = conn.getConnection().prepareStatement(sql);
		
		ps.setString(1, paciente.getNome());
		ps.setString(2, paciente.getEmail());
		ps.setString(3, paciente.getSenha());
		ps.setString(4, paciente.getTelefone());
		ps.setString(5, paciente.getCpf());
		ps.setDate(6, paciente.getNascimento());
		
		ps.execute();
		
		ps.close();
		conn.closeConnection();
		
	}

	@Override
	public void delete(Integer codigo) throws SQLException {
		conn = ConnectionOracle.getInstance();
		String sql = "DELETE FROM T_ZSO_PACIENTE WHERE CD_CONSULTA = " + codigo + ";DELETE FROM T_ZSO_AGENDAMENTO WHERE CD_PACIENTE = " + codigo + ";DELETE FROM T_ZSO_PACIENTE WHERE CD_PACIENTE = " + codigo;
		PreparedStatement ps = conn.getConnection().prepareStatement(sql);
		
		ps.execute();
		ps.close();
		conn.closeConnection();
	}
}
