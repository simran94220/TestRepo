package TravelBooking;
import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import helper.InitObjects;
import services.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test; 
public class SeleniumScenario1 extends InitObjects {
	 //InitObjects in=new InitObjects();
	 @BeforeMethod
	 public void beforeTest() {    
	 System.out.println("before test method");  
	 System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

   driver.get("https://blazedemo.com");
    driver.manage().window().maximize();
// In order for this code to work and not throw a NullPointerException because 
// the "login", "pwd" user "submit" fields aren't instantiated, we need to initialise the PageObject

    PageFactory.initElements(driver, InitObjects.class);

// Once Instantiated, we can now use the above created WebElements
	 } 

		
		 @Test(priority=0)
		 public  void register() throws InterruptedException{
			
			 String email1="test.test2@test.in";
			 String name1="Jerry";
			 String company1="XYZ";
			 String pwd="temp@123";
			Register r= new Register();
				 r.registerUser( email1,name1,company1,pwd);
		
		        Thread.sleep(1000);
		        AssertJUnit.assertTrue(message.getText().contains("You are logged in!"));
		     
		
		 }
		 
		 @Test(priority=1)
		 public  void loginlogoutUserPositive() throws InterruptedException{
			
			 String username1="test.test2@test.in";
			 String pwd="temp@123";
			 Login l= new Login();
				 l.loginUser(username1,pwd);
						 //AssertJUnit.assertTrue(message.getText().contains("You are logged in!")
		        Thread.sleep(1000);
		        if(message.getText().contains("You are logged in!"))
		        {
		        System.out.println("LoginUserPostive Test Passed!");
		        }else{
		        System.out.println("LoginUserPostive Test Failed!");
		        }
		 
		        Logout lo= new Logout();
				 lo.userLogout();
						 //AssertJUnit.assertTrue(message.getText().contains("You are logged in!")
		        Thread.sleep(1000); 
		        if(message.getText().contains("You are logged in!"))
		        {
		        System.out.println("Logout Test Passed!");
		        }else{
		        System.out.println("Logout Test Failed!");
		        }
		     
	}
		
			
		 @Test(priority=2)
		 public  void BookFlight() throws InterruptedException{
			 try {
				 BookFlight b=new BookFlight();
				 String source="Paris";
				String Destination="London";
				int Zipcode=60657;
				String state="Illinois";
				String CardType="Visa";
				String city="Chicago";
				int ccNumber=36721783;
				int month=11;
				int year=2017;
				String NameOnCard="Jerry Smith";
				String name1="Jerry Smith";
				String address1="5th street, 2nd cross";
				b.bookFlight(source, Destination,address1,name1, 
							 city,  state,  Zipcode,  CardType,
							 ccNumber,  month,  year,  NameOnCard);
						
						if(ConfirmationId!=null) {
							System.out.println("Your booking is confirmed! Id is: "+ConfirmationId.getText());
						}
						else {
							System.out.println("Failed to find confirmation ID.");
						}
			 }catch(Exception e) {
				 System.out.println("Exception occurred!:"+e.getMessage());
			 }
		 }
		 
		     
		 
	 @Test(priority=3)
	 public  void loginUserNegative() throws InterruptedException{
		
		 String username1="na.na@na.in";
		 String pwd="temp@123";
		 Login l= new Login();
			 l.loginUser(username1,pwd);
					 
	        Thread.sleep(1000);
	        if(error1.getText().contains("These credentials do not match our records.!"))
	        		{
	        	System.out.println("LoginUserNegative test Passed!");
	        }else {
	        	System.out.println("LoginUserNegative test Failed!");
	        }
	        }
	     

		 @AfterMethod
		 public void AfterTest() {
			 driver.quit(); 
		 }
}

