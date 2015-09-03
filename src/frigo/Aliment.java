package frigo;

import java.util.Date;

public class Aliment {
	private String nom;
	private String type;
	private Date peremption;
	private int quantite;
	private String unite;
	
	public Aliment(String nom, String type, Date peremption, int quantite, String unite){
		this.nom = nom;
		this.type = type;
		this.peremption = peremption;
		this.quantite = quantite;
		this.unite = unite;
	}
	
	public String toString(){
		return quantite + " " + unite + " " + nom + "(s)";
	}

}
