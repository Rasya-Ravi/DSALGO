package stepDefenitions;

import java.io.ByteArrayInputStream;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.qameta.allure.Allure;
import pageObjects.SignInpage;

public class SignIn_SD extends BaseClass{
	
	
	
	@Given("The user opens chrome browser and enters the {string}")
	public void the_user_opens_chrome_browser_and_enter_the(String string) {
		
        driver.manage().window().maximize();

        sp = new SignInpage(driver);
        driver.get("https://dsportalapp.herokuapp.com/login");
}
	

	@When("^user enter (.*)and(.*)$")
	public void user_enter_username_and_password(String username,String password) {
	   sp.EnterUsername(username);
	   sp.Enterpassword(password);
	}

	@When("clicks on Login button")
	public void click_on_login_button() {
	    sp.LogIn();
	}

	@Then("user should see {string}")
	public void user_should_see(String msg) {	  
		String Actualmessage = sp.Alert();
	    Assert.assertTrue(Actualmessage.contains(msg));
	}

  @After
  public void Teardown(Scenario scenario)
  {
	 if  (scenario.isFailed()) {
		 
		 byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		 Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
	 }
  }
  
}
