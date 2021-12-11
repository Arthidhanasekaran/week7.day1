package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseHooks;

public class MyHomePage extends BaseHooks{
	
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();

	}
	     
	
	

}
