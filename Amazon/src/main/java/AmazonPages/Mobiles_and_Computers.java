package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.Base;

public class Mobiles_and_Computers extends Base
{
   @FindBy(xpath="//a[@id='nav-hamburger-menu']")
   WebElement all;
	
   @FindBy(xpath="//div[text()='Mobiles, Computers']")
   WebElement mobile_computer;
   
   @FindBy(xpath="//a[text()='All Mobile Phones']")
   WebElement All_mobile;
   
   @FindBy(xpath="//li[@id='sobe_d_b_4_1']//img[@alt='Shop now']")
   WebElement OnePlus_Mobile_Link;
   
   @FindBy(xpath="//span[text()='OnePlus 9R 5G (Carbon Black, 8GB RAM, 128GB Storage)']")
   WebElement OnePlus_9R;
   
   @FindBy(xpath="//span[@id='style_name_0']")
   WebElement select_storage;
   
   @FindBy(xpath="//input[@id='add-to-cart-button']")
   WebElement add_to_cart;
   
   @FindBy(xpath="//span[@id='attach-sidesheet-checkout-button']")
   WebElement proceed_to_checkout;
   
   public void mob_and_com() throws InterruptedException
   {
	   new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(all));
	   all.click();
	   Thread.sleep(1000);
	   mobile_computer.click();
	   All_mobile.click();
	   OnePlus_Mobile_Link.click();
	   OnePlus_9R.click();
	   select_storage.click();
	   add_to_cart.click();
	   proceed_to_checkout.click();
   }
   
}
