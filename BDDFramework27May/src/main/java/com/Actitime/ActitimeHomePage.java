package com.Actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class ActitimeHomePage extends SeleniumUtility {
	WebDriver driver;

	public ActitimeHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "logoutLink")
	private WebElement logoutBtn;

	public boolean verfiyUserLoggedIn() {
		return verifyUIElementDisplayed(logoutBtn);
	}

	public void logout() {
		clickOnElement(logoutBtn);
	}
}
