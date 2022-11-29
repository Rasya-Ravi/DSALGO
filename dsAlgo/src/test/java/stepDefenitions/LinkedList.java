package stepDefenitions;

import io.cucumber.java.en.When;
import pageObjects.LinkedListPage;

public class LinkedList extends BaseClass {
	
	@When("user click on LinkedList getstarted button")
	public void user_click_on_linked_list_getstarted_button() {

		driver.manage().window().maximize();
		lp = new LinkedListPage(driver);
		lp.ClickOnLinkedListGetstartedBtn();
		
	}

	@When("user click Introduction link")
	public void user_click_introduction_link() {
	    lp.ClickOnInroduction();
	}
	@When("user click Creating LinkedLIst link")
	public void user_click_creating_linked_l_ist_link() {
	    lp.ClickOnCreatingLinkedList();
	}
	@When("user click Types of Linked List")
	public void user_click_types_of_linked_list() {
	   lp.ClickOnTypesOfLinkedList();
	}
	@When("user click Implement Linked List in Python")
	public void user_click_implement_linked_list_in_python() {
	   lp.ClickOnImplementLinkedListPython();
	}
	@When("user click Traversal")
	public void user_click_traversal() {
	   lp.ClickOnTraversalLinkedList();
	}

	@When("user click Insertion")
	public void user_click_insertion() {
	   lp.ClickOnInsertion();
	}

	@When("user click Deletion")
	public void user_click_deletion() {
	    lp.ClickOnDeletion();
	}



}
