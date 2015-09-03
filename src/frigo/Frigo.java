package frigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Frigo {

	ArrayList<Aliment> listeAliments;
	
	public Frigo() {
		this.listeAliments = new ArrayList<Aliment>();
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
	
	@Override
	public String toString() {
		String aliments = "";
		for (Aliment aliment : listeAliments) {
			aliments = aliments + aliment.toString() + "\n";
		}
		return aliments;
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
