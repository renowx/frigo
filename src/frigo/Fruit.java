package frigo;

import java.util.Date;

public class Fruit extends Aliment {

	public Fruit(String nom, Date peremption, int quantite, String unite) {
		super(nom, peremption, quantite, unite);
		// TODO Auto-generated constructor stub
	}
	
	public Fruit(String nom, int quantite, String unite){
		super(nom, quantite, unite);
	}

}
