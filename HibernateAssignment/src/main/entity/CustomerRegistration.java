package citius.tra.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CustomerRegistration {

	@Id
	private long custId;
	private String custName;
	private String address;
	private LocalDate dob;
	private long membershipId;
	
	@OneToOne
	@JoinColumn(name="cust")
	private Membership mem;

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public long getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(long membershipId) {
		this.membershipId = membershipId;
	}

	public Membership getMem() {
		return mem;
	}

	public void setMem(Membership mem) {
		this.mem = mem;
	}
	
	
	
}
