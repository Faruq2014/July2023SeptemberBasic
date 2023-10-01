package com.facebook.baseLoginTest;

import org.testng.annotations.Test;

import com.facebook.base.BaseTest;
import com.facebook.pom_PageFactory.LoginPageWithPageFactory;
import com.facebook.utilities.PropertiesReader;

public class LoginTest extends BaseTest{
	LoginPageWithPageFactory lpf;
	PropertiesReader propertiesReader;
	@Test
	public void validLoginTest() {
	propertiesReader= new PropertiesReader(); 
	lpf= new LoginPageWithPageFactory(driver);
	lpf.userNameMethod(propertiesReader.getUserName());
	lpf.passWordMethod(propertiesReader.getPassword());
	lpf.logingButton();
	}

}
