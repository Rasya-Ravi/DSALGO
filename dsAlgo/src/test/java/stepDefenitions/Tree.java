package stepDefenitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import pageObjects.TreePage;

public class Tree extends BaseClass {


	@Given("The user opens chrome browser and user enter the {string}")
	public void user_opens_chrome_browser_and_user_enter_the(String string) {
		
		driver.manage().window().maximize();
		tp = new TreePage(driver);
		driver.get("https://dsportalapp.herokuapp.com/login");
	}

	@When("user enter credentials to Login")
	public void user_enter_credentials_to_login(DataTable usercredentials) {
		List<List<String>> data = usercredentials.cells();
		tp.EnterUsername(data.get(0).get(0));
		tp.Enterpassword(data.get(0).get(1));

	}

	@And("click on Login button")
	public void click_on_login_button_and_naviagate_to_home_page() {
		System.out.println("-----------hello---------------------------------------------------------");
		tp.LogIn();

	}

	@And("user click on Tree getstarted button")
	public void user_click_on_tree_getstarted_button() {

		tp.ClickonGetstartedbutton();
	}

	@Then("user should navigated to Tree module and user can see fourteen child modules")
	public void user_should_navigated_to_tree_module_and_user_can_see_fourteen_child_modules() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
	}

//Overview of Trees
	@When("user click Overview of Trees")
	public void user_click_overview_of_trees() {
		tp.ClickonOverviewofTree();
	}

	@Then("user should naviagated to corresponding page with title Overview of Trees")
	public void user_should_naviagated_to_corresponding_page_with_title_overview_of_trees() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Overview of Trees";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println(ActualTitle);
	}

	@When("user click on TryHere button")
	public void user_click_on_try_here_button() {

		tp.ClickonTryhere();
	}

	@And("^user enter the(.*)$")
	public void user_enter_the_pythonecode(String pythoncode) throws InterruptedException {
		Thread.sleep(500);
		tp.EnterPythoncode(pythoncode);

	}

	@Then("click the Run button")
	public void click_the_run_button() {
		tp.Run();

	}

	@Given("user navigate to tree home page")
	public void user_navigate_to_tree_home_page() {

		driver.navigate().back();
	}

//Terminologies
	@When("user clicks the terminologies button")
	public void user_clicks_the_terminologies_button() throws InterruptedException {

		Thread.sleep(500);
		tp.ClickonTerminology();
	}

	@Then("user should navigate to Terminologies module")
	public void user_should_navigate_to_terminologies_module() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Terminologies";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println(ActualTitle);
	}

	@When("user clicks on TryHere button")
	public void user_clicks_on_try_here_button() {
		tp.ClickonTryhere();
	}

	@When("^user enters (.*)$")
	public void user_enters_theprint(String pythoncode) throws InterruptedException {
		Thread.sleep(500);
		tp.EnterPythoncode(pythoncode);
	}

	@Then("clicks the Run button")
	public void clicks_the_run_button() {
		tp.Run();
	}
	// Types of Trees

	@When("user clicks Types of Trees")
	public void user_clicks_types_of_trees() {
		tp.ClickonTypesofTree();
	}

	@Then("user should navigate to Types of tree page")
	public void user_should_navigate_to_types_of_tree_page() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Types of Trees";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println(ActualTitle);
	}

	@When("the user clicks the TryHere buton")
	public void the_user_clicks_the_try_here_buton() {
		tp.ClickonTryhere();
	}

	@When("^the user enter(.*)$")
	public void the_user_enterprint(String pythoncode) throws InterruptedException {
		Thread.sleep(500);
		tp.EnterPythoncode(pythoncode);
	}

	@Then("click the run button")
	public void click_the_run_buton() {
		tp.Run();
	}

	@Then("naviagte to tree home page")
	public void naviagte_to_tree_home_page() throws InterruptedException {
		Thread.sleep(500);
		driver.navigate().back();
	}

