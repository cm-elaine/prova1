package entities;

import java.time.LocalDate;

public class DataInvalidaException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public DataInvalidaException (LocalDate dt_inicio, LocalDate dt_fim) {
		super("A data final deve ser posterior à data inicial");
	}

}
