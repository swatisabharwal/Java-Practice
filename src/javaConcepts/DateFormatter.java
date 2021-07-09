package javaConcepts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DateFormatter {
	public static void main(String[] args) throws ParseException {
		String input = "15012021";
		SimpleDateFormat ft = new SimpleDateFormat("ddmmyyy");
		Date d;
		d = ft.parse(input);
		
		 System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", d);
		System.out.println("\n"+ d);
		// String str = String.format("%s %tB %<te, %<tY", "Due date:", d);
	

	}
}
