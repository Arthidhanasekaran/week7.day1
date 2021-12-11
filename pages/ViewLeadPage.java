package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseHooks;

public class ViewLeadPage extends BaseHooks{
	
	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public ViewLeadPage verifyFristName() {
		boolean displayed =driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();
		  Assert.assertTrue(displayed);
		  return this;

	}
	
	public MyLeadsPage clickDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadsPage(driver);

	}
	
	public DuplicateLeadPage clickDuplicateLeadButton() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);

	}
	
	public EditLeadPage clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);

	}

}
