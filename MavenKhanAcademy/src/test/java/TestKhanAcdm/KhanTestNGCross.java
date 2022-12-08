package TestKhanAcdm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import KhanAcademy.Login;
import KhanAcademy.Logout;
import KhanAcademy.Progress;
import KhanAcademy.Teachers;

public class KhanTestNGCross {			//for cross browser testing
	WebDriver driver;
	Login login;
	Teachers teachers;
	Logout logout;
	Progress progress;
	SoftAssert soft;
	
	@Parameters("browser")
	
	@BeforeTest
	public void crossBrowser(String browsername) {
		System.out.println(browsername);
		if (browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
			
			driver = new ChromeDriver(); 
			
		}
		  if (browsername.equals("Firefox")) {
			  System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Mozilla Firefox\\firefox.exe");				
				 driver = new FirefoxDriver();
			  
		  }
		  	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS)	;
			
			driver.manage().window().maximize();
			
			driver.get("https://www.khanacademy.org/login");

		  
	}
	
	@BeforeClass
	public void beforeclass() {
		login = new Login (driver);
		teachers = new Teachers (driver);
		teachers = new Teachers (driver);
		progress = new Progress (driver);


		
		
	}
	@BeforeMethod
	public void beforeMethod() {
		
		login.LGI();
		login.enterUN();
		login.enterpass();
		login.logged();
			
	}
	@Test
	public void test1 () throws InterruptedException {
		System.out.println("Test case 1 is Running");
		
		teachers.CT();
		//teachers.PR();
		//teachers.CD();
		
		String url = driver.getCurrentUrl(); //Actual Result URL
		Assert.assertEquals(url,"https://www.khanacademy.org/profile/me/teachers");
		Thread.sleep(2000);
		
		
	}
	
	@Test
	public void test2 () throws InterruptedException {
		System.out.println("Test case 2 is Running");
		teachers.PR();
		String url = driver.getCurrentUrl(); //Actual Result URL
		
		Assert.assertEquals(url,"https://www.khanacademy.org/profile/me/");
		Thread.sleep(2000);
		
	}
	@Test
	public void test3 () throws InterruptedException {
		System.out.println("Test case 3 is Running");
		progress.PGR();
		
		String url = driver.getCurrentUrl(); //Actual Result URL
		
		Assert.assertEquals(url,"https://www.khanacademy.org/profile/me/progress");
		Thread.sleep(2000);
	}
		
	@AfterMethod
	public void afterMethod1 () {
		Logout logout = new Logout (driver);
		logout.PRO();
		logout.LT();

	}
	@AfterClass
	public void afterClass() {
		login= null;
		teachers=null;
		teachers=null;
		progress=null;
		

	}
	@AfterTest
	public void afterTest() {
	driver.close();
	System.gc();	//Garbage collect and object delete and clear  memory
	
	}	
}



