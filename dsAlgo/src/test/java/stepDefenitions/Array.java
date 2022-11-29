package stepDefenitions;

import org.openqa.selenium.Keys;

import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
import pageObjects.TreePage;

public class Array extends BaseClass {
	
	

	@When("user click on Array getstarted button")
	public void user_click_on_array_getstarted_button() {
		ap = new ArrayPage(driver);
		ap.ClickOnArrayGetStartBtn();
	}

	@When("user click Arrays in Python link")
	public void user_click_arrays_in_python_link() {
		ap.ClickOnArrayPythonLink();
	}

	@When("^user clear the text and enter the(.*)$")
	public void user_clear_the_text_and_enter_the_pythoncode(String pythoncoede) {
		tp = new TreePage(driver);
		ap.ClearPythoncode();
		tp.EnterPythoncode(pythoncoede);
		
	}
	@When("user click Arrays Using List")
	public void user_click_arrays_using_list() {
	    ap.ClickOnArraysUsingList();
	}
	@When("user click Basic Operations in Lists")
	public void user_click_basic_operations_in_lists() {
	    ap.ClickOnBasicOperationsinLists();
	}

	@When("user click Applications of Array")
	public void user_click_applications_of_array() {
	    ap.ClickOnApplicationsofArray();
	}
	@When("user click Practice Questions")
	public void user_click_practice_questions() {
	    ap.ClickOnPracticeQuestions();
	}
	@When("user click Search The Array")
	public void user_click_search_the_array() throws InterruptedException {
		
	    ap.ClickOnSearchTheArray();
	    Thread.sleep(1000);
	}
	@When("user click Max Consecutive Ones")
	public void user_click_max_consecutive_ones() {
	    ap.ClickOnMaxConsecutiveOnes();
	}

	@When("user click Find Numbers with Even Number of Digits")
	public void user_click_find_numbers_with_even_number_of_digits() {
	    ap.ClickOnFindNumberswithEvenNumberofDigits();
	}

	@When("user click Squares of a Sorted Array")
	public void user_click_squares_of_a_sorted_array() {
	    ap.ClickOnSortedSquares();
	}
	 
	
}
