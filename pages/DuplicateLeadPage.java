package pages;

import org.openqa.selenium.By;

import base.BaseHooks;

public class DuplicateLeadPage extends BaseHooks{
	
	public ViewLeadPage clickDuplicatePageSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();

	}

}
