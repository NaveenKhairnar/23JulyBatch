package KhanAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntCode {
	
	//Step 1- Declaration of variable globally

	@FindBy(xpath="//input[@class='_q92ef6']")
	private WebElement max;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement conti;
	
	@FindBy(xpath="//a[@role='button']")
	private WebElement bk;
	
	//Step 2 - Initialization of Variables
	
	public EntCode(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	//Step 3 -Method Creation
	
	public void MX() {
		max.sendKeys("36483278");
	}
	
	public void  CON() {
		conti.click();
	}
		
	public void BBT() {
		bk.click();
	
	}
}


