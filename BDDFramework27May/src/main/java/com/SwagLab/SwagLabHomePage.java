package com.SwagLab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabHomePage {
	@FindBy(css = "div[class='app_logo']")
	private WebElement homePageAppLogo;

	public WebElement getHomePageAppLogo() {
		return homePageAppLogo;
	}
}
