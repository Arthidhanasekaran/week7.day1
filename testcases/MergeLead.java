package testcases;

import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

public class MergeLead  extends BaseHooks{
	
	@Test
	public void runCreateLead() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUserName().enterPswd()
		.clickLogin().clickCRMSFA()
		.clickLeads().clickMergeLeads()
		.clickFromLeadLookUp().clickToLeadLookUp()
		.clickMergeButton();

}
}
