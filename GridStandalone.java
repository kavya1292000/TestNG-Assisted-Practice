package grid;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridStandalone {
public static WebDriver driver;
	
	@Test
	public void griddemo() throws MalformedURLException
	{
		
		ChromeOptions cap = new ChromeOptions();
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.getTitle());
		
	}
	


}
