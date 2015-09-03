package frigo;

import java.util.ArrayList;

public class Frigo {

	ArrayList<Aliment> aliments;
	
	public Frigo() {
		this.aliments = new ArrayList<Aliment>();
	}
	
	public ArrayList<Aliment> getAliments() {
		return aliments;
	}
	
	public void setAliments(ArrayList<Aliment> aliments) {
		this.aliments = aliments;
	}
	
	
}
