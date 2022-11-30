package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.VTiger.Lead.PageClasses.VTigerHomePage;
import com.VTiger.Lead.PageClasses.VTigerLeadPage;
import com.VTiger.Lead.PageClasses.VTigerLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumUtility;

public class VTigerLead extends SeleniumUtility {
	WebDriver driver;
	VTigerLoginPage vtLogin = null;
	VTigerHomePage vtHome = null;
	VTigerLeadPage vtLead = null;

	@Given("user already in login page")
	public void user_already_in_login_page() {
		System.out.println("Background started");
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		vtLogin = new VTigerLoginPage(driver);
		vtHome = new VTigerHomePage(driver);
		vtLead = new VTigerLeadPage(driver);
	}

	@Given("user login successfully with valid data")
	public void user_login_successfully_with_valid_data() {
		vtLogin.login("Admin", "Test@123");
	}

	@Given("click on navigation bar")
	public void click_on_navigation_bar() {
		vtHome.openTheNavigation();
	}

	@Given("go to Marketing and select Leads")
	public void go_to_marketing_and_select_leads() {
		vtHome.openMarketingAndSelectLead();
	}

	@When("click on Add Leads button and enter firstname as {string} ,last as {string} ,company as {string} and click on save button")
	public void click_on_add_leads_button_and_enter_firstname_as_last_as_company_as_and_click_on_save_button(
			String firstName, String lastName, String companyName) {
		vtLead.createLead(firstName, lastName, companyName);
	}

	@When("click on All link")
	public void click_on_all_link() {
		vtLead.clickOnAllBtn();
	}

	@Then("varify lead is created with {string}")
	public void varify_lead_is_created_with(String string) {
		Assert.assertTrue(vtLead.verifyCreatedLead());
	}

	@When("click on select all leads checkbox")
	public void click_on_select_all_leads_checkbox() {
		vtLead.selectAllCreatedLeads();
	}

	@When("click on delete logo")
	public void click_on_delete_logo() {
		vtLead.clickOnDeleteBtn();
	}

	@When("user will get a popup to comfirm deletion, select Yes")
	public void user_will_get_a_popup_to_comfirm_deletion_select_yes() {
		vtLead.clickOnConfirmDeleteBtn();
	}

	@Then("varify that all leads deleted")
	public void varify_that_all_leads_deleted() {
		Assert.assertTrue(vtLead.verifyDeletedLead());
	}

	@Then("close the Vtiger application browser")
	public void close_the_vtiger_application_browser() {
		vtHome.logout();
		cleanUp();
	}
}
