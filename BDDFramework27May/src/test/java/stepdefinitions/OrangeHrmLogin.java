package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.OrangeHrm.OrangeHrmHomePage;
import com.OrangeHrm.OrangeHrmLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumUtility;

public class OrangeHrmLogin extends SeleniumUtility {
	WebDriver driver;
	OrangeHrmLoginPage ohLogin = null;
	OrangeHrmHomePage ohHome = null;

	@Given("user open the browser and application")
	public void user_open_the_browser_and_application() {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ohLogin = PageFactory.initElements(driver, OrangeHrmLoginPage.class);
		ohHome = new OrangeHrmHomePage(driver);
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
		ohLogin.enterUserNameAndPassword("Admin", "admin123");
	}

	@When("user click on the login button")
	public void user_click_on_the_login_button() {
		ohLogin.clickOnTheLoginBtn();
	}

	@Then("user should login successfully")
	public void user_should_login_successfully() {
		Assert.assertTrue(ohHome.getProfileBtn().isDisplayed());
	}

	@Then("user logout and close the browser")
	public void user_logout_and_close_the_browser() {
		ohHome.logout();
		cleanUp();
	}
}
