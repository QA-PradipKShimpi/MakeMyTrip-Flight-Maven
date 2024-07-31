package makeMyTripTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class M5_End_To_End_Test_Case extends BaseClass
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
		bfo.verifyBookFlight();			// preRequisite to book Flight
		
		fdo.verifyTripDetails();		// preRequisite to fill trip details
		
		//pfo.verifySeats();
		pfo.verifyPaybyCC();		  	// preRequisite to Pay Flight ticket
	
}
	@Test(description="This is End to End test case")
	public void endToEndFlow() 
	{
		System.out.println("End to end Testing is completed");			
		
  }
}
