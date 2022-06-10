package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import trade.LondonDao;
import trade.Region;
import trade.RegionalDao;
import trade.RegionalDaoManager;
import trade.TradeDetails;

@ExtendWith(MockitoExtension.class)
public class RegionDaoManagerTest {

	@Mock
	RegionalDaoManager regionalDaoManager;
	
	@Mock
	RegionalDao regionDao;
	
	public void getRegionalDao_shouldreturnCorrectValue() {
		
		Mockito.when(regionalDaoManager.getRegionalDao(Mockito.any(Region.class))).thenReturn(new LondonDao());
		
		LondonDao l = new LondonDao();
		regionDao= regionalDaoManager.getRegionalDao(Region.LONDON);
		
		Assertions.assertEquals(l, regionDao);
	}
}
