package frigo;

import java.util.Date;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestGene extends TestCase {
	Aliment tomate = new Legume("tomate", new Date(2015, 9, 26), 4, "");
	
	public void testAliment(){
		Assert.assertEquals("4 tomate(s)", tomate.toString());
	}
	
}
