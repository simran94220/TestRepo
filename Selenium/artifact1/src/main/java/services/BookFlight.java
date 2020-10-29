package services;
import helper.InitObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
public class BookFlight extends InitObjects {

	public void bookFlight(String source, String Destination,String address, String name, 
			String city, String state, int Zipcode, String CardType,
			int ccNumber, int month, int year, String NameOnCard) {
		
		Select src= new Select(driver.findElement(By.name("fromPort")));
		src.selectByVisibleText(source);
		Select dest= new Select(driver.findElement(By.name("toPort")));
		dest.selectByVisibleText(Destination);
		Submit.click();
		Book3rdFlight.click();
		inputName.sendKeys(name);
		inputAddress.sendKeys(address);
		inputcity.sendKeys(city);
		inputstate.sendKeys(state);
		inputzipCode.sendKeys(String.valueOf(Zipcode));
		inputcreditCardNumber.sendKeys(String.valueOf(ccNumber));
		inputnameOnCard.sendKeys(NameOnCard);
		Submit.click();
	}
}
