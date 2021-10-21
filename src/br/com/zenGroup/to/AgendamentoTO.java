package br.com.zenGroup.to;


import java.sql.Date;

public class AgendamentoTO {
	
	private Integer agendamento;
	private Integer paciente;
	private Integer psicologo;
	private Date consulta;
	private Date horaConsulta;
	
	
	public AgendamentoTO() {
		
	}
	
	
	public AgendamentoTO(Integer agendamento, Integer paciente, Integer psicologo, Date consulta, Date horaConsulta) {
		super();
		this.agendamento = agendamento;
		this.paciente = paciente;
		this.psicologo = psicologo;
		this.consulta = consulta;
		this.horaConsulta = horaConsulta;
		
		}


	public Integer getAgendamento() {
		return agendamento;
	}


	public void setAgendamento(Integer agendamento) {
		this.agendamento = agendamento;
	}


	public Integer getPaciente() {
		return paciente;
	}


	public void setPaciente(Integer paciente) {
		this.paciente = paciente;
	}


	public Integer getPsicologo() {
		return psicologo;
	}


	public void setPsicologo(Integer psicologo) {
		this.psicologo = psicologo;
	}


	public Date getConsulta() {
		return consulta;
	}


	public void setConsulta(Date consulta) {
		this.consulta = consulta;
	}


	public Date getHoraConsulta() {
		return horaConsulta;
	}


	public void setHoraConsulta(Date horaConsulta) {
		this.horaConsulta = horaConsulta;
	}
	
	
	
		
	}
	
	
