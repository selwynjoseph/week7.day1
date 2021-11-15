package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	//create a constructor in every class with ChromeDriver as argument
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
		
	}
	
public LoginPage enterUserName(String uName) {
		
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;

	}
	
	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;

	}
	
	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);

	}


}
