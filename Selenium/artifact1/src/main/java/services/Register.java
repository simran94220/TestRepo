package services;
import helper.InitObjects;
import org.openqa.selenium.*;

public class Register extends InitObjects {

	public void registerUser(String email1,String name1, String company1, String pwd) throws InterruptedException {
		try {
		home.click();	
		//driver.switchTo().defaultContent();
 		link.click();
		Thread.sleep(5000);
        name.sendKeys(name1);
        company.sendKeys(company1);
        email.sendKeys(email1);
        password.sendKeys(pwd);
        confirmpassword.sendKeys(pwd);
        
        registerButton.click();
	}catch(Exception e) {
		System.out.println("Exception in register found:"+e.getMessage());
	}
	}
}
