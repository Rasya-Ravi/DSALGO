package stepDefenitions;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pageObjects.StackPage;
import pageObjects.TreePage;

public class Stack extends BaseClass{

	@Given("User is in home page {string}")
	public void user_is_in_home_page(String string) {
		driver.manage().window().maximize();
		sk = new StackPage(driver);
		//driver.get("https://dsportalapp.herokuapp.com/login"); 
	}

	@When("user click on Stack getstarted button")
	public void user_click_on_stack_getstarted_button() {
	    sk.ClickonGetstartedbutton();
	}

	@Then("user should naviagated to corresponding page with title {string}")
	public void user_should_naviagated_to_corresponding_page_with_title(String title) {
	   Assert.assertEquals(title, driver.getTitle());
	}

	@When("user click Operations in stack")
	public void user_click_operations_in_stack() {
        sk.ClickOnOperationsinStack();

	}
	@When("user click Implementation")
	public void user_click_implementation() {
	   sk.ClickonImplementation();
	}
	@When("user click Applications")
	public void user_click_applications() {
	    sk.ClickonApplications();
	}
	@Then("user is navigated to home page {string}")
	public void user_is_navigated_to_home_page(String url) {
	    driver.get(url);
	}


	
}
