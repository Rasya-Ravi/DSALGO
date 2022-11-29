package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepDefenitions.BaseClass;

public class SignInpage  {
 
	WebDriver driver;
	

	By signin = By.xpath("//a[text()='Sign in']");
    By usernamesignin = By.id("id_username");
	By passwordsignin =By.id("id_password");
	By Login=By.xpath("//input[@value='Login']");
	By Signout = By.xpath("//a[text()='Sign out']");
	By Alert = By.xpath("//div[@class='alert alert-primary']");
	
	public SignInpage(WebDriver driver)
	{
		this.driver=driver;
		System.out.println("-----------Hi-----------------------------");
	}
	public void Enterpassword(String password) {
		driver.findElement(passwordsignin).sendKeys(password);
	}
	public void EnterUsername(String username) {
		driver.findElement(usernamesignin).sendKeys(username);
	}
	public void LogIn() {
		driver.findElement(Login).click();
	}
	public void ClickSignIn() {
		driver.findElement(signin).click();
	}
	public void ClickonSignout() {
		driver.findElement(Signout).click();
	}
	 public String Alert() {
		String AlertMsg =driver.findElement(Alert).getText();
		System.out.println(AlertMsg);
			return AlertMsg;
	}
}
