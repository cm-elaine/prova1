package entities;

import java.time.LocalDate;

public class EventoRecorrente extends Evento {

    public EventoRecorrente(String titulo, String descricao, LocalDate dt_Inicio, LocalDate dt_Fim, String localizacao) {
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
		return "Evento recorrente";
	}

	@Override
	public LocalDate intervaloData(LocalDate dt_inicio, LocalDate dt_fim) throws DataInvalidaException {
		// TODO Auto-generated method stub
		return null;
	}
}
