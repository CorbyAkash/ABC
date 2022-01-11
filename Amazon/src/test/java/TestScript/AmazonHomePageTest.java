package TestScript;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import AmazonPages.AmazonHomePage;
import AmazonPages.Mobiles_and_Computers;
import Utility.Base;
import Utility.CustomListner;
@Listeners(CustomListner.class)

public class AmazonHomePageTest extends Base {
	AmazonHomePage hm;
	Mobiles_and_Computers m;
	
	@BeforeSuite
	public void setup() throws IOException {
		initilization();
	}
	 
	@BeforeClass
	public void StartReport() throws IOException {
		ExtentHtmlReporter reports=new ExtentHtmlReporter("./Reports/AmazonHomePageTest.html");
		extend=new ExtentReports();
		extend.attachReporter(reports);
		hm=new AmazonHomePage();
	}
	
	@Test(priority=0)
	public void HomePage() throws IOException, Exception {
			hm.loginPage();
		
	}
	@Test(priority=1)
	public void mob() throws InterruptedException
	{
	    m = new Mobiles_and_Computers();
		m.mob_and_com();
	}
	
	@AfterClass
	public void EndReport() {
		CloseReport();
		
	}
	@AfterSuite
	public void teardown() {
		
		driver.close();
	}


}
