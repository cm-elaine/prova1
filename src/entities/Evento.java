package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Evento {
    private String titulo;
    private String descricao;
    private LocalDate dt_Inicio;
    private LocalDate dt_Fim;
    private String localizacao;
    private List<Participante> participantes;

    public Evento(String titulo, String descricao, LocalDate dt_Inicio, LocalDate dt_Fim, String localizacao) {
        super();
        this.titulo = titulo;
        this.descricao = descricao;
        this.dt_Inicio = dt_Inicio;
        this.dt_Fim = dt_Fim;
        this.localizacao = localizacao;
        this.participantes = new ArrayList<>();
    }

    public boolean adicionarParticipante(Participante participante) {
        if (!participantes.contains(participante)) {
            participantes.add(participante);
            return true;
        } else {
            return false;
        }
    }

    public boolean removerParticipante(Participante participante) {
        return participantes.remove(participante);
    }

    public void listarParticipantes() {
        System.out.println("Participantes do evento " + titulo + ":");
        for (Participante p : participantes) {
            System.out.println(p.getNome());
        }
    }
    
    public abstract String tipoEvento();
    
    public abstract LocalDate intervaloData(LocalDate dt_inicio, LocalDate dt_fim) throws DataInvalidaException;
    
    
}

