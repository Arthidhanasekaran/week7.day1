package testcases;

import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

public class EditLead extends BaseHooks{
	
	@Test
	public void runEditLead() throws InterruptedException {
		LoginPage lp = new LoginPage();
		
		lp.enterUserName().enterPswd()
		.clickLogin().clickCRMSFA()
		.clickLeads().clickFindLeads()
		.clickPhone().enterPhoneNumber()
		.clickFindLeadsButton().clickFirstResult()
		.clickEditButton().enterCompanyName()
		.clickEditPageUpdateButton();
}
}
