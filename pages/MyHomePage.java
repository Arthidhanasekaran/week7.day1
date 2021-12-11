package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseHooks;

public class MyHomePage extends BaseHooks{
	
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);

	}
	     
	
	

}
