package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	
	public ViewLeadPage(ChromeDriver driver)
	{
		this.driver=driver;
	}

public ViewLeadPage verifyViewLeadPage() {
		
		boolean displayed1=driver.findElement(By.xpath("//div[text()='View Lead']")).isDisplayed();
		Assert.assertTrue(displayed1);
		return this;
	}

}
