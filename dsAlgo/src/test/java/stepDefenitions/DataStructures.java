package stepDefenitions;

import io.cucumber.java.en.When;
import pageObjects.DataStructuresPage;
import pageObjects.StackPage;

public class DataStructures extends BaseClass {

	@When("user click on Data Structures-Introduction getstarted button")
	public void user_click_on_data_structures_introduction_getstarted_button() {
		driver.manage().window().maximize();
		dp = new DataStructuresPage(driver);
		dp.ClickOnDataStructure();
	}

	@When("user click Time Complexity")
	public void user_click_time_complexity() {
	   dp.ClickOnTimeComplexity();
	}

}
