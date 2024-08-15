package makeMyTripTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import makeMyTripObjects.M1_SearchFlightObjects;
import makeMyTripObjects.M2_BookFlightsObjects;
import makeMyTripObjects.M3_FillDeatilsObject;
import makeMyTripObjects.M4_PayByCreditcardObjects;

public class BaseClass // This is parent class
{
// declared all Object classes in Base class
	
	public WebDriver driver;
	
	public M1_SearchFlightObjects sfo;
	public M2_BookFlightsObjects bfo;
	public M3_FillDeatilsObject fdo;
	public M4_PayByCreditcardObjects pfo;  
	
// Browser setup
	
	public void browserSetup() throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		
// Objects of all Object classes
		
		sfo=new M1_SearchFlightObjects(driver);
		bfo=new M2_BookFlightsObjects(driver);
		fdo=new M3_FillDeatilsObject(driver);
		pfo=new M4_PayByCreditcardObjects(driver);
		
	}
	
}
