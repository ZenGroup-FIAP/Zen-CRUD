package br.com.zenGroup.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.zenGroup.enums.Disponibilidade;
import br.com.zenGroup.to.PsicologoTO;
import br.com.zenGroup.tools.ConnectionOracle;

public class PsicologoDaoImpl implements PsicologoDao {
	
	private ConnectionOracle conn;

	@Override
	public void insert(PsicologoTO psicologo) throws SQLException {
		conn = ConnectionOracle.getInstance();
		String sql = "INSERT INTO T_ZSO_PSICOLOGO (CD_PSICOLOGO, NM_PSICOLOGO, DS_EMAIL, DS_SENHA, VL_HORA, NR_RANKING, TX_DESC_PERFIL,  NR_TELEFONE,  NR_CPF, DT_NASCIMENTO,  NR_RATING, DS_DISPONIBILIDADE, NR_CONSULTAS) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = conn.getConnection().prepareStatement(sql);
			
		ps.setInt(1, psicologo.getCodigo());
		ps.setString(2, psicologo.getNome());
		ps.setString(3, psicologo.getEmail());
		ps.setString(4, psicologo.getSenha());
		ps.setDouble(5, psicologo.getVlHora());
		ps.setInt(6, psicologo.getRanking());
		ps.setString(7, psicologo.getBio());
		ps.setString(8, psicologo.getTelefone());
		ps.setString(9, psicologo.getCpf());
		ps.setDate(10, psicologo.getNascimento());
		ps.setDouble(11, psicologo.getRating());
		ps.setString(12, psicologo.getDisponibilidade().toString());
		ps.setInt(13, psicologo.getConsultas());
			
		ps.close();
		conn.closeConnection();
	}

	@Override
	public List<PsicologoTO> select() throws SQLException {
		conn = ConnectionOracle.getInstance();
		List<PsicologoTO> lista = new ArrayList<>();
		String sql = "SELECT * FROM T_ZSO_PSICOLOGO";
		PreparedStatement ps = conn.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			PsicologoTO psicologo = new PsicologoTO();
			psicologo.setCodigo(rs.getInt("CD_PSICOLOGO"));
			psicologo.setNome(rs.getString("NM_PSICOLOGO"));
			psicologo.setEmail(rs.getString("DS_EMAIL"));
			psicologo.setSenha(rs.getString("DS_SENHA"));
			psicologo.setVlHora(rs.getDouble("VL_HORA"));
			psicologo.setRanking(rs.getInt("NR_RANKING"));
			psicologo.setBio(rs.getString("TX_DESC_PERFIL"));
			psicologo.setTelefone(rs.getString("NR_TELEFONE"));
			psicologo.setCpf(rs.getString("NR_CPF"));
			psicologo.setNascimento(rs.getDate("DT_NASCIMENTO"));
			psicologo.setRating(rs.getDouble("NR_RATING"));
			psicologo.setDisponibilidade(Disponibilidade.valueOf(rs.getString("DS_DISPONIBILIDADE")));
			psicologo.setConsultas(rs.getInt("NR_CONSULTAS"));
			
			lista.add(psicologo);
		}
		
		rs.close();
		ps.close();
		conn.closeConnection();
		
		return lista;
	}

	@Override
	public List<PsicologoTO> select(Double rating, Disponibilidade disponibilidade, Integer consultas) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PsicologoTO select(Integer codigo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PsicologoTO select(String email, String senha) throws SQLException {
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
