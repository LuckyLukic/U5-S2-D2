package Classi;

import ENUM.TipoPostazione;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Postazione {
	
	
	private int id;
	private String descrizione;
	private TipoPostazione tipoPostazione;
	private int numeroOccupanti;
	private String citta;


}


