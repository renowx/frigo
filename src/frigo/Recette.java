package frigo;

import java.util.ArrayList;

public class Recette {
	String nom;
	
	ArrayList<Aliment> listeAliments;
	
	public Recette(String nom, ArrayList<Aliment> listeAliments){
		this.listeAliments = listeAliments;
		this.nom = nom;
	}
	
	public String toString(){	
		String aliments = "";
		for (Aliment aliment : listeAliments) {
			aliments = aliments + aliment.toString() + "\n";
		}
		return this.nom + " Ingrédients : " + aliments;
	}

	public String getNom() {
		return nom;
	}

	public ArrayList<Aliment> getListeAliments() {
		return listeAliments;
	}
	
	public boolean recetteValide(Frigo frigo){
		boolean res=false;
		for (Aliment aliment : listeAliments) {
			for(Aliment aliFrigo : frigo.getListeAliments()){
				if(aliFrigo.getNom().equals(aliment.getNom())){
					if(aliFrigo.getQuantite()>=aliment.getQuantite()){
						res = true;
					}
					else{
						return false;
					}
				}
			}
		}
		return res;
	}
	
	
	
	
}

