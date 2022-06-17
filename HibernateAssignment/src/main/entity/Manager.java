package citius.tra.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Manager {

	@Id
	private long managerId;
	private String managerName;
	private long branchId;
	
	@OneToOne
	private BlockBusterBranches branch;

	public long getManagerId() {
		return managerId;
	}

	public void setManagerId(long managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public long getBranchId() {
		return branchId;
	}

	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}

	public BlockBusterBranches getBranch() {
		return branch;
	}

	public void setBranch(BlockBusterBranches branch) {
		this.branch = branch;
	}

	
}
