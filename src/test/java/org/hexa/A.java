package org.hexa;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A {
	static WebDriver driver;

	@BeforeClass
	private void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-12\\eclipse-workspace\\Kiruba\\AbiMaven\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test(dataProvider = "login")
	
	private void tc1(String s1, String s2) {
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(s1);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(s2);
		
		WebElement btn = driver.findElement(By.xpath("//input[@value='Log In']"));
		btn.click();

	}
	@DataProvider(name="login")
	private Object [][] data() {
		return new Object[][] {{"abi","123"},{"sur","789"}};
		

	}

		
		
	@AfterClass

	private void quit() {
		driver.quit();

	}

}
