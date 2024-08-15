package makeMyTripObjects;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class M3_FillDeatilsObject
{
	WebDriver driver;
	
	public M3_FillDeatilsObject(WebDriver driver) 
	{
		this.driver=driver;
	}	

// WebElement Object for unsecured flight fill all necessary details
	
	private By ok=By.xpath("//button//font[text()='CONTINUE']");
	private By radiobutton=By.xpath("//p//span[text()=' I will book without trip secure.']/b");
	

//	WebElement Object to fill all necessary details
	
	private By checkbox=By.xpath("//div//button[@class='addTravellerBtn' and @type='button']");
	private By fname=By.xpath("//input[@placeholder='First & Middle Name']");
	private By lname=By.xpath("//input[@placeholder='Last Name']");
	private By gender=By.xpath("//div[@class='selectTab ']");

	private By mobNo=By.xpath("//input[@placeholder='Mobile No']");
	private By email=By.xpath("//input[@class='tvlrInput ' and @placeholder='Email']");
	private By cemail=By.xpath("//div[@class='emailIds-dropdown']");
	
	private By gst=By.xpath("//p[@class='checkboxWithLblWpr__label' and text()='Confirm and save billing details to your profile']");
	
//	WebElement Object to proceed with all necessary details
	
	private By continueButton=By.xpath("//button[text()='Continue']");
	private By confirm=By.xpath("//button[@class='button buttonPrimary buttonBig fontSize14' and text()='CONFIRM']");
	
// Public methods to perform actions on the webElement Objects
	
	public void verifyTripDetails() throws Exception 
	{
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent window session id is: "+parentWindow);
		
		Set<String>childWindow=driver.getWindowHandles();
		System.out.println("child window session id is: "+childWindow);
		
		for(String i:childWindow) 
		{
			if(!parentWindow.equals(i)) 
			{
				driver.switchTo().window(i);	// switch to new window			
			}
		}
		
		//driver.findElement(ok).click();
		driver.findElement(radiobutton).click();		
/*
		if(ok!= null) 
		{
			driver.findElement(ok).click();
		}
*/		
		Thread.sleep(3000);;
		driver.findElement(checkbox).click();
		driver.findElement(fname).sendKeys("Pradip");
		driver.findElement(lname).sendKeys("Shimpi");
		
		List<WebElement>gen=driver.findElements(gender);
		for(WebElement i:gen) 
		{
			System.out.println(i.getText());
			if(i.getText().contains("MALE")) 
			{
				i.click();
				System.out.println("Male Selected"); //defect [Selected as Female]
				break;
			}
		}
				
		driver.findElement(mobNo).sendKeys("1234567890");
		driver.findElement(email).sendKeys("youremail@gmail.com");
		Thread.sleep(2000);		
		driver.findElement(cemail).click();
		
		driver.findElement(gst).click(); // ElementNotInteractableException
	
		driver.findElement(continueButton).click();	
		
		driver.findElement(confirm).click();

	}
	
	
	
	
	
	
	
}
