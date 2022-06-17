package citius.tra.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class BlockBusterBranches {

	@Id
	private long branchId;
	private String branchName;
	private long managerId;
	private String branchLocation;
	
	@OneToOne
	@JoinColumn(name="managerId")
	private Manager manager;
	
	@ManyToMany
	@JoinTable(name = "tbl_staff",
			joinColumns = @JoinColumn(name = "staff_id"),
				inverseJoinColumns = @JoinColumn(name = "branch_id"))
	private List<StaffManagement> staffs;

	public long getBranchId() {
		return branchId;
	}

	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public long getManagerId() {
		return managerId;
	}

	public void setManagerId(long managerId) {
		this.managerId = managerId;
	}

	public String getBranchLocation() {
		return branchLocation;
	}

	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public List<StaffManagement> getStaffs() {
		return staffs;
	}

	public void setStaffs(List<StaffManagement> staffs) {
		this.staffs = staffs;
	}

	
	
	
	
	
}
