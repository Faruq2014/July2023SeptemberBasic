package com.facebook.pom_PageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithPageFactory {
	WebDriver driver;
	LoginPageWithPageFactory lpf;
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void validLoginTest() {
	lpf= new LoginPageWithPageFactory(driver);
	lpf.userNameMethod("Nurul");
	lpf.passWordMethod("uou");
	lpf.logingButton();
	}
	
	
	@Test
	public void inValidLoginTest() {
	lpf= new LoginPageWithPageFactory(driver);
	lpf.userNameMethod("Nurul");
	lpf.passWordMethod("uou");
	lpf.logingButton();
	}
	
	@Test
	public void boundaryLoginTest() {
	lpf= new LoginPageWithPageFactory(driver);
	lpf.userNameMethod("Nurul");
	lpf.passWordMethod("uou");
	lpf.logingButton();
	}

	@AfterMethod
	public void closeApp() {
		if (driver !=null) {
			driver.quit();
		}
	}
}
