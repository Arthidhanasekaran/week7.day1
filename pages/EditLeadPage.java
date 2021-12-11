package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseHooks;

public class EditLeadPage extends BaseHooks {
	
	public EditLeadPage enterCompanyName() {
		WebElement findElement = driver.findElement(By.id("updateLeadForm_companyName"));
		findElement.clear();
		findElement.sendKeys("TCS");
		return this;
	}
	
	public ViewLeadPage clickEditPageUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
        return new ViewLeadPage();
	}
	
	

}
