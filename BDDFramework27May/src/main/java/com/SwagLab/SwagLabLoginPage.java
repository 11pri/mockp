package com.SwagLab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.SeleniumUtility;

public class SwagLabLoginPage extends SeleniumUtility {

	@FindBy(id = "user-name")
	private WebElement userNameInput;

	@FindBy(id = "password")
	private WebElement pwdInput;

	@FindBy(id = "login-button")
	private WebElement loginBtn;

	public void swagLabEnterUserNameAndPwd(String userName, String pwd) {
		typeInput(userNameInput, userName);
		typeInput(pwdInput, pwd);
	}

	public void swagLabClickOnLoginBtn() {
		clickOnElement(loginBtn);
	}

}
