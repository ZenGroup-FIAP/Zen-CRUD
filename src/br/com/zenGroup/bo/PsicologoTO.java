package br.com.zenGroup.bo;

import java.sql.Date;

import br.com.zenGroup.entities.Usuario;
import br.com.zenGroup.enums.Disponibilidade;

public class PsicologoTO extends Usuario {
	private Double vlHora;
	private Integer ranking;
	private Double rating;
	private Disponibilidade disponibilidade;
	private Integer consultas;
	
	public PsicologoTO() {
		super();
	}

	public PsicologoTO(Integer codigo, String nome, String email, String senha, String bio, String cpf, String telefone,
			Date nascimento, Double vlHora, Integer ranking, Double rating, Disponibilidade disponibilidade,
			Integer consultas) {
		super(codigo, nome, email, senha, bio, cpf, telefone, nascimento);
		this.vlHora = vlHora;
		this.ranking = ranking;
		this.rating = rating;
		this.disponibilidade = disponibilidade;
		this.consultas = consultas;
	}

	public Double getVlHora() {
		return vlHora;
	}

	public void setVlHora(Double vlHora) {
		this.vlHora = vlHora;
	}

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Disponibilidade getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(Disponibilidade disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public Integer getConsultas() {
		return consultas;
	}

	public void setConsultas(Integer consultas) {
		this.consultas = consultas;
	}

	@Override
	public String toString() {
		return "PsicologoTO [vlHora=" + vlHora + ", ranking=" + ranking + ", rating=" + rating + ", disponibilidade="
				+ disponibilidade + ", consultas=" + consultas + "]";
	}
}
