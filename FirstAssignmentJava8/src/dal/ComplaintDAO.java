package dal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import model.Complaints;

public class ComplaintDAO {

	
	public static List<Complaints> getAllComplaints() throws IOException{
		
		List<Complaints> compList = new ArrayList<>();
		try {
			CSVReader reader = 
					new CSVReaderBuilder(new FileReader("C:\\Users\\KrishnaY3\\Downloads\\complaints.csv"))
					.withSkipLines(1)
					.build();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/d/yyyy");
			
			
			
			compList = reader.readAll().stream().limit(5).map(data-> {
					Complaints comp= new Complaints();
					comp.setDateReceived(LocalDate.parse(data[0],formatter));
					comp.setProduct(data[1]);
					comp.setSubProduct(data[2]);
					comp.setIssue(data[3]);
					comp.setSubIssue(data[4]);
					comp.setCompany(data[5]);
					comp.setState(data[6]);
					comp.setZipcode(Long.valueOf(data[7]));
					comp.setSubmittedVia(data[8]);
					comp.setDateClosed(LocalDate.parse(data[9], formatter));
					comp.setCompanyResponse(data[10]);
					comp.setTimelyesponse(data[11] == "Yes" || data[11].equals("Yes") ?  true :false);
					comp.setConsumeDisputed(data[12] == "Yes" || data[12].equals("Yes") ?  true :false);
					comp.setComplaintId(Long.valueOf(data[13]));
					
				    return comp;
				}).collect(Collectors.toList());
				
		//	compList.forEach(System.out::println);
					
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return compList;
	}
	
}
