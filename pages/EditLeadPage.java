package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class EditLeadPage extends BaseHooks {
	
	public EditLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public EditLeadPage enterCompanyName() {
		WebElement findElement = driver.findElement(By.id("updateLeadForm_companyName"));
		findElement.clear();
		findElement.sendKeys("TCS");
		return this;
	}
	
	public ViewLeadPage clickEditPageUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
        return new ViewLeadPage(driver);
	}
	
	

}
