package stepDefenitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.PortalPage;
import pageObjects.SignInpage;


public class HomeRegister_SD extends BaseClass {
	
	
	
	@Given("The user opens chrome browser and enter the url")
	public void the_user_opens_chrome_browser_and_enter_the_url() {
		
			        driver.manage().window().maximize();
		
			        pp = new PortalPage(driver);
			        sp = new SignInpage(driver);
			      
			        driver.get("https://dsportalapp.herokuapp.com/");
	}
	
	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) throws InterruptedException {
	    pp.clickOnGetStarted();
	}

	@Then("The user should be redirected to homepage and user should see six panes with different data structures")
	public void the_user_should_be_redirected_to_homepage_and_user_should_see_six_panes_with_different_data_structures() {
		String ActualTitle = driver.getTitle();
	    String ExpectedTitle = "NumpyNinja";
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
	    System.out.println(ActualTitle);
	}

	@When("The user clicks {string} drop down")
	public void the_user_clicks_drop_down(String string) throws InterruptedException {
	    pp.ClickOnDropdown();
	}

	@Then("user should see six different data structure entries in that dropdown")
	public void user_should_see_six_different_data_structure_entries_in_that_dropdown() {
	    
	}

	@When("The user clicks any of the {string} buttons below the data structures")
	public void the_user_clicks_any_of_the_buttons_below_the_data_structures(String string) {
	    pp.ClickOnSelectDropdown();
	}

	@Then("It should alert the user with a message {string}")
	public void it_should_alert_the_user_with_a_message(String msg) {
	     String Actualmessage = pp.Alert();
	     Assert.assertTrue(Actualmessage.contains(msg));
	}

	@When("The user selects any data structure from home page")
	public void the_user_selects_any_data_structure_from_home_page() {
	  
	}

	@Then("The user should be redirected to Register page")
	public void the_user_should_be_redirected_to_register_page() {
	    
	}
	@When("user clicks on Register link")
	public void user_clicks_on_register_link() throws InterruptedException {
	    pp.clickOnRegister1();
	}

	@When("^enter the (.*) and (.*) and (.*)$")
	public void enter_the_username_and_password_and_confirmpswd(String username,String password,String confirmpswd ) throws InterruptedException  {
	    pp.enterUserName(username);
	   
	    pp.enterPassword(password);
	  
	    pp.enterConfPassword(confirmpswd);
	}
	@And("click on Register button")
	public void click_on_register_button() {
	    pp.clickOnRegister2();
	}
	
	@Then("user should see your are logged in")
	public void user_should_see_your_are_logged_in() {
		String ActualTitle = driver.getTitle();
	    String ExpectedTitle = "NumpyNinja";
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
	    System.out.println(ActualTitle);
	}

}


	