package br.com.zenGroup.tools;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.zenGroup.credencials.Credencials;
import oracle.jdbc.pool.OracleDataSource;

public class ConnectionOracle {
	private Connection connection;
	private static ConnectionOracle instance = new ConnectionOracle();
	
	private ConnectionOracle() {
		try {
			OracleDataSource src = new OracleDataSource();
			src.setURL(Credencials.STR_CONN);
			src.setUser(Credencials.USER);
			src.setPassword(Credencials.PWD);
			connection = src.getConnection();
		} catch (SQLException e) {
			System.out.println("ERRO AO CONECTAR COM BANCO DE DADOS...");
			System.out.println("VERIFICAR CREDENCIAIS!");
			e.printStackTrace();
		}
	}
	
	public static ConnectionOracle getInstance() {
		return instance;
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	
	public void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			System.out.println("ERRO AO FECHAR CONEXÃO COM BANCO DE DADOS...");
			e.printStackTrace();
		}
	}
	
	
}
