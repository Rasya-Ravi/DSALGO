package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ArrayPage {
	
	WebDriver driver;

	By ArraygetStartBtn =By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[2]//a");
	By arrayPythonLink = By.xpath("//a[text()='Arrays in Python']");
	By arrayListLink = By.xpath("//li/a[text()='Arrays Using List']");
	By basicOperationsListLink = By.xpath("//a[text()='Basic Operations in Lists']");
	By arrayApplicationsLink = By.xpath("//a[text()='Applications of Array']");
	By TryHere = By.xpath("//a[text()='Try here>>>']");
	By practiceQns= By.xpath("//a[text()='Practice Questions']");
	By searchArray= By.xpath("//a[text() ='Search the array']");	
	By pythInput = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
	By maxConsecutive = By.xpath("//a[text()='Max Consecutive Ones']");
	By evenNumberDigit = By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
	By squaresOfArray  = By.xpath("//a[text()='Squares of  a Sorted Array']");
    By elementPresentPythoncode = By.xpath("//pre[@class=' CodeMirror-line ']");
    
	public ArrayPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void ClickOnArrayGetStartBtn() {
		driver.findElement(ArraygetStartBtn).click();
	}
	public void ClickOnArrayPythonLink() {
		driver.findElement(arrayPythonLink).click();
	}
	public void ClickOnArraysUsingList() {
		driver.findElement(arrayListLink).click();
	}
	public void ClickOnBasicOperationsinLists() {
		driver.findElement(basicOperationsListLink).click();
	}
	public void ClickOnApplicationsofArray() {
		driver.findElement(arrayApplicationsLink).click();
	}
	public void ClickOnPracticeQuestions() {
		driver.findElement(practiceQns).click();
	}
	public void ClickOnSearchTheArray() {
		driver.findElement(searchArray).click();
	}
	public void ClickOnMaxConsecutiveOnes() {
		driver.findElement(maxConsecutive).click();
	}
	public void ClickOnFindNumberswithEvenNumberofDigits() {
		driver.findElement(evenNumberDigit).click();
	}
	public void ClickOnSortedSquares() {
		driver.findElement(squaresOfArray).click();
	}
	public void ClearPythoncode() {
		driver.findElement(pythInput).sendKeys(Keys.CONTROL,"a");
		
		driver.findElement(pythInput).sendKeys(Keys.DELETE);
		
	}
}