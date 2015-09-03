package frigo;

import java.util.ArrayList;
import java.util.Date;


public class Main {
	
	public static void main (String [] arg  ){
		
		 Frigo frigo = new Frigo();
		 Aliment tomate = new Aliment("tomate", "legume", Date(2015, 12, 6), 4, "");
		 Aliment eggs = new Aliment("eggs", "viande", Date(2015, 9, 10), 4, "");
		 Aliment beurre = new Aliment("beurre", "laitier", Date(2015, 10, 6), 250, "g");
		 
		 frigo.setAliments(tomate);
		 frigo.setAliments(eggs);
		 frigo.setAliments(beurre);
		 
		 
		 
	}

	private static Date Date(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}
}

