package makeMyTripObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class M4_PayByCreditcardObjects
{
	WebDriver driver;
	
	public M4_PayByCreditcardObjects(WebDriver driver) 
	{
		this.driver=driver;
	}
	
// WebElement Objects to book seats	
/*
	private By puneDelhi=By.id("PNQ$DEL$2024-08-04 05:30$UK-974_2A");	
	private By delhiMumbai=By.id("DEL$BOM$2024-08-04 08:55$UK-963_3A");
	private By mumbaiDelhi=By.id("BOM$DEL$2024-08-07 01:20$UK-984_2A");
	private By delhiPune=By.id("DEL$PNQ$2024-08-07 08:30$UK-971_2C");
	
	// ElementClickInterceptedException: for id as <div> tag is not clickable
*/	
	private By puneDelhi=By.xpath("//div[@class='seatCol']//div[@id='PNQ$DEL$2024-08-04 05:30$UK-974_2A']");
	private By delhiMumbai=By.xpath("//div[@class='seatCol']//div[@id='DEL$BOM$2024-08-04 08:55$UK-963_3A']");
	private By mumbaiDelhi=By.xpath("//div[@class='seatCol'] //div[@id='BOM$DEL$2024-08-07 01:20$UK-984_2A']");
	private By delhiPune=By.xpath("//div[@class='seatCol']//div[@id='DEL$PNQ$2024-08-07 08:30$UK-971_2C']");

// WebElement Object to proceed to payment gateway
	
	private By next=By.xpath("//button[@class='sliderNextBtn']");
	
	private By skip=By.xpath("//span[text()='Skip to add-ons']");
	
	private By payBtn=By.xpath("//button[text()='Proceed to pay']");
	
	private By continueBtn=By.xpath("//button[text()='Continue']");
	
	
	//private By payBtn=By.xpath("//button[@class='lato-black button buttonPrimary extraPadBtn fontSize16 appendTop20']");
	private By cardNum=By.id("cardNumber");
	private By name=By.id("nameOnCard");
	private By expMonth=By.xpath("//select[@name='expiryMonth']");
	private By expYear=By.xpath("//select[@name='Year']");
	private By cvv=By.xpath("//input[@id='cardCvv' or @name='cardCvv']");

// Extra necessary details for payment if information is incorrect	
	
	private By country=By.xpath("//select[@name='billingCountry']");
	private By state=By.id("billingState");
	private By address=By.id("billingAddress");
	private By city=By.id("billingCity");
	private By pincode=By.id("billingPinCode");	
	
//	Pay now and booking information
	
	private By bookingInfo=By.xpath("//div[@class='dt__payment__right make-flex column']");
	private By payNow=By.xpath("//button[@class='prime__btn   paynow__btn font16']");

	
// Public methods to perform actions on the webElement Objects	
	
	public void verifySeats() throws Exception // Pune to Mumbai via New-Delhi
	{
		Thread.sleep(2000);
		driver.findElement(puneDelhi).click();
		driver.findElement(next).click();
		
		Thread.sleep(2000);
		driver.findElement(delhiMumbai).click();
		driver.findElement(next).click();
		
		Thread.sleep(2000);
		driver.findElement(mumbaiDelhi).click();
		driver.findElement(next).click();
		
		Thread.sleep(2000);
		driver.findElement(delhiPune).click();
		Thread.sleep(2000);
	}
	
	public void verifyPaybyCC() throws Exception 
	{
		driver.findElement(skip).click();
		
		
		Thread.sleep(2000);
		driver.findElement(payBtn).click();
		
		//driver.findElement(continueBtn).click();
	
		driver.findElement(cardNum).sendKeys("0000000000000000");	
		driver.findElement(name).sendKeys("PRADIP");
		
		
		WebElement mth=driver.findElement(expMonth);		
		Select sel=new Select(mth);
		sel.selectByVisibleText("August (08)");
		
		
		WebElement year=driver.findElement(expYear);		
		Select sel2=new Select(year);
		sel2.selectByVisibleText("2028");
		
		
		driver.findElement(cvv).sendKeys("000");	
		
		WebElement desh=driver.findElement(country);
		Select sele=new Select(desh);
		sele.selectByVisibleText("India");
		
		driver.findElement(state).sendKeys("Maharashtra");
		driver.findElement(address).sendKeys("ABC College Road, xyz 123456, Pune");
		driver.findElement(city).sendKeys("Pune-MH");
		driver.findElement(pincode).sendKeys("123456");		
	
		List<WebElement> info=driver.findElements(bookingInfo);
		System.out.println("*****Booking Details*****");
		
		for(WebElement w:info) 
		{
			System.out.println(w.getText());
		}
				
		driver.findElement(payNow).click();
/* 
 * Ahh..! of course I am not gonna pay...these are not real credentials ;)
 * Thank you, if you are till here ;)
 *  
 */
		
		
	}
	
	
}
