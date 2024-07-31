package makeMyTripObjects;

public class About_MakeMyTrip_MavenProject
{
/* ProjectDetails
 * 
 *  This is real time project on the Make My Trip web application.
 *  It provides online travel services including airline tickets, domestic and
 *  international holiday packages, hotel reservations, rail and bus tickets etc.
 *  
 *  This is a Smoke testing automted scenatio to book flight from given
 *  two locations. It included operations like searching a flights, selecting dates,
 *  Travel class, Select flight, fetch useful details and proceed with the payment after
 *  filling necessary details.
 *  
 *  Encapsulation priciple is used to hide data but provide a public layer to access the feature
 *  Using Inheritance concept child class can object Base parent class.
 *  project is made in the Maven framework to avoid downloading jars and adding jars.
 *  TestNG is popular framework is used so that I don't require main method to run and I call
 *  call Before Test annotations to run preRequisites to perform Test case.
 *  Page Object Model Framework is best suitable as it separates out webElements from the test cases
 *  through which we can quickly update details if application is modified.
 *  By locator startegy is used in POM instead of PageFactory strategy.
 *  
 *  WebDriver is declared on class level and constructor is defined to invoke Class object
 *  Base class is where all objects are declared and instead of test cases calling respective
 *  Parent class, they can call only Base class. 
 *  FindElement(s) methods along with webElement operationm methods are used widely.
 *  ForEachLoop, Select Class, Navigation, WindowHandling etc are also used.
 *  
 *  
 *  Challenges:
 *  NoSuchElementException
 *  ElementInterceptedException as x tag is not clickable
 *  Flights related information update-need to update script accordigly
 *  popup while script is being executed
 *  
 *  
 *   *  Thank you!
 *    	
 */

}
