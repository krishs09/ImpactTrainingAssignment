package model;

import java.time.LocalDate;

public class Complaints {

	private LocalDate dateReceived;
	private String product;
	private String subProduct;
	private String issue;
	private String subIssue;
	private String company;
	private String state;
	private long zipcode;
	private String submittedVia;
	private LocalDate dateClosed;
	private String companyResponse;
	private boolean timelyesponse;
	private boolean consumeDisputed;
	private long complaintId;
	
	public Complaints() {
		super();
	}
	public Complaints(LocalDate dateReceived, String product, String subProduct, String issue, String subIssue,
			String company, String state, long zipcode, String submittedVia, LocalDate dateClosed,
			String companyResponse, boolean timelyesponse, boolean consumeDisputed, long complaintId) {
		super();
		this.dateReceived = dateReceived;
		this.product = product;
		this.subProduct = subProduct;
		this.issue = issue;
		this.subIssue = subIssue;
		this.company = company;
		this.state = state;
		this.zipcode = zipcode;
		this.submittedVia = submittedVia;
		this.dateClosed = dateClosed;
		this.companyResponse = companyResponse;
		this.timelyesponse = timelyesponse;
		this.consumeDisputed = consumeDisputed;
		this.complaintId = complaintId;
	}
	public LocalDate getDateReceived() {
		return dateReceived;
	}
	public void setDateReceived(LocalDate dateReceived) {
		this.dateReceived = dateReceived;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getSubProduct() {
		return subProduct;
	}
	public void setSubProduct(String subProduct) {
		this.subProduct = subProduct;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getSubIssue() {
		return subIssue;
	}
	public void setSubIssue(String subIssue) {
		this.subIssue = subIssue;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	public String getSubmittedVia() {
		return submittedVia;
	}
	public void setSubmittedVia(String submittedVia) {
		this.submittedVia = submittedVia;
	}
	public LocalDate getDateClosed() {
		return dateClosed;
	}
	public void setDateClosed(LocalDate dateClosed) {
		this.dateClosed = dateClosed;
	}
	public String getCompanyResponse() {
		return companyResponse;
	}
	public void setCompanyResponse(String companyResponse) {
		this.companyResponse = companyResponse;
	}
	public boolean getTimelyesponse() {
		return timelyesponse;
	}
	public void setTimelyesponse(boolean timelyesponse) {
		this.timelyesponse = timelyesponse;
	}
	public boolean getConsumeDisputed() {
		return consumeDisputed;
	}
	public void setConsumeDisputed(boolean consumeDisputed) {
		this.consumeDisputed = consumeDisputed;
	}
	public long getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(long complaintId) {
		this.complaintId = complaintId;
	}
	@Override
	public String toString() {
		return "Complaints [dateReceived=" + dateReceived + ", product=" + product + ", subProduct=" + subProduct
				+ ", issue=" + issue + ", subIssue=" + subIssue + ", company=" + company + ", state=" + state
				+ ", zipcode=" + zipcode + ", submittedVia=" + submittedVia + ", dateClosed=" + dateClosed
				+ ", companyResponse=" + companyResponse + ", timelyesponse=" + timelyesponse + ", consumeDisputed="
				+ consumeDisputed + ", complaintId=" + complaintId + "]";
	}
	
	
}
