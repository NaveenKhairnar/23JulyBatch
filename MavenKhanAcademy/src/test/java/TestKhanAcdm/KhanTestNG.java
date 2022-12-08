package TestKhanAcdm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KhanAcademy.Login;
import KhanAcademy.Logout;
import KhanAcademy.Progress;
import KhanAcademy.Teachers;
import Utility.Util;

public class KhanTestNG {
	int testID;
	WebDriver driver;
	Login login;
	Teachers teachers;
	Logout logout;
	Progress progress;
	
	@BeforeClass
	public void beforeclass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		
		driver = new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS)	;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.khanacademy.org/login");
		Thread.sleep(2000);

	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		
		login = new Login (driver);
		login.LGI();
		login.enterUN();
		login.enterpass();
		login.logged();
		
		Thread.sleep(2000);
	}
	@Test
	public void test1 () throws InterruptedException {
		testID= 0112;
		System.out.println("Test case 1 is Running");
		
		teachers = new Teachers (driver);
		teachers.CT();
		//teachers.PR();
		//teachers.CD();
		String url = driver.getCurrentUrl();
		//String url = driver.getCurrentUrl(); //Actual Result URL
		Assert.assertEquals(url,"https://www.khanacademy.org/profile/me/teachers");
		Thread.sleep(2000);
		
		
	}
	
	@Test //PROFILE
	public void test2 () throws InterruptedException {
		testID= 0223;

		System.out.println("Test case 2 is Running");
		teachers = new Teachers (driver);
		teachers.PR();
		String url = driver.getCurrentUrl(); //Actual Result URL
		
		Assert.assertEquals(url,"https://www.khanacademy.org/profile/me/sg");
		Thread.sleep(2000);
		
	}
	@Test
	public void test3 () throws InterruptedException {
		testID= 0334;

		System.out.println("Test case 3 is Running");
		progress = new Progress (driver);
		progress.PGR();
		
		String url = driver.getCurrentUrl(); //Actual Result URL
		
		Assert.assertEquals(url,"https://www.khanacademy.org/profile/me/progress");
		Thread.sleep(2000);
	}
		
	@AfterMethod
	public void afterMethod1 (ITestResult result) throws InterruptedException, IOException {
		if(ITestResult.FAILURE == result.getStatus()) {
			 
			Util.captureScreenshot(driver, testID);
		}
		
		logout = new Logout (driver);
		logout.PRO();
		logout.LT();
		Thread.sleep(2000);


	}
	@AfterClass
	public void afterClass() {
		driver.close();
		
	}
}	
