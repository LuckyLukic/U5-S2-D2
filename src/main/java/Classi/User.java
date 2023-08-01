package Classi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
	
	private int id;
	private String nome;
	private String cognome;
	private String email;
	
	
	public User(String nome, String cognome, String email) {
	
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}
	

}


