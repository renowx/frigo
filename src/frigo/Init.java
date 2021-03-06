package frigo;

import java.util.ArrayList;
import java.util.Date;

public class Init {

	
	public Frigo initialiserFrigo(Frigo frigo) {
		
		 
		Aliment tomateR = new Fruit("tomate", new Date(2015, 12, 6), 4, "");
		Aliment boeufR = new Viande("boeuf", new Date(2015, 9, 15), 400, "g");
		ArrayList<Aliment> boloA = new ArrayList<Aliment>();
		boloA.add(tomateR);
		boloA.add(boeufR);
		Recette bolo = new Recette("bolognaise", boloA);
		
		Aliment oeufsR = new Viande("oeuf", new Date(2015, 9, 10), 4, "");
		Aliment rapeR = new Laitier("rape", new Date(2015, 10, 6), 30, "g");
		ArrayList<Aliment> omeletteA = new ArrayList<Aliment>();
		omeletteA.add(oeufsR);
		omeletteA.add(rapeR);
		Recette omelette = new Recette("omelette", omeletteA);
		
		Aliment pouletR = new Viande("poulet", new Date(2015, 9, 8), 1000, "g");
		Aliment fritesR = new Legume("frites", new Date(2016, 9, 10), 600, "g");
		ArrayList<Aliment> chickenA = new ArrayList<Aliment>();
		chickenA.add(pouletR);
		chickenA.add(fritesR);
		Recette chickNFries = new Recette("chickNFries", chickenA);
		
		Aliment haricotsR = new Legume("haricots", new Date(2015, 9, 20), 150, "g");
		Aliment dindeR = new Viande("dinde", new Date(2015, 9, 30), 300, "g");
		Aliment cremeFraicheR = new Laitier("creme", new Date(2015, 9, 15), 20, "g");
		ArrayList<Aliment> escalopeA = new ArrayList<Aliment>();
		escalopeA.add(haricotsR);
		escalopeA.add(dindeR);		
		escalopeA.add(cremeFraicheR);
		Recette escalope = new Recette("escalope de dinde a la creme + haricots", escalopeA);
		
		frigo.setListeRecettes(bolo);
		frigo.setListeRecettes(escalope);
		frigo.setListeRecettes(chickNFries);
		frigo.setListeRecettes(omelette);
		
		System.out.println(frigo.recetteContenu());
		return frigo;
	}
	
}
