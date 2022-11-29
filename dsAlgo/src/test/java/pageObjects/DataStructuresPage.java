package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataStructuresPage {

	WebDriver driver;
	

	By GetstartDS = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[1]//a");
	By Timecomplexity = By.xpath("//a[text()='Time Complexity']");
	By Tryhere = By.xpath("//a[contains(text(),'Try here>>>')]");
	By typecode = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
	By runbtn = By.xpath("//button[text()='Run']");
	
	
	public DataStructuresPage(WebDriver driver)
	{
		this.driver=driver;
	
	}
	
	public void ClickOnDataStructure() {
		driver.findElement(GetstartDS).click();
	}
	public void ClickOnTimeComplexity() {
		driver.findElement(Timecomplexity).click();
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
}
