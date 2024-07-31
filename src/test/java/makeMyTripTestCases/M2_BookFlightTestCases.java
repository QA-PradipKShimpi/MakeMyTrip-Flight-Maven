package makeMyTripTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class M2_BookFlightTestCases extends BaseClass
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
	
	}
	
	
	@Test(description="Test Case to implement: M2_BookFlightsObjects Parent Class")
	public void flightBooking() // Calling all M2_BookFlightsObjects public methods
	{	
		bfo.verifyVistaraFlight();
		bfo.verifyFlightSummary();
		bfo.verifyBookFlight();		
  }
}
