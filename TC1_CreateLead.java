package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC1_CreateLead extends BaseClass {
	
	
	@BeforeTest
	public void setValue() {
		excelFileName="CreateLead";

	}
	
	
	@Test(dataProvider="provideData")
	public void runCreateLead(String username, String password, String company, String firstname, String lastname) {
		
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(username)
		.enterPassword(password)
		.clickLoginButton()
		.verifyHomePage()
		.clickCrmSfaLink()
		.clickLeadsButton()
		.clickCreateLeadButton()
		.enterCompanyName(company)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.clickCreateLeadSubmitButton()
		.verifyViewLeadPage();
		

	}


}
