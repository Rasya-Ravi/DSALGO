package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GraphPage {


	WebDriver driver;
	

	By GetstartGraph = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[7]//a");
	By Graph = By.xpath("//ul/a[text()='Graph']");
	By GraphRepresentations = By.xpath("//a[text()='Graph Representations']");

	public GraphPage(WebDriver driver)
	{
		this.driver=driver;
	
	}
	
	public void ClickonGetstartedbutton()  {
		driver.findElement(GetstartGraph).click();
	}
	public void ClickOnGraphlink() {
		driver.findElement(Graph).click();
	}
	public void ClickOnGraphRepresentations() {
		driver.findElement(GraphRepresentations).click();
	}
}
