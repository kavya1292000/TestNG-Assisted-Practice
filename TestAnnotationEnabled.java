package testNGAnnotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAnnotationEnabled {


	@Test(priority='1')
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
	}
	
	@Test(priority='2',dependsOnMethods= {"login"})
	public void composeEmail()
	{
		System.out.println("selenium code to compose Email");
	}
	
	
	@Test(priority='3',dependsOnMethods= {"login","composeEmail"}, enabled=false) 
	
	public void SearchEmail()
	{
		System.out.println("selenium code to searchEmail");
	}


}
