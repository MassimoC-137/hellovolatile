package it.prova.hellovolatile.test;

// import con cmd + shift + O
import it.prova.hellovolatile.model.Aquila;
import it.prova.hellovolatile.model.Gallina; 
import it.prova.hellovolatile.model.Pinguino;
import it.prova.hellovolatile.model.Volatile;

public class TestVolatile {

	public static void main(String[] args) {

		Volatile bird1 = new Gallina("Bianco"); 
		Volatile bird2 = new Pinguino("Antartide"); 
		Volatile bird3 = new Aquila("Reale"); 
		Volatile bird4 = new Gallina("Marrone"); 
		Volatile bird5 = new Pinguino("Antartide"); 
		Volatile bird6 = new Aquila("Rapace"); 
		Volatile bird7 = new Aquila("Reale");
		Volatile bird8 = new Gallina("Bianco"); 
		Volatile bird9 = new Pinguino("Sud America"); 
		
//		
//		System.out.println(bird1.vola());
//		System.out.println(bird1.stampaProprieta());
//		System.out.println(bird2.vola());
//		System.out.println(bird2.stampaProprieta());
//		System.out.println(bird3.vola());
//		System.out.println(bird3.stampaProprieta());
		
		System.out.println("Le aquile sono della stessa razza? " + bird3.eUgualeA(bird7));
		
		System.out.println("Le galline hanno lo stesso piumaggio? " + bird1.eUgualeA(bird4));
		
		System.out.println("I pinguini vengono dallo stesso continente? " + bird2.eUgualeA(bird5));
	}

}
