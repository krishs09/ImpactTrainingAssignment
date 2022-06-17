package citius.tra.entity;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Roaster {

	@Id
	private long shiftId;
	private LocalTime startTime;
	private LocalTime endTime;
	
	@OneToOne
	private StaffManagement stafM;

	public long getShiftId() {
		return shiftId;
	}

	public void setShiftId(long shiftId) {
		this.shiftId = shiftId;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public StaffManagement getStafM() {
		return stafM;
	}

	public void setStafM(StaffManagement stafM) {
		this.stafM = stafM;
	}
	
	
}
