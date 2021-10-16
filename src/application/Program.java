package application;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.zenGroup.tools.ConnectionOracle;

public class Program {
	public static void main(String[] args) throws SQLException {
		// Testando conexão com banco de dados fazendo um select
		ConnectionOracle conn = ConnectionOracle.getInstance();
		
		String sql = "SELECT * FROM T_ZSO_PSICOLOGO";
		PreparedStatement ps = conn.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<String> nomes = new ArrayList<>();
		
		while (rs.next()) {
			nomes.add(rs.getString("NM_PSICOLOGO"));
		}
		
		ps.execute();
		
		rs.close();
		ps.close();
		
		nomes.forEach(e -> System.out.println(e));
		
		conn.closeConnection();
	}
}
