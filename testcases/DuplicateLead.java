package testcases;

import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

public class DuplicateLead  extends BaseHooks{

	@Test
	public void runDuplicateLead() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUserName().enterPswd()
		.clickLogin().clickCRMSFA()
		.clickLeads().clickFindLeads()
		.clickPhone().enterPhoneNumber()
		.clickFindLeadsButton().clickFirstResult()
		.clickDuplicateLeadButton();

	}
}
