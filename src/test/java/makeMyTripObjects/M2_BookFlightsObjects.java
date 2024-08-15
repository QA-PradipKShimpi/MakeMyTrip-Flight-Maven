package makeMyTripObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class M2_BookFlightsObjects
{
	WebDriver driver;
	
	public M2_BookFlightsObjects(WebDriver driver) 
	{
		this.driver=driver;
	}

// WebElement Object to select checkbox for vistara flight
	
	private By vistara=By.xpath("//p[text()='Vistara (12)  ']");

// WebElement Object to get vistara flight information
	
	private By details=By.xpath("//span[@class='bizClsLinkText']");
	private By price=By.xpath("//div[@class='bizClsListingDetailsHead']");
	private By summary=By.xpath("//div[@class='bizClsListingExpandedSec rt']");
	private By summary2=By.xpath("//div[@class='bizClsDetailCard bizClsReturnDetailCard bizClsAnimateIn']");
	
// 	WebElement Object to book vistara flight and some information
	
	private By book=By.xpath("//span[text()='Select flight']");
	private By bookNowDetails=By.xpath("//div[@class='fareFamilyCardBox glider-slide active visible left-1']");
	private By bookNowButton=By.xpath("//button[text()='BOOK NOW'][1]");
	

// Public methods to perform actions on the webElement Objects	
	
 	public void verifyVistaraFlight() 
	{
		driver.findElement(vistara).click();		
	}
	
	public void verifyFlightSummary() 
	{
		List<WebElement> ele=driver.findElements(price);
		System.out.println("******Details******");
		
		for(WebElement i:ele) 
		{
			System.out.println(i.getText());
		}
		
		driver.findElement(details).click();
		
		List<WebElement>sum=driver.findElements(summary);
		System.out.println("******Deaprture Summary******");
		
		for(WebElement i:sum) 
		{
			System.out.println(i.getText());
		}
	
		List<WebElement>sum2=driver.findElements(summary2);
		System.out.println("******Arrival Summary******");
		
		for(WebElement i:sum2) 
		{
			System.out.println(i.getText());
		}
	
	}
	
	
	public void verifyBookFlight() 
	{
		driver.findElement(book).click();
		
		List<WebElement> bnd=driver.findElements(bookNowDetails);
		
		System.out.println("****** BookNow Modal Details ******");
		
		for(WebElement i:bnd) 
		{
			System.out.println(i.getText());
		}
			
		driver.findElement(bookNowButton).click();

	}
	
}
