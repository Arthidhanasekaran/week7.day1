package testcases;

import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

public class CreateLead extends BaseHooks{
	
	@Test
	public void runCreateLead() {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUserName().enterPswd()
		.clickLogin().clickCRMSFA()
		.clickLeads().clickCreateLead()
		.enterCompanyName().enterFirstname()
		.enterLastName().clickCreateLeadButton()
		.verifyFristName();

	}

}
