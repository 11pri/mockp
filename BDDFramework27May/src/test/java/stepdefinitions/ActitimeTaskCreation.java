package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActitimeTaskCreation {
	@Given("user in on actitime login page for task creation")
	public void user_in_on_actitime_login_page_for_task_creation() {
		System.out.println("User is on Acttime login page");
	}

	@Given("user enters username as {string} in the username field")
	public void user_enters_username_as_in_the_username_field(String userName) {
		System.out.println("User enter user name as : " + userName);
	}

	@Given("user enters password as {string} in password field")
	public void user_enters_password_as_in_password_field(String pwd) {
		System.out.println("User enter password as : " + pwd);
	}

	@Given("clicks on actitime Login button")
	public void clicks_on_actitime_login_button() {
		System.out.println("User click on login button");
	}

	@When("click on Tasks tab")
	public void click_on_tasks_tab() {
		System.out.println("user click on Tasks tab");
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
		System.out.println("user click on Add new button");
	}

	@When("select New Tasks")
	public void select_new_tasks() {
		System.out.println("user select New Tasks");
	}

	@When("select projectr from project dropdown")
	public void select_projectr_from_project_dropdown() {
		System.out.println("user select projectr from project dropdown");
	}

	@When("enter task name as {string} and project name as {string}")
	public void enter_task_name_as_and_project_name_as(String taskName, String project) {
		System.out.println("user enter task name as : " + taskName);
		System.out.println("user enter project name as : " + project);
	}

	@When("click on Create Tasks button")
	public void click_on_create_tasks_button() {
		System.out.println("user click on Create Tasks button");
	}

	@Then("user should be able to see the created task on page")
	public void user_should_be_able_to_see_the_created_task_on_page() {
		System.out.println("user is able to see the created task on page");
	}

	@Then("close the actitime application browser")
	public void close_the_actitime_application_browser() {
		System.out.println("user close the actitime application browser");
	}
}
