package makeMyTripObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class M1_SearchFlightObjects
{
	WebDriver driver;
	
	public M1_SearchFlightObjects(WebDriver driver) 
	{
		this.driver=driver;
	}
	
// WebElement Object to choose way of travel mode
	
	private By roundTrip=By.xpath("//ul//li[@data-cy='roundTrip']"); // 2 way trip
	
// WebElement Object to select from destination (Pune)
	
	private By fromCity = By.id("fromCity");
	private By fromAirport=By.xpath("//p[text()='Pune Airport']");  
	
// Selecting To destination (Mumbai (via New-Delhi))	
	
	private By toCity=By.id("toCity");
	private By toAirport=By.xpath("//p[text()='Chhatrapati Shivaji International Airport']");
	
// WebElement Object to select dates of Departure and Arrival
	
	private By dates= By.xpath("//div[@class='DayPicker-Week' and @role='row'] //div[@aria-label='Fri Aug 09 2024']");
	private By date2=By.xpath("//div[@class='DayPicker-Week' and @role='row'] //div[@aria-label='Sun Aug 11 2024']");
	
// WebElement Object to select a Travel Class
	
	private By travelClass=By.xpath("//span[@class='lbl_input appendBottom5']");
	private By travelClassb=By.xpath("//ul//li[text()='Business']");
	private By travelApply=By.xpath("//button[text()='APPLY']");

// WebElement Object to search All available flights	
	
	private By searchFlights=By.xpath("//p//a[text()='Search']");
		
	
// Public methods to perform actions on the webElement Objects
	
	public void verifyRoundTrip() 
	{
		driver.findElement(roundTrip).click();		
	}
	
	public void verifyFromCity() 
	{
		driver.findElement(fromCity).sendKeys("Pune");
		driver.findElement(fromAirport).click();		
	}
	
	public void verifyToCity() 
	{
		driver.findElement(toCity).sendKeys("Mumbai");
		driver.findElement(toAirport).click();
	}
	
	public void verifyDates() 	
	{
		driver.findElement(dates).click();
		driver.findElement(date2).click();
	}
	
	public void verifyTravelClass() 
	{
		driver.findElement(travelClass).click();
		driver.findElement(travelClassb).click();
		driver.findElement(travelApply).click();
	}
	
	public void verifySearchFlights() 
	{
		driver.findElement(searchFlights).click();
		
		//MakeMyTrip security measures does not allows automated operations further using
		//selenium, hence twik url by replacing 'false' keyword to 'true' in url
		
		driver.navigate().to("https://www.makemytrip.com/flight/search?itinerary=PNQ-BOM-09/08/2024_BOM-PNQ-11/08/2024&tripType=R&paxType=A-1_C-0_I-0&intl=true&cabinClass=B&ccde=IN&lang=eng");	
	}
	
}
