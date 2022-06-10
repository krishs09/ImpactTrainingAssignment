package service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

import dal.ComplaintDAO;
import model.Complaints;

public class ComplaintServiceImpl implements IComplaintService{

	
	@Override
	public List<Complaints> getAllCompaint() throws IOException {
		
		return ComplaintDAO.getAllComplaints();
	}

	@Override
	public Complaints getComplaintsByComplaintID(long id) throws IOException {
		
		Complaints comp = ComplaintDAO.getAllComplaints()
				.stream()
				.filter(c->c.getComplaintId() == id)
				.reduce((u, v) -> { throw new IllegalStateException("More than one ID found");})
				.get();
		
		System.out.println(comp);
		
		return comp;
	}

	@Override
	public List<Complaints> getComplaintsByYear(long year) throws IOException {
		
		List<Complaints> complaintByYear = ComplaintDAO.getAllComplaints()
				.stream()
				.filter(c->c.getDateReceived().getDayOfYear() == year)
				.collect(Collectors.toList());
		
		
				
		complaintByYear.forEach(System.out::println);
		
		return complaintByYear;
	}

	@Override
	public List<Complaints> getComplaintsByBankName(String bankName) throws IOException {
		
		List<Complaints> complaintByBankName = ComplaintDAO.getAllComplaints()
				.stream()
				.filter(c->c.getCompany().toUpperCase().contains(bankName.toUpperCase()))
				.collect(Collectors.toList());
		
		complaintByBankName.forEach(System.out::println);
		return complaintByBankName;
	}

	@Override
	public List<Complaints> listTimeTakenByBankToCloseComplaint() throws IOException {
		
		List<Complaints> timeTakenByBank = ComplaintDAO.getAllComplaints();
		timeTakenByBank.forEach(c->{
			
			LocalDate dateReceived = c.getDateReceived();
			LocalDate dateClosed = c.getDateClosed();
			Period period = Period.between(dateReceived, dateClosed);
			
			System.out.println( "Bank Name: "+c.getCompany() +" Days : "+period.getDays());
				
		});
		return timeTakenByBank;
	}

}
