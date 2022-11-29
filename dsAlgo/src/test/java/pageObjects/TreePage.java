package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepDefenitions.BaseClass;

public class TreePage  {
	
	public WebDriver driver;
	
	
    By GstartedBtn = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[6]//a");
    By signin = By.xpath("//a[text()='Sign in']");
    By usernamesignin = By.id("id_username");
	By passwordsignin =By.id("id_password");
	By Login_btn=By.xpath("//input[@value='Login']");
   	By OverviewofTree = By.xpath("//a[contains(text(),'Overview of Trees')]");
	By Tryhere = By.xpath("//a[contains(text(),'Try here>>>')]");
	By typecode = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
	By runbtn = By.xpath("//button[text()='Run']");
    By terminologies = By.xpath("//a[contains(text(),'Terminologies')]");	
	By typesoftree = By.xpath("//a[contains(text(),'Types of Trees')]");
	By TreeTraversals = By.xpath("//div[@id='content']//li[4]");
	By Illustration = By.xpath("//a[contains(text(),'Traversals-Illustration')]");
	By BinaryTree = By.xpath("//*[@id='content']/li[6]/a");
	By TypesofBT = By.xpath("//a[contains(text(),'Types of Binary Trees')]");
	By BinarytreeTraversals = By.xpath("//a[contains(text(),'Binary Tree Traversals')]");
	By ImplemeentationofPython = By.xpath("//a[contains(text(),'Implementation in Python')]");
	By ImplementaionofBtree = By.xpath("//a[contains(text(),'Implementation of Binary Trees')]");
	By ApplicationofBtree = By.xpath("//a[contains(text(),'Applications of Binary trees')]");
	By BinarysearchTree = By.xpath("//a[contains(text(),'Binary Search Trees')]");
	By ImplimenationofBST = By.xpath("//a[contains(text(),'Implementation Of BST')]");
	By PracticeQuestions = By.xpath("//a[contains(text(),'Practice Questions')]");
	
	public TreePage(WebDriver driver)
	{
		this.driver=driver;
		
		
	}
	
	public void ClickonGetstartedbutton()  {
		
		driver.findElement(GstartedBtn).click();
		System.out.println("*************Click on getstart***************");
	}
	public void ClickonOverviewofTree() {
		driver.findElement(OverviewofTree).click();
	}
	public void ClickonTryhere() {
		driver.findElement(Tryhere).click();
	}
	
	public void EnterPythoncode(String pythoncode) {
        driver.findElement(typecode).sendKeys(pythoncode);
	}
	public void Run() {
		driver.findElement(runbtn).click();
	}
	public void ClickonTerminology() {
		driver.findElement(terminologies).click();
	}
	public void ClickonTypesofTree() {
		driver.findElement(typesoftree).click();
	}
	public void ClickonIllustratons() {
		
		driver.findElement(Illustration).click();
	}
	public void ClickonBinaryTreesTraversals() {
		driver.findElement(BinarytreeTraversals).click();
	}
	public void ClickonImplementationofPython() {
		driver.findElement(ImplemeentationofPython).click();;
	}
	public void ClickonImplementaionofBinaryTree() {
		driver.findElement(ImplementaionofBtree).click();
	}
	public void ClickonApplicationofBinaryTree() {
		driver.findElement(ApplicationofBtree).click();
	}
	public void ClickonBinarysearchTree() {
		driver.findElement(BinarysearchTree).click();
	}
	public void ClickonImplimenationofBST() {
		driver.findElement(ImplimenationofBST).click();
	}
	public void ClickonPracticeQuestions() {
		driver.findElement(PracticeQuestions).click();
	}
	public void ClickonTypesofBT() {
		driver.findElement(TypesofBT).click();
	}
	public void ClickOnBinaryTree() {
		driver.findElement(BinaryTree).click();
	}
	public void ClickonTreeTraversals() {
		driver.findElement(TreeTraversals).click();
	}
	
	public void Enterpassword(String password) {
		driver.findElement(passwordsignin).sendKeys(password);
	}
	public void EnterUsername(String username) {
		driver.findElement(usernamesignin).sendKeys(username);
	}
	public void LogIn() {
		driver.findElement(Login_btn).click();
	}
}
