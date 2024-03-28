package entities;

import java.time.LocalDate;

import entities_enums.DiaSemana;

public class EventoPeriodico extends Evento {
    private DiaSemana diaSemana;

    public EventoPeriodico(String titulo, String descricao, LocalDate dt_Inicio, LocalDate dt_Fim, String localizacao,
            DiaSemana diaSemana) {
        super(titulo, descricao, dt_Inicio, dt_Fim, localizacao);
        this.diaSemana = diaSemana;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    @Override
    public boolean adicionarParticipante(Participante participante) {
        return super.adicionarParticipante(participante);
    }

    @Override
    public boolean removerParticipante(Participante participante) {
        return super.removerParticipante(participante);
    }

	@Override
	public String tipoEvento() {
		// TODO Auto-generated method stub
		return "Evento periodico";
	}

	@Override
	public LocalDate intervaloData(LocalDate dt_inicio, LocalDate dt_fim) throws DataInvalidaException {
		// TODO Auto-generated method stub
		return null;
	}
}
