package testNGAnnotations;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassAfterClass {
WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
	driver.close();
	}
	
	@Test(priority='3')
	public void createAccount()
	{
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up&returntoquery=centralAuthAutologinTried%3D1%26centralAuthError%3DNot%2Bcentrally%2Blogged%2Bin");
		driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@id='wpPassword2']")).sendKeys("user@123");
		driver.findElement(By.xpath("//button[@id='wpCreateaccount']")).click();
		
	}
	
	@Test(priority='2')
	public void login()   
	{
		
		driver.get("https://en.wikipedia.org/w/index.php?returnto=Wikipedia%3ASign+up&title=Special:UserLogin&centralAuthAutologinTried=1&centralAuthError=Not+centrally+logged+in");
		driver.findElement(By.xpath("//input[@id='wpName1']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@id='wpPassword1']")).sendKeys("user@123");
		driver.findElement(By.xpath("//button[@id='wpLoginAttempt']")).click();
		
		
	}
	
	@Test(priority='1')
	
	public void account()
	{
		
		driver.get("https://en.wikipedia.org/w/index.php?returnto=Wikipedia%3ASign+up&title=Special:UserLogin&centralAuthAutologinTried=1&centralAuthError=Not+centrally+logged+in");
		
		
	}
	


}
