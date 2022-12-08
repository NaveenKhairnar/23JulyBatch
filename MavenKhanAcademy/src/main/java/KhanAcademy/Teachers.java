package KhanAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teachers {
	
	//Step 1- Declaration of variable globally
	
	@FindBy(xpath="//span[text()='Teachers']")
	private WebElement teach;
	
	@FindBy(xpath="//span[text()='Profile']")
	private WebElement prof;
	
	
	
	//@FindBy(xpath="//a[@role='button']")
	//private WebElement code;
	
	//Step 2 - Initialization of Variables
	
	public Teachers (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	//Step 3 -Method Creation
		
		public void CT() {		
			teach.click();
	}
		public void PR() {
			prof.click();
		}
		//public void CD() {
			//code.click();
		//}
		

	
	}


