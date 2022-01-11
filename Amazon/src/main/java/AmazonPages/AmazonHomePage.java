package AmazonPages;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.Base;

public class AmazonHomePage extends Base {
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement SingIn;
	
	@FindBy(id="ap_email")
	WebElement Email;
	
	@FindBy(className="a-button-input")
	WebElement Continue;
	
	@FindBy(id="ap_password")
	WebElement Password;
	
	@FindBy(id="signInSubmit")
	WebElement Submit;
		
	public void loginPage() throws Exception {
		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList-nav-line-1")));
		SingIn.click();
		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.id("ap_email")));
		Email.click();
		Email.sendKeys(getObject("Email"));
		Continue.click();
		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.id("ap_password")));
		Password.click();
		Password.sendKeys(getObject("Password"));
		Submit.click();
	}

}


//kdlkldkldkldldk