//TT
	@When("user click Tree Traversals")
	public void user_click_tree_traversals() {
		tp.ClickonTreeTraversals();
	}

	@Then("user should navigate to Tree Traversals module")
	public void user_should_navigate_to_tree_traversals_module() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Tree Traversals";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println(ActualTitle);
	}

	@When("user clicks Tryhere button")
	public void user_clicks_tryhere_button() {
		tp.ClickonTryhere();
	}

	@When("^user enter TT module(.*)$")
	public void user_enter_tt_moduleprint(String pythoncode) throws InterruptedException {
		Thread.sleep(500);
		tp.EnterPythoncode(pythoncode);
	}

	@When("click the TT module run button")
	public void click_the_tt_module_run_button() {
		tp.Run();
	}

	@Then("user navigate to TT home page")
	public void user_navigate_to_tt_home_page() {
		driver.navigate().back();
	}

	// TL
	@When("user clicks on Traversals Illustration")
	public void user_clicks_on_traversals_illustration() {
		tp.ClickonIllustratons();
	}

	@Then("user should navigate to Traversals Illustration module")
	public void user_should_navigate_to_traversals_illustration_module() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Traversals-Illustration";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println(ActualTitle);
	}

	@When("user clicks TL Tryhere button")
	public void user_clicks_tl_tryhere_button() {
		tp.ClickonTryhere();
	}

	@When("^user enter TL module(.*)$")
	public void user_enter_tl_moduleprint(String pythoncode) throws InterruptedException {
		Thread.sleep(500);
		tp.EnterPythoncode(pythoncode);
	}

	@When("click the TL module run button")
	public void click_the_tl_module_run_button() {
		tp.Run();
	}

	@Then("user navigate to TL home page")
	public void user_navigate_to_tl_home_page() {
		driver.navigate().back();
	}

//BT
	@When("user click on Binary Trees")
	public void user_click_on_binary_trees() {
		tp.ClickOnBinaryTree();
	}

	@Then("user should navigate to Binary Tree module")
	public void user_should_navigate_to_binary_tree_module() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Binary Trees";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println(ActualTitle);
	}

	@When("user clicks BT Tryhere button")
	public void user_clicks_bt_tryhere_button() {
		tp.ClickonTryhere();
	}

	@When("^user enter BT module(.*)$")
	public void user_enter_bt_moduleprint(String pythoncode) throws InterruptedException {
		Thread.sleep(500);
		tp.EnterPythoncode(pythoncode);

	}

	@When("user click the BT module run button")
	public void user_click_the_bt_module_run_button() {
		tp.Run();
	}

	@Then("user navigate to BT home page")
	public void user_navigate_to_bt_home_page() {
		driver.navigate().back();
	}

	// TBT
	@When("user click on Types of Binary Trees")
	public void user_click_on_types_of_binary_trees() {
		tp.ClickonTypesofBT();
	}

	@Then("user should navigate to Types of Binary Trees module")
	public void user_should_navigate_to_types_of_binary_trees_module() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Types of Binary Trees";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println(ActualTitle);
	}

	@When("user clicks TBT Tryhere button")
	public void user_clicks_tbt_tryhere_button() {
		tp.ClickonTryhere();
	}

	@When("^user enter TBT module(.*)$")
	public void user_enter_tbt_moduleprint(String pythoncode) throws InterruptedException {
		Thread.sleep(500);
		tp.EnterPythoncode(pythoncode);
	}

	@When("user click the TBT module run button")
	public void user_click_the_tbt_module_run_button() {
		tp.Run();
	}

	@Then("user navigate to TBT home page")
	public void user_navigate_to_tbt_home_page() {
		driver.navigate().back();
	}

	// IOP
	@When("user click on Implementation of Python")
	public void user_click_on_implementation_of_python() {
		tp.ClickonImplementationofPython();
	}

	@Then("user should navigate to Implementation of Python module")
	public void user_should_navigate_to_implementation_of_python_module() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Implementation in Python";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println(ActualTitle);
	}

	@When("user clicks on IOP Tryhere button")
	public void user_clicks_on_iop_tryhere_button() {
		tp.ClickonTryhere();
	}

	@When("^user enter IOP module(.*)$")
	public void user_enter_iop_moduleprint(String pythoncode) throws InterruptedException {
		Thread.sleep(500);
		tp.EnterPythoncode(pythoncode);
	}

	@When("user click the IOP module run button")
	public void user_click_the_iop_module_run_button() {
		tp.Run();
	}

	@Then("user navigate to IOP home page")
	public void user_navigate_to_iop_home_page() {
		driver.navigate().back();
	}

