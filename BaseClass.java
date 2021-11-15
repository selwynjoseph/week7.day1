package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class BaseClass {

public ChromeDriver driver;

public String excelFileName;


	@DataProvider
	public String[][] provideData() throws IOException{
	return ReadExcel.readData(excelFileName);
	
	}
	
	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/");

	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();

	}

}
