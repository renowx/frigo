package frigo;

import java.util.ArrayList;
import java.util.Date;


public class Main {
	
	public static void main (String [] arg  ){
		
		 Frigo frigo = new Frigo();
		 Aliment tomate = new Aliment("tomate", "legume", new Date(2015, 12, 6), 4, "");
		 Aliment eggs = new Aliment("egg", "viande", new Date(2015, 9, 10), 4, "");
		 Aliment beurre = new Aliment("beurre", "laitier", new Date(2015, 10, 6), 250, "g");
		 
		 frigo.setAliments(tomate);
		 frigo.setAliments(eggs);
		 frigo.setAliments(beurre);
		 
		 System.out.println(tomate);
		 System.out.println(eggs);
		 System.out.println(frigo.toString());
		 
		 
	}

	
}

