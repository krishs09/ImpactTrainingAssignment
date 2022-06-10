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
		
		
		System.out.println("<------------Get Complaints By ID------------------>");
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter complaint ID");
		long complaintID = input.nextLong();  
		
		srvc.getComplaintsByComplaintID(complaintID);
		
	
		
		System.out.println("<------------Get Complaints By Year------------------>");
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please Enter Year");
		long year = input2.nextLong();  
		
		srvc.getComplaintsByYear(year);
		
		
		System.out.println("<---------Get Complaints By Bank Name--------------------->");
		Scanner input3 = new Scanner(System.in);
		System.out.println("Please Enter Bank name");
		String bankName = input3.next();
		
		srvc.getComplaintsByBankName(bankName);
		
		
		System.out.println("<---------List Tim taken by bank to close request--------------------->");
		srvc.listTimeTakenByBankToCloseComplaint();
		
		
		
	}

}
