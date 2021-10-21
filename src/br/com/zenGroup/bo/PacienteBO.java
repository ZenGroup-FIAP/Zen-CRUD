package br.com.zenGroup.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.zenGroup.bo.intefaces.Autenticavel;
import br.com.zenGroup.dao.PacienteDaoImpl;
import br.com.zenGroup.to.PacienteTO;

public class PacienteBO implements Autenticavel{

	private PacienteDaoImpl dao;
	
	@Override
	public Boolean autenticar(String email, String senha) {
		Boolean valido = null;
		dao = new PacienteDaoImpl();
		
		try {
			if (dao.select(email, senha) != null) {
				valido = true;
			} else {
				valido = false;
			}
		} catch (SQLException e) {
			System.out.println("ERRO NO SISTEMA DE LOGIN...");
			e.printStackTrace();
		}
		
		return valido;
	}
	
	public void cadastrar(PacienteTO paciente) {
		dao = new PacienteDaoImpl();
		try {
			dao.insert(paciente);
		} catch (SQLException e) {
			System.out.println("ERRO AO CADASTRAR PACIENTE...");
			e.printStackTrace();
		}
	}
	
	public List<PacienteTO> listar() {
		dao = new PacienteDaoImpl();
		List<PacienteTO> pacientes = null;
		try {
			pacientes = dao.select();
		} catch (SQLException e) {
			System.out.println("ERRO AO LISTAR PACIENTES...");
			e.printStackTrace();
		}
		return pacientes;
	}
	
	public PacienteTO selecionar(Integer codigo) {
		dao = new PacienteDaoImpl();
		PacienteTO paciente = null;
		try {
			paciente = dao.select(codigo);
		} catch (SQLException e) {
			System.out.println("ERRO AO SELECIONAR PACIENTE...");
			e.printStackTrace();
		}
		return paciente;
	}
	
	public void atualizar(PacienteTO paciente) {
		dao = new PacienteDaoImpl();
		
		try {
			dao.update(paciente);
		} catch (SQLException e) {
			System.out.println("ERRO AO ATUALIZAAR PACIENTE...");
			e.printStackTrace();
		}
	}
	
	public void exclur(Integer codigo) {
		dao = new PacienteDaoImpl();
		
		try {
			dao.delete(codigo);
		} catch (SQLException e) {
			System.out.println("ERRO AO EXCLUIR PACIENTE...");
			e.printStackTrace();
		}
	}

}
