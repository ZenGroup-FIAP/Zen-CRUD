package br.com.zenGroup.dao;

import java.util.List;

import br.com.zenGroup.bo.PsicologoTO;
import br.com.zenGroup.enums.Disponibilidade;

public interface PsicologoDao {
	public void insert(PsicologoTO psicologo);
	
	public List<PsicologoTO> select();
	
	public List<PsicologoTO> select(Double rating, Disponibilidade disponibilidade, Integer consultas);

	public PsicologoTO select(Integer codigo);
	
	public PsicologoTO select(String email, String senha);
	
	public void update(Integer codigo);
	
	public void delete(Integer codigo);
}
