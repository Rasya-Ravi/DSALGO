package stepDefenitions;

import io.cucumber.java.en.When;
import pageObjects.GraphPage;
import pageObjects.PortalPage;


public class Graph extends BaseClass{


	@When("user click on Graph getstarted button")
	public void user_click_on_graph_getstarted_button() {

		driver.manage().window().maximize();
		gp = new GraphPage(driver);
		gp.ClickonGetstartedbutton();

	}

	@When("user click Graph link")
	public void user_click_graph_link() {
		gp.ClickOnGraphlink();
	}

	@When("user click Graph Representations link")
	public void user_click_graph_representations_link() {
		gp.ClickOnGraphRepresentations();
	}
	@When("user click on signout")
	public void user_click_on_signout() {
		pp = new PortalPage(driver);
		pp.ClickonSignOut();
	}


}
