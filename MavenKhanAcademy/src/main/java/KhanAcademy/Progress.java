package KhanAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Progress {
	//Step 1- Declaration of variable globally
	
		@FindBy(xpath="//span[text()='Progress']")
		private WebElement prog;
		
	//Step 2 - Initialization of Variables
		
		public Progress (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//Step 3 -Method Creation
		
				public void PGR() {		
					prog.click();
				}

}
