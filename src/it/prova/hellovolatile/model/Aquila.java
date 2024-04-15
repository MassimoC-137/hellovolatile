package it.prova.hellovolatile.model;

public class Aquila implements Volatile{

	private String razzaAquila;

	@Override
	public String vola() {

		return "L'aquila vola. ";
	}

	@Override
	public String stampaProprieta() {

		return "E' un'aquila. ";
	} 
	
	public Aquila () {
		
	}
	
	public Aquila (String razzaAquila) {
		
		this.razzaAquila = razzaAquila; 
	}
	
	public String getRazzaAquila () {
		
		return razzaAquila; 
	}
	
	public void setRazzaAquila (String razzaAquila) {
		
		this.razzaAquila = razzaAquila; 
	}


	public boolean eUgualeA(Volatile altroVolatile) {
		
		if (! (altroVolatile instanceof Aquila)) { // controllo se altroVolatile rientra in Aquila
			return false; 
		}
		Aquila temp = (Aquila) altroVolatile;  // creo variabile NECESSARIA per fare il confronto
		return this.razzaAquila.equals(temp.getRazzaAquila());  //  confronto dà direttamente risultato boolean
	}
	


}
