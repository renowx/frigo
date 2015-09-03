package frigo;

import java.util.Date;

import org.junit.*;

public class Test {
	
	public void testAliment(){
		Aliment tomate = new Aliment("tomate", "fruits", new Date(2015, 12, 3), 4, "");
		Assert.assertEquals("4 tomate(s)", tomate.toString());
	}
	
}
