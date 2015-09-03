package frigo;

import java.util.Date;

public abstract class Aliment {
	private String nom;
	private String type;
	private Date peremption;
	private int quantite;
	private String unite;
	
	public Aliment(String nom, Date peremption, int quantite, String unite){
		this.nom = nom;
		this.setPeremption(peremption);
		this.quantite = quantite;
		this.unite = unite;
	}
	
	public String toString(){
		String perm = "" + quantite + unite + " " + nom + "(s)";
		return perm;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getPeremption() {
		return peremption;
	}

	public void setPeremption(Date peremption) {
		this.peremption = peremption;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public String getUnite() {
		return unite;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setUnite(String unite) {
		this.unite = unite;
	}
}
