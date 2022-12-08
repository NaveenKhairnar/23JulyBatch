package KhanAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	//https://www.khanacademy.org/login
	
	//Step 1- Declaration of variable globally
	
	//GitHub Done
	
	@FindBy(xpath="//a[@id='login-or-signup']")
	private WebElement lgin;
	
	@FindBy(xpath="//input[@id='uid-login-form-0-wb-id-identifier-field']")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement log;
	
	
	//Step 2 - Initialization of Variables
	
	public Login (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//Step 3 -Method Creation
	public void LGI() {
		lgin.click();
	}
	
	public void enterUN() {
		username.sendKeys("Abhinavvelocity");
	}
	
	public void enterpass() {
		password.sendKeys("Abhi@1804");
	}
	public void logged() {
		log.click();
		
	}
	
}
