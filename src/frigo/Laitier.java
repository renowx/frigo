package frigo;

import java.util.Date;

public class Laitier extends Aliment{

	public Laitier(String nom, Date peremption, int quantite, String unite) {
		super(nom, peremption, quantite, unite);
		// TODO Auto-generated constructor stub
	}

	public Laitier(String nom, int qute, String unite) {
		super(nom, qute, unite);
	}

}