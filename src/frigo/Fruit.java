package frigo;

import java.util.GregorianCalendar;

public class Fruit extends Aliment {

	public Fruit(String nom, GregorianCalendar peremption, int quantite, String unite) {
		super(nom, peremption, quantite, unite);
		// TODO Auto-generated constructor stub
	}
	
	public Fruit(String nom, int quantite, String unite){
		super(nom, quantite, unite);
	}

}
