package TestKhanAcdm;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import KhanAcademy.EntCode;
import KhanAcademy.Login;
import KhanAcademy.Logout;
import KhanAcademy.Teachers;

public class TestKhan {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
				

	WebDriver driver = new ChromeDriver(); 
	

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS)	;
	
	driver.get("https://www.khanacademy.org/login");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	Login login = new Login (driver);
	login.LGI();
	login.enterUN();
	login.enterpass();
	login.logged();
	
	Thread.sleep(2000);

	
	Teachers teachers = new Teachers (driver);
	teachers.CT();
	//teachers.CD();
	
	Thread.sleep(2000);

	EntCode entCode = new EntCode(driver);
	entCode.MX();
	entCode.CON();
	entCode.BBT();
	
	Thread.sleep(2000);


	Logout logout = new Logout (driver);
	logout.PRO();
	logout.LT();
		
	}

}
