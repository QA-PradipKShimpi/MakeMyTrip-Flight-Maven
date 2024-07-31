package makeMyTripTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class M4_PayByCreditcardTestCases extends BaseClass
{
	@BeforeTest
	public void preRequisites() throws Exception 
	{
		browserSetup();					// preRequisite to launch BrowserSetup
		
		sfo.verifyRoundTrip();
		sfo.verifyFromCity();
		sfo.verifyToCity();
		sfo.verifyDates();
		sfo.verifyTravelClass();
		sfo.verifySearchFlights();		// preRequisite to Search Flights
		
		bfo.verifyVistaraFlight();
		bfo.verifyFlightSummary();
		bfo.verifyBookFlight();				
		fdo.verifyTripDetails();		// preRequisite to book Flight
		
	}
	
	@Test(description="Test Case to implement: M4_PayByCreditcardObjects Parent Class")
	public void pay() throws Exception
	{
		//pfo.verifySeats();		// Skipping real time seat booking to avoid any inconevenience to real users
		pfo.verifyPaybyCC();		// Calling M4_PayByCreditcardObjects public methods
		
  }
}
