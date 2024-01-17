package testNGAnnotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class HardAssertion {
WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.selenium.dev/downloads/");
	}
	
	
	@Test(priority='1')
	public void gettitlemethod() throws InterruptedException
	{
		String expectedTitle = "DownloadsSelenium";
		
		String actualTitle = driver.getTitle(); 
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		Thread.sleep(2000);
		
		System.out.println("Assertion was passed");
        System.out.println("click on the link");
		
	}
	
	@AfterClass
	public void closebroser()
	{
		driver.close();
	}


	



}
