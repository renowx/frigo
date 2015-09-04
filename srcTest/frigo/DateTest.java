package frigo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

public class DateTest {

	@Test
	public void test_sur_les_dates() {
		GregorianCalendar gc = new GregorianCalendar(2015,6,23);
		Date date = gc.getTime();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Date : " + dateFormat.format(date));
		
	}
}
