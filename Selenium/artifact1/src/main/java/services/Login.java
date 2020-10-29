package services;
import helper.InitObjects;

import org.openqa.selenium.*;
public class Login  extends InitObjects{

	public void loginUser(String username,String password1) {
		try {
			home.click();
			Thread.sleep(5000);;
			email.sendKeys(username);
			password.sendKeys(password1);
			Submit.click();
			
		}catch(Exception e) {
			System.out.println("Exception in Login found:"+e.getMessage());
		}
	}

}
