package Classi;

import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class Prenotazione {
	
	private int id;
	private LocalDate dataPrenotazione;
	private Postazione postazione;
	private User utente;
	
	

}

