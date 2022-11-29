package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PortalPage {


	WebDriver driver;

	By getStart =By.xpath("//button[@class='btn']");
	By reg=By.xpath("//ul/a[text()=' Register ']");
	By userName=By.id("id_username");
	By password=By.id("id_password1");
	By confpassword=By.id("id_password2");
	By register=By.xpath("//input[@value='Register']");
	//By signout=By.xpath("//ul/a[text()='Sign out']");
	By Dropdown = By.xpath("//div[@class='nav-item dropdown']");
	By SelectDropdown = By.xpath("//div[@class='dropdown-menu show']/a[3]");
	By Alert = By.xpath("//div[@class='alert alert-primary']");
	By getstart_btn = By.xpath("//h5[text()='Array']");
	By GetstartedBtntree = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[6]//a");
	By SignIn = By.xpath("//a[text()='Sign in']");
	By Login=By.xpath("//input[@type='submit']");
	By Signout = By.xpath("//a[text()='Sign out']");
	public PortalPage(WebDriver driver)
	{
		this.driver=driver;
		System.out.println("Hi");
	}
	public void clickOnGetStarted() throws InterruptedException {

		driver.findElement(getStart).click();
	}
	public void clickOnRegister1() throws InterruptedException  {
		Thread.sleep(1000);
		driver.findElement(reg).isEnabled();
		driver.findElement(reg).click();
	}
	public void enterUserName(String uname) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(userName).sendKeys(uname);
	}
	public void enterPassword(String pswd) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(password).sendKeys(pswd);
	}
	public void enterConfPassword(String cpswd) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(confpassword).sendKeys(cpswd);
	}
	public void clickOnRegister2() {
		driver.findElement(register).click();
	}
	//    	public void clickOnSignout() {
	//    		driver.findElement(signout).click();
	//    	}
	public void ClickOnDropdown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(Dropdown).click();
	}
	public void ClickOnSelectDropdown() {
		driver.findElement(SelectDropdown).click();
	}

	public String Alert() {
		String AlertMsg =driver.findElement(Alert).getText();
		System.out.println("ALERT#################"+AlertMsg);
		return AlertMsg;
	}

	public void GetStartButtonArray() {
		driver.findElement(getstart_btn).click();

	}

	public void ClickOnSignIn() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("hello cucumber");
		driver.findElement(SignIn).click();
	}

	public void ClickonLogIn() {
		driver.findElement(Login).click();
	}

	public void ClickonGetstartedTree() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(getstart_btn).click();
	}
	public void ClickonSignOut() {
		driver.findElement(Signout).isDisplayed();
		driver.findElement(Signout).click();
	}
}

