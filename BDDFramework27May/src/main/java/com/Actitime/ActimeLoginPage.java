package com.Actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class ActimeLoginPage extends SeleniumUtility {
	WebDriver driver;

	public ActimeLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement userNameInputField;

	@FindBy(name = "pwd")
	private WebElement pwdInputField;

	@FindBy(id = "loginButton")
	private WebElement loginBtn;

	public void enterUsernameAndPwd(String userName, String pwd) {
		typeInput(userNameInputField, userName);
		typeInput(pwdInputField, pwd);
	}

	public void clickOnLoginBtn() {
		clickOnElement(loginBtn);
	}
}
