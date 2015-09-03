package frigo;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Test;

import frigo.Aliment;
import frigo.Frigo;
import frigo.Recette;

public class TestRecette extends TestCase {

	 
	Aliment oeuf = new Aliment("egg", "viande", new Date(2015, 9, 10), 5, "");
	Aliment beurre2 = new Aliment("beurre", "laitier", new Date(2015, 10, 6), 100, "g");
	ArrayList<Aliment> Aliment = new ArrayList<Aliment>();
	
	Frigo frigo = new Frigo();
	 Aliment eggs = new Aliment("egg", "viande", new Date(2015, 9, 10), 4, "");
	 Aliment beurre = new Aliment("beurre", "laitier", new Date(2015, 10, 6), 250, "g");
	 

				
		
		public void testRecette(){
			Aliment.add(oeuf);
			Aliment.add(beurre2);
			Recette omelette = new Recette("omelette", Aliment);
			Assert.assertEquals("omelette Ingrédients : 5 egg(s) 100g beurre(s) ", omelette.toString());
			frigo.setAliments(eggs);
			frigo.setAliments(beurre);
			Assert.assertFalse( omelette.recetteValide(frigo));

		}
}
