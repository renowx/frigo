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
	
	public String[] alimentCSV(){ 
		int compteur;
		File file = new File("");
		//String chemin = 
	}
}
