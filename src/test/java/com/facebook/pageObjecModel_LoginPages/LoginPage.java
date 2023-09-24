package com.facebook.pageObjecModel_LoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	/**
	 * instance variable
	 */
	WebDriver driver;

	/**
	 * @param driver user define constructor for POM
	 */
	

	public LoginPage(WebDriver driver) {
		//super();
		this.driver = driver;
		PageFactory.initElements(driver, this);// this line is design for pom
	}

	public WebElement userName(String enterYourUserName) {
		// driver.findElement(By.cssSelector("#email")).sendKeys("Faruq");//basic code
		// pom style coding
		WebElement uName = driver.findElement(By.cssSelector("#email"));
		uName.clear();
		uName.sendKeys(enterYourUserName);
		System.out.println("what is the tag name " + uName.getTagName());
		return uName;
	}

	public WebElement password(String enterYourPassowrd) {
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.clear();
		pass.sendKeys(enterYourPassowrd);
		return pass;

	}

	public void clickLoginButton() {
		// driver.findElement(By.name("login")).click();
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
	}
  
	public WebElement forgetPassowrd() {
	WebElement forgetPass=	driver.findElement(By.linkText("Forgot password?"));
	forgetPass.click();
	return forgetPass;
		
	}
	
	public WebElement createNewAccount() {
		WebElement newAccount =driver.findElement(By.linkText("Create new account"));
		newAccount.click();
		return newAccount;
	}
}
