package KhanAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	//Step 1- Declaration of variable globally

	
	@FindBy(xpath="//span[@class='_wozql4 _13hnk7qk']")
	private WebElement profile;
	
	@FindBy(xpath="//span[text()='Log out']")
	private WebElement lgot;
	

	//Step 2 - Initialization of Variables
	
	public Logout(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	//Step 3 -Method Creation
	
	public void PRO() {
		profile.click();
	}
	
	
	public void LT() {
		lgot.click();
	}
}


