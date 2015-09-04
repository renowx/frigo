package frigo;

import java.util.GregorianCalendar;

public class Viande extends Aliment{

	public Viande(String nom, GregorianCalendar peremption, int quantite, String unite) {
		super(nom, peremption, quantite, unite);
		// TODO Auto-generated constructor stub
	}
	
	public Viande(String nom, int quantite, String unite) {
		super(nom, quantite, unite);
	}

}
