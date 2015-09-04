package frigo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

abstract class Aliment {
	protected String nom;
	protected String type;
	protected GregorianCalendar peremption;
	protected int quantite;
	protected String unite;
	
	protected Aliment(String nom, GregorianCalendar peremption, int quantite, String unite){
		this.nom = nom;
		this.setPeremption(peremption);
		this.quantite = quantite;
		this.unite = unite;
	}
	
	protected Aliment(String nom, int quantite, String unite) {
		this.nom = nom;
		this.quantite = quantite;
		this.unite = unite;
		// TODO Auto-generated constructor stub
	}

	public Date conversion(GregorianCalendar gc){
		Date date = new Date();
		if(gc!=null)
		date = gc.getTime();
		return date;
	}

	public String toString(){
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String perm = "" + quantite + unite + " " + nom + "(s)" + " Date de peremption : " + dateFormat.format(this.conversion(peremption));
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

	protected GregorianCalendar getPeremption() {
		return peremption;
	}

	protected void setPeremption(GregorianCalendar peremption) {
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
	
	protected boolean estConsommable(){
		Date c = Calendar.getInstance( ).getTime();
		if (getPeremption().after(c)){
			return true;
		} else {
			return false;
		}
	}
}
