package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QueuePage {
   
	WebDriver driver;
	
	By GetstartQueue = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[5]//a");
	By ImplementationofQueueinPython = By.xpath("//a[text()='Implementation of Queue in Python']");
    By Implementationusingcollectionsdeque = By.xpath("//a[text()='Implementation using collections.deque']");
    By Implementationusingarray = By.xpath("//a[text()='Implementation using array']");
    By QueueOperations = By.xpath("//a[text()='Queue Operations']");
    
	public QueuePage(WebDriver driver)
	{
		this.driver=driver;
	
	}
	
	public void ClickOnQueue() {
		driver.findElement(GetstartQueue).click();
	}
	public void ClickOnImplementationofQueueinPython() {
		driver.findElement(ImplementationofQueueinPython).click();
	}
	public void ClickOnImplementationusingcollectionsdeque() {
		driver.findElement(Implementationusingcollectionsdeque).click();
	}
    public void ClickOnImplementationusingarray() {
    	driver.findElement(Implementationusingarray).click();
    }
    public void ClickOnQueueOperations() {
    	driver.findElement(QueueOperations).click();
    }
}
