package com.facebook.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegularCSS {
WebDriver driver;
	
	@BeforeMethod
	public void openFacebook() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void loginTest() {
		//CSS id
		//driver.findElement(By.cssSelector("[id='email']")).sendKeys("Faruq");
		driver.findElement(By.cssSelector("#email")).sendKeys("Faruq");
		//css name
		driver.findElement(By.cssSelector("[name='pass']")).sendKeys("far123");
		//driver.findElement(By.cssSelector(".pass")).sendKeys("far123");
		
		//start with
		driver.findElement(By.cssSelector("[id^='u_0_5_']")).click();
		//driver.findElement(By.cssSelector("#^u_0_5")).click();
		driver.quit();
	}
}
