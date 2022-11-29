package stepDefenitions;

import io.cucumber.java.en.When;
import pageObjects.DataStructuresPage;
import pageObjects.QueuePage;

public class Queue extends BaseClass{

	
	@When("user click on Queue getstarted button")
	public void user_click_on_queue_getstarted_button() {
		driver.manage().window().maximize();
		qp = new QueuePage(driver);
		qp.ClickOnQueue();
	}

	@When("user click Implementation of Queue in Python")
	public void user_click_implementation_of_queue_in_python() {
	   qp.ClickOnImplementationofQueueinPython();
	}
	@When("user click Implementation using collections.deque")
	public void user_click_implementation_using_collections_deque() {
	    qp.ClickOnImplementationusingcollectionsdeque();
	}
	@When("user click Implementation using array")
	public void user_click_implementation_using_array() {
	   qp.ClickOnImplementationusingarray();
	}
	@When("user click Queue Operations")
	public void user_click_queue_operations() {
	    qp.ClickOnQueueOperations();
	}
}
