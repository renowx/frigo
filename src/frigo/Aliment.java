package frigo;

import java.util.Date;

abstract class Aliment {
	protected String nom;
	protected String type;
	protected Date peremption;
	protected int quantite;
	protected String unite;
	
	protected Aliment(String nom, Date peremption, int quantite, String unite){
		this.nom = nom;
		this.setPeremption(peremption);
		this.quantite = quantite;
		this.unite = unite;
	}
	
	public Aliment(String nom, int quantite, String unite) {
		this.nom = nom;
		this.quantite = quantite;
		this.unite = unite;
		// TODO Auto-generated constructor stub
	}


	public String toString(){
		String perm = "" + quantite + unite + " " + nom + "(s)";
		return perm;
	}
	
	protected String getNom() {
		return nom;
	}
	
	protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}

	protected Date getPeremption() {
		return peremption;
	}

	protected void setPeremption(Date peremption) {
		this.peremption = peremption;
	}
	
	protected int getQuantite() {
		return quantite;
	}
	
	protected void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	protected String getUnite() {
		return unite;
	}
	
	protected void setNom(String nom) {
		this.nom = nom;
	}
	
	protected void setUnite(String unite) {
		this.unite = unite;
	}
}
