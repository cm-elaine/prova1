package entities;

import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {

        Participante participante1 = new Participante("João");
        Participante participante2 = new Participante("Elaine");
        
        Evento evento1 = new EventoRecorrente("Evento recorrente", "Descrição do evento único", LocalDate.of(2024, 4, 1), LocalDate.of(2024, 4, 2),
                "Local 1");
        
        Evento evento2 = new EventoUnico("Evento único", "Descrição do evento único", LocalDate.of(2024, 4, 1), LocalDate.of(2024, 3, 5),
                "Local 1");
        
        
        evento1.adicionarParticipante(participante1);
        evento2.adicionarParticipante(participante2);

        evento1.listarParticipantes();
        evento2.listarParticipantes();

    }
}
