package pages;

import org.openqa.selenium.By;

import base.BaseHooks;

public class MyLeadsPage extends BaseHooks{
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();

	}
	
	public FindLeadsPage clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage();
	}

	public MergeLeadsPage clickMergeLeads() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadsPage();

	}
}
