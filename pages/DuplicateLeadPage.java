package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class DuplicateLeadPage extends BaseHooks{
	
	public DuplicateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public ViewLeadPage clickDuplicatePageSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);

	}

}
