package stepDefenitions;

import org.openqa.selenium.WebDriver;

import pageObjects.ArrayPage;
import pageObjects.DataStructuresPage;
import pageObjects.GraphPage;
import pageObjects.LinkedListPage;
import pageObjects.PortalPage;
import pageObjects.QueuePage;
import pageObjects.SignInpage;
import pageObjects.StackPage;
import pageObjects.TreePage;
import static stepDefenitions.DriverManager.getDriver;

public class BaseClass {

	
	public static WebDriver driver;
	public static TreePage tp;
	public static PortalPage pp;
	public static SignInpage sp;
	public static StackPage sk;
	public static DataStructuresPage dp;
	public static QueuePage qp;
	public static GraphPage gp;
	public static ArrayPage ap;
	public static LinkedListPage lp;
	static {
		driver= getDriver();
	}
}
