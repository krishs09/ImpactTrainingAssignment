package service;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FormatDate {

	
	 public static LocalDate formatDate(String date) {
	         LocalDate[] parsedDate = new LocalDate[1];
	        DateTimeFormatter dFrmt1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	        DateTimeFormatter dFrmt2 = DateTimeFormatter.ofPattern("MM-dd-yy");
	        DateTimeFormatter dFrmt3 = DateTimeFormatter.ofPattern("MM/dd/yy");
	        DateTimeFormatter dFrmt4 = DateTimeFormatter.ofPattern("DD/MM/YYYY");
	        DateTimeFormatter dFrmt5 = DateTimeFormatter.ofPattern("YY/MM/DD");
	        DateTimeFormatter dFrmt6 = DateTimeFormatter.ofPattern("M/D/YY");
	        DateTimeFormatter dFrmt7 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
	        DateTimeFormatter dFrmt8 = DateTimeFormatter.ofPattern("MM/dd/yy");

	        List<DateTimeFormatter> df = new ArrayList<>();

	        df.add(dFrmt1);
	        df.add(dFrmt2);
	        df.add(dFrmt3);
	        df.add(dFrmt4);
	        df.add(dFrmt5);
	        df.add(dFrmt6);
	        df.add(dFrmt7);
	        df.add(dFrmt8);

	        df.forEach(eachDateFrmt -> {

	            try {
	                parsedDate[0] = LocalDate.parse(date, eachDateFrmt);
	            }
	            catch (DateTimeException e) {
	            	e.printStackTrace();
	            }
	        } );

	        return parsedDate[0];


	    }

}
