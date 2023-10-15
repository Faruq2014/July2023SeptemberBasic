package com.facebook.base.screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	WebDriver driver;
	
	@BeforeTest
	public void openFacebook() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void idLocatorsTest() {
		driver.findElement(By.id("email")).sendKeys("hilll");
		takeScreenShot();
	}
	
	@Test
	public void idLocatorsTestOne() {
		driver.findElement(By.id("email")).sendKeys("hilll");
		takeScreenShotRollUp("idOne");
	}
	
	
	
	
	
	public void takeScreenShot() {
		//screen shot method from selenium
		//with nested driver
		//driver can not take its own picture
	TakesScreenshot camera=((TakesScreenshot)driver);
	//take the screen shot=camera.getScreenshotAs
	//formate the screen shot=OutputType.FILE
	File sourceSelfee=camera.getScreenshotAs(OutputType.FILE);
	  //path to save the screen shot
	//roll over
	File destinationFile= new File("ScreeenShot/login.png");
	
	try {
		  //copy the screen shot and paste in the destination
		FileUtils.copyFile(sourceSelfee, destinationFile);
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	
	
	}

	public void takeScreenShotRollUp(String enterScreenShotName) {
		//screen shot method from selenium
		//with nested driver
		//driver can not take its own picture
	TakesScreenshot camera=((TakesScreenshot)driver);
	//take the screen shot=camera.getScreenshotAs
	//formate the screen shot=OutputType.FILE
	File sourceSelfee=camera.getScreenshotAs(OutputType.FILE);
	 //roll up
	long time=System.currentTimeMillis();
	String fileWithPath="screenShot/"+time+enterScreenShotName+".png";
	File DestFile=new File(fileWithPath);
	
	
	try {
		  //copy the screen shot and paste in the destination
		FileUtils.copyFile(sourceSelfee, DestFile);
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	
	
	}
@AfterTest
public void closeApp() {
	driver.quit();
}
}
