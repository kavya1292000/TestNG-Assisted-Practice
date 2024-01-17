package testNGAnnotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
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
		SoftAssert sf = new SoftAssert();
		
		String expectedTitle = "DownloadsSelenium";
		
		String actualTitle = driver.getTitle(); 
		
		sf.assertEquals(actualTitle, expectedTitle,"The title are not matching");
		
		Thread.sleep(2000);
		
		System.out.println("Assertion was passed");
		System.out.println("click on the link");
		
		sf.assertAll();
	}

}
