package frigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Frigo {

	ArrayList<Aliment> listeAliments;
	ArrayList<Recette> listeRecettes;
	
	public ArrayList<Recette> getListeRecettes() {
		return listeRecettes;
	}
	
	public void setListeRecettes(Recette listeRecettes) {
		this.listeRecettes.add(listeRecettes);
	}

	public Frigo() {
		this.listeAliments = new ArrayList<Aliment>();
		this.listeRecettes = new ArrayList<Recette>();
	}
		
	public ArrayList<Aliment> getListeAliments() {
		return listeAliments;	
	}
		
	public void setAliments(Aliment aliment) {
		this.listeAliments.add(aliment);
	}
		
	public void enleverAliments(String nom){
		for (Aliment aliment : listeAliments) {
			if(aliment.getNom().equals(nom)){
				listeAliments.remove(aliment);
			}
		}
	}
		
	public String toString() {
		String aliments = "";
		for (Aliment aliment : listeAliments) {
			aliments = aliments + aliment.toString() + "\n";
		}
		return aliments;
	}
		
	public String recetteContenu(){
		int res = 0;
		String recettes = "";
		for(Recette recette : getListeRecettes()){
			for (Aliment aliment : recette.listeAliments) {
				for(Aliment aliFrigo : getListeAliments()){
					if(aliFrigo.getNom().equals(aliment.getNom())){
						if(aliFrigo.getQuantite()>=aliment.getQuantite()){
							res = res + 1;
						}
					}
				}
			}
			if(res == listeRecettes.size()){
				recettes = recettes + recette.getNom() + " ";
			}
			res = 0;
		}
	return recettes;
	}
	
	public void retirerQuantite(Aliment aliment, int quantite) {
		for (Aliment aliment2 : listeAliments) {
			if(aliment.getNom().equals(aliment2.getNom()) && aliment.getQuantite()-quantite>=0){
				aliment.setQuantite(aliment.getQuantite()-quantite);
				if(aliment.getQuantite()==0){
					listeAliments.remove(aliment);
				}
			}
			else{
				System.out.println("Vous n'avez pas assez de quantité");
			}
		}
	}
	
	/*public String[] alimentCSV(){ 
		int compteur;
		File file = new File("");
		String chemin = file.getAbsolutePath() + File.separator + "Calc" + File.separator + "aliments.csv";
		BufferedReader buffer = new BufferedReader(new FileReader(chemin)); 
		compteur = Integer.parseInt(buffer.readLine());
		Aliment[][] aliment = new Aliment[compteur + 1][7];
		String chaine = buffer.readLine();
		int i = 0; 
		while(chaine!= null) 
		{
			String[] tabChaine = chaine.split(",");
			for(int j = 0; j<tabChaine.length;j++){ 
				edt[i][j] = tabChaine[j]; 
			}
			chaine = buffer.readLine(); 
			i++; 
		}
		buffer.close(); 
	}
	catch (FileNotFoundException e) 
	{
		System.out.println("Le fichier est introuvable !");
	}
	return edt;
	}*/
}
