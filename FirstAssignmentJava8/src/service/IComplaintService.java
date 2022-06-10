package service;

import java.io.IOException;
import java.util.List;

import model.Complaints;

public interface IComplaintService {

	
	public List<Complaints> getAllCompaint() throws IOException;
	public Complaints getComplaintsByComplaintID(long id) throws IOException ; 
	public List<Complaints> getComplaintsByYear(long year) throws IOException;
	public List<Complaints> getComplaintsByBankName(String bankName) throws IOException;
	public List<Complaints> listTimeTakenByBankToCloseComplaint() throws IOException;
		
	
}
