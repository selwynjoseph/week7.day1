package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC2_VerifyLogin extends BaseClass{
	
	@BeforeTest
	public void setValue() {
		excelFileName="VerifyLogin";

	}
	
	@Test(dataProvider="provideData")
	public void verifyLogin(String username, String password) {
		
		
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(username)
		.enterPassword(password)
		.clickLoginButton()
		.verifyHomePage();

	}

}
