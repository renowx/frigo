package frigo;

import java.util.ArrayList;

public class Frigo {

	private ArrayList<Aliment> listeAliments;
	private ArrayList<Recette> listeRecettes;
	
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
		ArrayList<Aliment> temp = new ArrayList<>();
	
		for (Aliment aliment : listeAliments) {
			if(!aliment.getNom().equals(nom)){
				temp.add(aliment);
			}
		}
		listeAliments = temp;
	}
		
	public String toString() {
		String aliments = "";
		for (Aliment aliment : listeAliments) {
			aliments = aliments + aliment.toString() + "\n";
		}
		return aliments;
	}
		
	public String recetteContenu(){
		String recettes = "";
		for(Recette recette : getListeRecettes()){
			recettes = recettes + recette.getNom() + " : " + recette.recetteValide(this) + "\n";			
		}
	return recettes;
	}
	
	public void retirerQuantite(Aliment aliment, int quantite) {
		for (Aliment aliment2 : listeAliments) {
			if(aliment.getNom().equals(aliment2.getNom()) && aliment.getQuantite()-quantite>=0){
				aliment.setQuantite(aliment.getQuantite()-quantite);
				/*if(aliment.getQuantite()==0){
					listeAliments.remove(aliment);
				}*/
				return;
			}
			else if(aliment.getNom().equals(aliment2.getNom()) && aliment.getQuantite()-quantite<=0){
				System.out.println("Vous n'avez pas assez de quantité");
				return;
			}
		}
		return;
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