//BTT
	@When("user click on Binary Tree Traversals")
	public void user_click_on_binary_tree_traversals() {
		tp.ClickonBinaryTreesTraversals();
	}

	@Then("user should navigate to Binary Tree Traversals module")
	public void user_should_navigate_to_binary_tree_traversals_module() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Binary Tree Traversals";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println(ActualTitle);
	}

	@When("user clicks on BTT Tryhere button")
	public void user_clicks_on_btt_tryhere_button() {
		tp.ClickonTryhere();
	}

	@When("^user enter BTT module(.*)$")
	public void user_enter_btt_moduleprint(String pythoncode) throws InterruptedException {
		Thread.sleep(500);
		tp.EnterPythoncode(pythoncode);
	}

	@When("user click the BTT module run button")
	public void user_click_the_btt_module_run_button() {
		tp.Run();
	}

	@Then("user navigate to BTT home page")
	public void user_navigate_to_btt_home_page() {
		driver.navigate().back();
	}
	// IOBT

	@When("user click on Implementation of Binary Trees")
	public void user_click_on_implementation_of_binary_trees() {
		tp.ClickonImplementaionofBinaryTree();
	}

	@Then("user should navigate to Implementation of Binary Trees module")
	public void user_should_navigate_to_implementation_of_binary_trees_module() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Implementation of Binary Trees";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println(ActualTitle);

	}

	@When("user clicks on IOBT Tryhere button")
	public void user_clicks_on_iobt_tryhere_button() {
		tp.ClickonTryhere();
	}

	@When("^user enter IOBT module(.*)$")
	public void user_enter_iobt_moduleprint(String pythoncode) throws InterruptedException {
		Thread.sleep(300);
		tp.EnterPythoncode(pythoncode);
	}

	@When("user click the IOBT module run button")
	public void user_click_the_iobt_module_run_button() {
		tp.Run();
	}

	@Then("user navigate to IOBT home page")
	public void user_navigate_to_iobt_home_page() {
		driver.navigate().back();
	}
	// AOBT

	@When("user click on Applications of Binary Trees")
	public void user_click_on_applications_of_binary_trees() {
		tp.ClickonApplicationofBinaryTree();
	}

	@Then("user should navigate to Applications of Binary Trees module")
	public void user_should_navigate_to_applications_of_binary_trees_module() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Applications of Binary trees";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println(ActualTitle);
	}

	@When("user clicks on AOBT Tryhere button")
	public void user_clicks_on_aobt_tryhere_button() {

		tp.ClickonTryhere();
	}

	@When("^user enter AOBT module(.*)$")
	public void user_enter_aobt_moduleprint(String pythoncode) throws InterruptedException {
		Thread.sleep(300);
		tp.EnterPythoncode(pythoncode);
	}

	@When("user click the AOBT module run button")
	public void user_click_the_aobt_module_run_button() {
		tp.Run();
	}

	@Then("user navigate to AOBT home page")
	public void user_navigate_to_aobt_home_page() {
		driver.navigate().back();
	}

	// BST

	@When("user click on Binary Search Trees")
	public void user_click_on_binary_search_trees() {
		tp.ClickonBinarysearchTree();
	}

	@Then("user should navigate to Binary Search Trees module")
	public void user_should_navigate_to_binary_search_trees_module() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Binary Search Trees";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println(ActualTitle);
	}

	@When("user clicks on BST Tryhere button")
	public void user_clicks_on_bst_tryhere_button() {
		tp.ClickonTryhere();
	}

	@When("^user enter BST module(.*)$")
	public void user_enter_bst_moduleprint(String pythoncode) throws InterruptedException {
		Thread.sleep(300);
		tp.EnterPythoncode(pythoncode);
	}

	@When("user click the BST module run button")
	public void user_click_the_bst_module_run_button() {
		tp.Run();
	}

	@Then("user navigate to BST home page")
	public void user_navigate_to_bst_home_page() {
		driver.navigate().back();
	}

	// IOBST

	@When("user click on Implementaion of BST")
	public void user_click_on_implementaion_of_bst() {
		tp.ClickonImplimenationofBST();
	}

	@Then("user should navigate to Implementaion of BST module")
	public void user_should_navigate_to_implementaion_of_bst_module() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Implementation Of BST";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println(ActualTitle);
	}

	@When("user clicks on IOBST Tryhere button")
	public void user_clicks_on_iobst_tryhere_button() {
		tp.ClickonTryhere();
	}

	@When("^user enter IOBST module(.*)$")
	public void user_enter_iobst_moduleprint(String pythoncode) throws InterruptedException {
		Thread.sleep(300);
		tp.EnterPythoncode(pythoncode);
	}

	@When("user click the IOBST module run button")
	public void user_click_the_iobst_module_run_button() {
		tp.Run();
	}

	@Then("user navigate to IOBST home page")
	public void user_navigate_to_iobst_home_page() {
		driver.navigate().back();
	}

}
