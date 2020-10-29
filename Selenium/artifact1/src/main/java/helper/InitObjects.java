package helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import TravelBooking.SeleniumScenario1;
import org.openqa.selenium.support.PageFactory;
public class InitObjects  {
	
	 public static WebDriverWait wait = null;
	 public static WebDriver driver;
	 
	 // In order to use the PageFactory, first declare some fields on a PageObject that are WebElements
	 @FindBy(how = How.LINK_TEXT, using = "home")
	  public static WebElement home;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Register")
	  public static WebElement link;
	 @FindBy(how = How.CSS, using = "input#name")
	  public static WebElement name;
	 @FindBy(how = How.CSS, using = "input#company ")
	  public static WebElement company;
	 @FindBy(how = How.CSS, using ="input#email")
	  public static WebElement email;
	 @FindBy(how = How.CSS, using ="input#password") 
	  public static  WebElement password;
	 @FindBy(how =How.CSS, using="input#password-confirm")
	  public static WebElement confirmpassword;
	 @FindBy(how=How.CSS, using=".btn")
	  public static WebElement registerButton;
	 @FindBy (how=How.CSS, using=".panel-body")
	  public static WebElement message;
	 @FindBy (how=How.CSS, using=".btn-primary")
	  public static WebElement Submit;
	 @FindBy (how=How.CSS, using=".has-error")
	  public static WebElement error1;
	 @FindBy(how=How.CSS, using="tag.caret")
	  public static WebElement UserDropdown;
	 
	 
	 
	 
	 @FindBy(how = How.CSS, using = "tr:nth-child(3) .btn")
	  public static WebElement Book3rdFlight;
	 @FindBy(how = How.CSS, using = "input#inputName")
	  public static WebElement inputName;
	 @FindBy(how = How.CSS, using = "input#address")
	  public static WebElement inputAddress;
	 @FindBy(how = How.CSS, using ="input#city")
	  public static WebElement inputcity;
	 @FindBy(how = How.CSS, using ="input#state") 
	  public static  WebElement inputstate;
	 @FindBy(how =How.CSS, using="input#zipCode")
	  public static WebElement inputzipCode;
	 @FindBy(how=How.CSS, using="input#creditCardNumber")
	  public static WebElement inputcreditCardNumber;
	 @FindBy (how=How.CSS, using="input#nameOnCard")
	  public static WebElement inputnameOnCard;
	 @FindBy (how=How.CSS, using="tr:nth-child(1) > td:nth-child(2)")
	  public static WebElement ConfirmationId;
	

	  public String text =null;
	

}
