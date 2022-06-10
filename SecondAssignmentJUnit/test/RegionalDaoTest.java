
package test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import trade.Region;
import trade.RegionalDao;
import trade.TradeDetails;

@ExtendWith(MockitoExtension.class)
public class RegionalDaoTest {

	@Mock
	RegionalDao regionalDao;
	
	@Test
	public void getTradeDetails_shouldReturnValues() {
		
		Mockito.when(regionalDao.getTradeDetails(Mockito.anyInt())).thenReturn(new TradeDetails(12,Region.LONDON,1));
		
		TradeDetails expected = new TradeDetails(12,Region.LONDON,1);
		TradeDetails actual = regionalDao.getTradeDetails(12);
		
		Assertions.assertEquals(expected, actual);
		
	}	
	
	@Test
	public void getTradeDetails_shouldNotReturnValues() {
		
		Mockito.when(regionalDao.getTradeDetails(Mockito.anyInt())).thenReturn(null);
		
		TradeDetails expected = null;
		TradeDetails actual = regionalDao.getTradeDetails(12);
		
		Assertions.assertEquals(expected, actual);
		
	}
	
	@Test
	public void getTradeDetails_shouldThrowException() {
		Mockito.when(regionalDao.getTradeDetails(Mockito.anyInt())).thenThrow(RuntimeException.class);
		
		TradeDetails t = new TradeDetails(12,Region.LONDON,1);
		
		assertThrows(RuntimeException.class, () -> regionalDao.getTradeDetails(12));
	}
	
	
}
