package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterDsAlgoPage {

	WebDriver driver;
	

	By reg=By.xpath("//ul/a[text()=' Register ']");
	By userName=By.id("id_username");
	By password=By.id("id_password1");
	By confpassword=By.id("id_password2");
	By register=By.xpath("//input[@value='Register']");
	By accountcreatmsg=By.xpath("//div[@role='alert']");
	
	public RegisterDsAlgoPage(WebDriver driver)
	{
		this.driver=driver;
		System.out.println("Hi");
	}
	public void ClickonRegistration() {
		driver.findElement(reg).click();
	}
	public void UsernameEntry() {
		driver.findElement(userName).sendKeys("Ammu100");
				
	}
	public void PasswordEnrty() {
		driver.findElement(password).sendKeys("Happy123");
	}
	
	public void ConfirmPassword() {
		driver.findElement(confpassword).sendKeys("Happy123");
	}
	
	public void Register2() {
		driver.findElement(register).click();
	}
	
	public void CreateMessage() {
		String createmsg = driver.findElement(accountcreatmsg).getText();
		System.out.println(createmsg);
		
	}
}
