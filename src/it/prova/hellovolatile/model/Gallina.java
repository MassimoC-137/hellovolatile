package it.prova.hellovolatile.model;

public class Gallina implements Volatile{

	private String piumaggio;

	@Override
	public String vola() {

		return "La gallina non vola. ";
	}

	@Override
	public String stampaProprieta() {

		return "E' una gallina. ";
	} 
	
	public Gallina () {
		
	}
	
	public Gallina (String piumaggio) {
		
		this.piumaggio = piumaggio; 
	}
	
	public String getPiumaggio() {
		
		return piumaggio; 
	}
	
	public void setPiumaggio (String piumaggio) {
		
		this.piumaggio = piumaggio; 
	}


	public boolean eUgualeA(Volatile altroVolatile) {

		if (! (altroVolatile instanceof Gallina)) {
			return false; 
		}
		Gallina temp = (Gallina) altroVolatile; 
		return this.piumaggio.equals(temp.getPiumaggio()); 
	}
}
