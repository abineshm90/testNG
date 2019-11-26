package org.hexa;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class B {

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
	
	@Test
	
	private void tc2() {
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("srilekha@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("09876543");
		WebElement btn1 = driver.findElement(By.xpath("//input[@value='Log In']"));
		btn1.click();	

	}
	
	@AfterClass
	
	private void quit() {
		driver.quit();

	}
	
}
