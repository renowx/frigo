package frigo;

import java.util.Date;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestAliment extends TestCase {

	Aliment lol = new Viande("lol", new Date(2016, 12, 02), 10, "Steack");
	Aliment carotte = new Legume("carote", new Date(2015, 06, 02), 10, "");
	
	public void testPeremption(){
		Assert.assertEquals(true, lol.estConsommable());
		
	}
	
}
