package com.facebook.findElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {
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
	public void listOfElements() {
		List<WebElement> languagesList=driver.findElements(By.xpath("//div[@id='pageFooter']/ul/li"));
		
		for (WebElement language : languagesList) {
			System.out.println(language.getText());
		}
		
	//Xpath traverse =//div[@id='pageFooter']/ul/li
   //find elements method=		List<WebElement> languagesList=driver.findElements(By.xpath("//div[@id='pageFooter']/ul/li"));
  // for each loop=for (WebElement language : languagesList)
		//what is find elements
		//what is the data types of find elements
		//what is list<WebElement>
		// what is loop
		// what is for each loop
		// what is iterator loop
		//what is for/while/do loop
	
	for (int i = 0; i < 12; i++) {
		System.out.println(i);
	}
	
	}
	
	
	
	
}
