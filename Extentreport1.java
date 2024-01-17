package extentReports;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreport1 {
	@Test
	public void ExtentreporDemo1()
	{
		
		ExtentReports ex = new ExtentReports();
		
	ExtentSparkReporter sparkreporter = new ExtentSparkReporter("C:\\Users\\kavyaravichandran\\Eclipse-2023\\Phase2-TestNGScriptsReports\\\\extentreports\\\\report.html");
	
	ex.attachReporter(sparkreporter); 
	
	ex.flush(); 
	
		
	}


}
