package entities;

import java.time.LocalDate;

public class EventoUnico extends Evento {

    public EventoUnico(String titulo, String descricao, LocalDate dt_Inicio, LocalDate dt_Fim, String localizacao) {
        super(titulo, descricao, dt_Inicio, dt_Fim, localizacao);
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
		return "Evento único";
	}

	@Override
	public LocalDate intervaloData(LocalDate dt_inicio, LocalDate dt_fim) throws DataInvalidaException {
		if(dt_inicio.isAfter(dt_fim)) {
			throw new DataInvalidaException(dt_fim, dt_fim);
		}
		return dt_fim;
	}
}
