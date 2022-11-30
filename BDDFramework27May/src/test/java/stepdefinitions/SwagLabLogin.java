package stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.SwagLab.SwagLabHomePage;
import com.SwagLab.SwagLabLoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumUtility;

public class SwagLabLogin extends SeleniumUtility {
	WebDriver driver;
	SwagLabLoginPage swgLogin = null;
	SwagLabHomePage swgHome = null;

	@Given("user in on swaglab login page")
	public void user_in_on_actitime_login_page() {
		driver = setUp("chrome", "https://www.saucedemo.com/");
		swgLogin = PageFactory.initElements(driver, SwagLabLoginPage.class);
		swgHome = PageFactory.initElements(driver, SwagLabHomePage.class);
	}

	@When("user enters following inputs")
	public void user_enters_following_inputs(DataTable dataTable) {
		List<List<String>> userData = dataTable.asLists(String.class);
		List<String> firstUser = userData.get(0);
		swgLogin.swagLabEnterUserNameAndPwd(firstUser.get(0), firstUser.get(1));
		System.out.println("****" + userData + "*****");
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() {
		swgLogin.swagLabClickOnLoginBtn();
	}

	@Then("user should be login")
	public void user_should_be_login() {
		Assert.assertTrue(swgHome.getHomePageAppLogo().isDisplayed());
	}

	@Then("close the browser")
	public void close_the_browser() {
		cleanUp();
	}
}
