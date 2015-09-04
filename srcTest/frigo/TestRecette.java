package frigo;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;

import junit.framework.Assert;
import junit.framework.TestCase;

import frigo.Aliment;
import frigo.Frigo;
import frigo.Recette;

public class TestRecette extends TestCase {

	 
	Aliment oeuf = new Viande("egg", new Date(2015, 9, 10), 5, "");
	Aliment beurre2 = new Laitier("beurre", new Date(2015, 10, 6), 100, "g");
	ArrayList<Aliment> Aliment = new ArrayList<Aliment>();
	
	Frigo frigo = new Frigo();
	 Aliment eggs = new Viande("egg", new Date(2015, 9, 10), 4, "");
	 Aliment beurre = new Laitier("beurre", new Date(2015, 10, 6), 250, "g");
	 

				
		
		public void testRecette(){
			Aliment.add(oeuf);
			Aliment.add(beurre2);
			Recette omelette = new Recette("omelette", Aliment);
			//Assert.assertEquals("omelette Ingrédients : 5 egg(s) 100g beurre(s) ", omelette.toString());
			frigo.setAliments(eggs);
			frigo.setAliments(beurre);
			Assert.assertEquals(omelette.recetteValide(frigo), "Recette impossible !");

		}
}
