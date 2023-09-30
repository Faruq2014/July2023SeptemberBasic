package com.facebook.pom_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {
	//page object model formula== each web element should have its own method
	//POM should have its own constructor on each page
	 // formula=@FindBy(how=How.attributes/locator name, using= values/xpth/css)
		//                 data type and variable name
	
	WebDriver driver;

	public LoginPageWithPageFactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 // formula=@FindBy(how=How.attributes/locator name, using= values/xpth/css)
	//                 data type and variable name
	
	
	@FindBy(how=How.ID, using="email") WebElement userNameId;
	public WebElement userNameMethod(String enterYourUserName) {
		///driver.findElement(By.id("email"));
		userNameId.sendKeys(enterYourUserName);
		return userNameId;
	}
	
	@FindBy(how=How.NAME, using="pass")public WebElement passwordLocator;
	public WebElement passWordMethod(String enterYourPassword) {
		passwordLocator.sendKeys(enterYourPassword);
		return passwordLocator;
	}
	
@FindBy(how=How.XPATH, using="//button[starts-with(@id,'u_0_5_')]")	private WebElement loginButtonLocator;

public void logingButton() {
	loginButtonLocator.click();
}
	


}
