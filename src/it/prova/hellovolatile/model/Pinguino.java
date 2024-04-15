package it.prova.hellovolatile.model;

public class Pinguino implements Volatile{

	private String continenteAppartenenza;

	@Override
	public String vola() {

		return "Il pinguino non vola. ";
	}

	@Override
	public String stampaProprieta() {

		return "E' un pinguino. ";
	} 
	
	public Pinguino () {
		
	}
	
	public Pinguino (String continenteAppartenenza) {
	
		this.continenteAppartenenza = continenteAppartenenza; 
	}
	
	public String getContinenteAppartenenza() {
		
		return continenteAppartenenza; 
	}
	
	public void setContinenteAppartenenza(String continenteAppartenenza) {
		
		this.continenteAppartenenza = continenteAppartenenza; 
	}
	
	public boolean eUgualeA(Volatile altroVolatile) {

		if (! (altroVolatile instanceof Pinguino)) {
			return false; 
		}
		Pinguino temp = (Pinguino) altroVolatile; 
		return this.continenteAppartenenza.equals(temp.getContinenteAppartenenza()); 
	}
}
