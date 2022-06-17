package test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import citius.tra.dao.BlockBusterDao;
import citius.tra.entity.CustomerRegistration;
import citius.tra.entity.Movies;
import citius.tra.entity.RentalRecords;

public class MoviesTest {

	@Test
	public void addStocks() {
		
		Movies movie = new Movies();
		movie.setId(1);
		movie.setMovieName("The Dark Night");
		movie.setDuration(23444);
		movie.setReleaseDate(LocalDate.of(2011, 2, 13));
		movie.setCertificate("UA");
		movie.setCountryOfOrigin("USA");
		
		BlockBusterDao dao = new BlockBusterDao();
		dao.addStocks(movie);
	}
	
	@Test
	public void updateStocks() {
		
		Movies movie = new Movies();
		movie.setId(1);
		movie.setMovieName("The Dark Night");
		movie.setDuration(23444);
		movie.setReleaseDate(LocalDate.of(2011, 2, 13));
		movie.setCertificate("UA");
		movie.setCountryOfOrigin("USA");
		
		BlockBusterDao dao = new BlockBusterDao();
		dao.addStocks(movie);
	}

	@Test
	public void addCust() {
		CustomerRegistration cust = new CustomerRegistration();
		cust.setAddress("ADDress 1");
		cust.setCustName("ABC");
		cust.setDob(LocalDate.of(1998, 12, 2));
		BlockBusterDao dao = new BlockBusterDao();
		dao.addCustomer(cust);
	}
	
	@Test
	public void rentMovie() {
		RentalRecords rent = new RentalRecords();
		rent.setLoanPeriod(24);
		rent.setMembershipId(1);
		rent.setMovieId(1);
		rent.setRentedDateTime(LocalDateTime.now());
		BlockBusterDao dao = new BlockBusterDao();
		dao.rentMovie(rent);
	}
}
