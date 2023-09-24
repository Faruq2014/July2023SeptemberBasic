package com.facebook.pageObjecModel_LoginTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.pageObjecModel_LoginPages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;
	LoginPage loginPage; //building has a relationship with LoginPage
	
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test(priority=1)
	public void validLoginTest() {
		loginPage=new LoginPage(driver);
		loginPage.userName("ff");
		loginPage.password("JLKKL");
		loginPage.clickLoginButton();
		
	}
	
	@Test(priority=2)
	public void invalidLoginTest() {
		loginPage=new LoginPage(driver);
		loginPage.userName("ll");
		loginPage.password("kkj123");
		loginPage.clickLoginButton();
		
	}
	@AfterMethod
	public void closeApp() {
		if (driver !=null) {
			driver.quit();
		}
	}

}
