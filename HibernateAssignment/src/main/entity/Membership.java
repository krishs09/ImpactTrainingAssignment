package citius.tra.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Membership {

	@Id
	private long membershipId;
	private long customerId;
	private LocalDate memStartDate;
	private long branchId;
	
	@OneToMany
	@JoinColumn(name="mem")
	private List<RentalRecords> rental;
	
	@OneToOne
	private CustomerRegistration cust;

	public long getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(long membershipId) {
		this.membershipId = membershipId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public LocalDate getMemStartDate() {
		return memStartDate;
	}

	public void setMemStartDate(LocalDate memStartDate) {
		this.memStartDate = memStartDate;
	}

	public long getBranchId() {
		return branchId;
	}

	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}

	public List<RentalRecords> getRental() {
		return rental;
	}

	public void setRental(List<RentalRecords> rental) {
		this.rental = rental;
	}

	public CustomerRegistration getCust() {
		return cust;
	}

	public void setCust(CustomerRegistration cust) {
		this.cust = cust;
	}
	
	
}
