package frigo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

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
			aliments = aliments + aliment.toString() + " ";
		}
		return this.nom + " Ingrédients : " + aliments;
	}

	public String getNom() {
		return nom;
	}

	public ArrayList<Aliment> getListeAliments() {
		return listeAliments;
	}
	
	public String recetteValide(Frigo frigo){
		boolean res=false;
		int i = 0;
		for (Aliment aliment : listeAliments) {
			for(Aliment aliFrigo : frigo.getListeAliments()){
				if(aliFrigo.getNom().equals(aliment.getNom())){
					if(aliFrigo.getQuantite()>=aliment.getQuantite()){
						res = true;
						i++;
					}
					else{
						return "Recette impossible !";
					}
				}
			}
		}
		if(res && i==listeAliments.size()){
			return"Recette possible !";
		}
		else{
			return "Recette impossible !";
		}
	}
	
	public boolean estConsommable(Aliment a){
		Date c = Calendar.getInstance( ).getTime();
		if (a.getPeremption().after(c)){
			return true;
		} else {
			return false;
		}
	}
	
	public List<Aliment> triSelonDatePeremption(){
		Aliment[] alimentsTries = (Aliment[]) listeAliments.toArray();
		//Aliment[] alimentsTries = listeAliments.toArray(new Aliment[]{});
		Arrays.sort(alimentsTries, new Comparator<Aliment>() {
			@Override
			public int compare(Aliment o1, Aliment o2) {
				return o1.getPeremption().compareTo(o2.getPeremption());
			}
		});
		return new ArrayList<Aliment>(Arrays.asList(alimentsTries));
	}
	
}

