package listenersDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMethods {
public static WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser()
	{
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void Closebrowser()
	{
		driver.close();
	}
	
	
	@Test(priority='1')
	public void method1()
	{
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
	}
	@Test(priority='2')
	public void method2()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.getTitle());
		
	}
	
	@Test(priority='3')
	public void method3()
	{
	
		driver.get("https://www.selenium.dev/documentation/");
		String expectedtitle = "Selenium";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedtitle); 
	}
	
	@Test(priority='4')
	public void method4()
	{
		
		driver.get("https://www.selenium.dev/projects/");
		System.out.println(driver.getTitle());
		Assert.assertTrue(false);
		
	} 
	@Test(priority='5',timeOut = 1000)
	public void method5() throws InterruptedException
	{
		Thread.sleep(3000); 
		driver.get("https://www.selenium.dev/projects/");
		
		
	} 


}
