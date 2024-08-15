package makeMyTripTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class M1_SearchFlightTestCases extends BaseClass 	//Inheritance by child class
{
	@BeforeTest
	public void preRequisites() throws Exception 
	{
		browserSetup();	     // preRequisite to launch BrowserSetup
	}

	@Test(description="Test Case to implement: M1_SearchFlightObjects Parent Class")
	public void flightSearching()  // Calling all M1_SearchFlightObjects public methods
	{
		sfo.verifyRoundTrip();
		sfo.verifyFromCity();
		sfo.verifyToCity();
		sfo.verifyDates();
		sfo.verifyTravelClass();
		sfo.verifySearchFlights();
	}
}
