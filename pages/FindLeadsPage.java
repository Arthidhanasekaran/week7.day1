package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class FindLeadsPage extends BaseHooks{
	
	public FindLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public FindLeadsPage clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}

	public FindLeadsPage enterPhoneNumber() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		return this;
	}
	
	public FindLeadsPage clickFindLeadsButton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	public ViewLeadPage clickFirstResult() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage(driver);
	}
	
	
	
}
