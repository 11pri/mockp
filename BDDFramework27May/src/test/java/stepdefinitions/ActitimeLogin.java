package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Actitime.ActimeLoginPage;
import com.Actitime.ActitimeHomePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumUtility;

public class ActitimeLogin extends SeleniumUtility {
	WebDriver driver;
	ActimeLoginPage actLogin = null;
	ActitimeHomePage actHome = null;

	@Given("user in on actitime login page")
	public void user_in_on_actitime_login_page() {
		driver = setUp("chrome", "https://demo.actitime.com/login.do");
		actLogin = new ActimeLoginPage(driver);
		actHome = new ActitimeHomePage(driver);
	}

	@When("user enters following inputs on login page")
	public void user_enters_following_inputs_on_login_page(DataTable dataTable) {
		List<Map<String, String>> userData = dataTable.asMaps(String.class, String.class);
		Map<String, String> firstUser = userData.get(0);
		actLogin.enterUsernameAndPwd(firstUser.get("userName"), firstUser.get("password"));
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		actLogin.clickOnLoginBtn();
	}

	@Then("user should be login page")
	public void user_should_be_login_page() {
		Assert.assertTrue(actHome.verfiyUserLoggedIn());
	}

	@Then("user logout actitime and close the browser")
	public void user_logout_actitime_and_close_the_browser() {
		actHome.logout();
		cleanUp();
	}
}
