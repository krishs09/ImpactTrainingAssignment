package controller;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.Complaints;
import service.ComplaintServiceImpl;
import service.IComplaintService;

public class ComplaintController {

	public static void main(String[] args) throws IOException {
		IComplaintService srvc = new ComplaintServiceImpl();
		
		
		Scanner menu = new Scanner(System.in);
		System.out.println("Please select Your choice");
		System.out.println("1) Get complaints by ID"+"\n"+"2) Get complaints by Year"+"\n"+"3) Get complaints by bank name"
				+"\n"+"4) List time taken by each bank to resolve complaints"+"\n"+"0) Exit");
		int menuSelected = menu.nextInt();
		
		switch(menuSelected){
			
			case 1:
				System.out.println("<------------Get Complaints By ID------------------>");
				Scanner input = new Scanner(System.in);
				System.out.println("Please Enter complaint ID");
				long complaintID = input.nextLong();  
				
				srvc.getComplaintsByComplaintID(complaintID);
				break;
			case 2:
				System.out.println("<------------Get Complaints By Year------------------>");
				Scanner input2 = new Scanner(System.in);
				System.out.println("Please Enter Year");
				long year = input2.nextLong();  
				
				srvc.getComplaintsByYear(year);
				break;
			case 3:
				System.out.println("<---------Get Complaints By Bank Name--------------------->");
				Scanner input3 = new Scanner(System.in);
				System.out.println("Please Enter Bank name");
				String bankName = input3.next();
				
				srvc.getComplaintsByBankName(bankName);
				
				break;
			case 4:

				
				System.out.println("<---------List Tim taken by bank to close request--------------------->");
				srvc.listTimeTakenByBankToCloseComplaint();
				break;
			case 0:
				System.out.println("Thank you, good bye!");
				System.exit(0);
				break;
				
		}
		
	}

}
