package com.facebook.pageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;
	String  userNameId="email";
	String passWordId="pass";
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
	}
	
	
	//@Test
	public void validLoginTest() {
		findById(userNameId).sendKeys("muhitt");
		findById(passWordId).sendKeys("ppp");
		//findById("pass").click();
		
	}
	
	//@Test
	public void inValidLoginTest() {
		findById(userNameId).sendKeys("muhitt");
		findById(passWordId).sendKeys("ppp");
		//findById("pass").click();
	}
//we were using driver for find elements so many times--	
// we were using same locators so many times
	
	@Test
	public void boundaryLoginTest() {
		findById(userNameId).sendKeys("muhitt");
		findById(passWordId).sendKeys("ppp");
		//findById("pass").click();
		
	}
	
	
	public WebElement findById(String id) {
		return driver.findElement(By.id(id));			
	}

}
