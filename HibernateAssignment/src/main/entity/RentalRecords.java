package citius.tra.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RentalRecords {

	@Id
	private long rentId;
	private long movieId;
	private long membershipId;
	private LocalDateTime rentedDateTime;
	private long loanPeriod;
	private LocalDateTime returnDate;
	
	@ManyToOne
	private Movies movie;
	
	@ManyToOne
	private Membership mem;

	public long getRentId() {
		return rentId;
	}

	public void setRentId(long rentId) {
		this.rentId = rentId;
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public long getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(long membershipId) {
		this.membershipId = membershipId;
	}

	public LocalDateTime getRentedDateTime() {
		return rentedDateTime;
	}

	public void setRentedDateTime(LocalDateTime rentedDateTime) {
		this.rentedDateTime = rentedDateTime;
	}

	public long getLoanPeriod() {
		return loanPeriod;
	}

	public void setLoanPeriod(long loanPeriod) {
		this.loanPeriod = loanPeriod;
	}

	public LocalDateTime getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDateTime returnDate) {
		this.returnDate = returnDate;
	}

	public Movies getMovie() {
		return movie;
	}

	public void setMovie(Movies movie) {
		this.movie = movie;
	}

	public Membership getMem() {
		return mem;
	}

	public void setMem(Membership mem) {
		this.mem = mem;
	}
	
	
}
