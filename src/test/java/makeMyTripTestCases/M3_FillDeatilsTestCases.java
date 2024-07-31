package makeMyTripTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class M3_FillDeatilsTestCases extends BaseClass
{
	@BeforeTest
	public void preRequisites() throws Exception 
	{
		browserSetup();				// preRequisite to launch BrowserSetup
		
		sfo.verifyRoundTrip();
		sfo.verifyFromCity();
		sfo.verifyToCity();
		sfo.verifyDates();
		sfo.verifyTravelClass();
		sfo.verifySearchFlights();	// preRequisite to Search Flights
		
		bfo.verifyVistaraFlight();
		bfo.verifyFlightSummary();
		bfo.verifyBookFlight();		// preRequisite to book Flight
		
	}
	
	@Test (description="Test Case to implement: M3_FillDeatilsObject Parent Class")
	public void travelDetails() throws Exception 
	{
		fdo.verifyTripDetails();	// Calling M3_FillDeatilsObject public method
	}
}
