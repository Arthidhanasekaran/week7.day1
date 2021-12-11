package pages;

import org.openqa.selenium.By;

import base.BaseHooks;

public class CreateLeadPage extends BaseHooks{
	
	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		return this;

	}
	
	public CreateLeadPage enterFirstname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arthi");
		return this;

	}
	
	public CreateLeadPage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
		return this;

	}
	
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();

	}

}
