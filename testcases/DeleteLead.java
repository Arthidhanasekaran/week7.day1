package testcases;

import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

@Test
public class DeleteLead extends BaseHooks{
	
	public void runDeleteLead() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUserName().enterPswd()
		.clickLogin().clickCRMSFA()
		.clickLeads().clickFindLeads()
		.clickPhone().enterPhoneNumber()
		.clickFindLeadsButton().clickFirstResult()
		.clickDeleteButton();
	}

}
