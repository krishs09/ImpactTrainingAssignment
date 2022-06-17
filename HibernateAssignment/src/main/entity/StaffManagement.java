package citius.tra.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class StaffManagement {

	@Id
	private long staffId;
	private String staffName;
	private int shift;
	private long branchId;
	
	@OneToOne
	private Roaster roaster;
	
	@ManyToMany
	private List<BlockBusterBranches> branch;

	public long getStaffId() {
		return staffId;
	}

	public void setStaffId(long staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	public long getBranchId() {
		return branchId;
	}

	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}

	public Roaster getRoaster() {
		return roaster;
	}

	public void setRoaster(Roaster roaster) {
		this.roaster = roaster;
	}

	public List<BlockBusterBranches> getBranch() {
		return branch;
	}

	public void setBranch(List<BlockBusterBranches> branch) {
		this.branch = branch;
	}
	
	
}
