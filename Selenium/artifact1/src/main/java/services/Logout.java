package services;
import helper.InitObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
public class Logout extends InitObjects{

	public void userLogout() {
		try {
			Select drp= new Select(driver.findElement(By.className("caret")));
			drp.selectByVisibleText("Logout");
	}catch(Exception e) {
		System.out.println("Exception in logout found!:"+e.getMessage());
	}
	}

}
