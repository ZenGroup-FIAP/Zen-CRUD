package br.com.zenGroup.to;

public class ConsultaTO {

	private Integer consulta;
	private Integer agendamento;
	private Integer paciente;
	private Integer psicologo;
	private double valorConsulta;

	public ConsultaTO() {

	}

	public ConsultaTO(Integer consulta, Integer agendamento, Integer paciente, Integer psicologo,
			double valorConsulta) {
		this.consulta = consulta;
		this.agendamento = agendamento;
		this.paciente = paciente;
		this.psicologo = psicologo;
		this.valorConsulta = valorConsulta;
	}

	public Integer getConsulta() {
		return consulta;
	}

	public void setConsulta(Integer consulta) {
		this.consulta = consulta;
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

	public double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	
	
}
