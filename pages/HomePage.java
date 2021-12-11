package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseHooks;

public class HomePage extends BaseHooks{
	
   public void verifyCRMSFAisDisplaed() { 
	   boolean displayed =driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
	  Assert.assertTrue(displayed); 
	  }
	 
	
	public MyHomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();

	}

}
