package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest11;

public class TitleMethod11 extends BaseTest11 {

	//all locator here 
	 @FindBy(xpath="//*[text()='Login']")
	WebElement locator ;  
	 
	 @FindBy(name = "username")
	 WebElement usrname;
	 
	 @FindBy(name = "password")
	 WebElement password;

	 @FindBy(xpath = "//button[@type = 'submit']")
	 WebElement clicking;
	 
	 //constructor// initialize variable
	public TitleMethod11(WebDriver div) {
		 this.div = div ; 
		 PageFactory.initElements(div, this);  
	 
}
	/**
	 * @author bhagyashri_nimonkar
	 * @date 2023-2-07
	 * @discription - this method used to verify title page 
	 * @parameter return - String
	 */
	
	//method  step
	public String pageTitle() {
		return locator.getText();
	}
	/**
	 * @author bhagyashri_nimonkar
	 * @date 2023-2-07
	 * @discription - this method used to verify url of loginpage 
	 * @parameter return - String
	 */
	 
	public String urlofpage() {
		return div.getCurrentUrl();
	}
	/**
	 * @author bhagyashri_nimonkar
	 * @date 2023-2-07
	 * @discription - this method used to setusername  
	 */
	public void setuser(String usern) {
		usrname.sendKeys(usern);
	}
	/**
	 * @author bhagyashri_nimonkar
	 * @date 2023-2-07
	 * @discription - this method used to setpassword 
	 */
	public void setpass(String passi) {
		password.sendKeys(passi);
	}
	/**
	 * @author bhagyashri_nimonkar
	 * @date 2023-2-07
	 * @discription - this method used to click   
	 */
	public void clicked() {
		clicking.click();
	}
	/**
	 * @author Administrator
	 * @date 2023-45-07
	 * @discription - this method used to verify title of build
	 * @parameter return String
	 */
	
	
		public String getBuildTitle() {
		  return div.getTitle();  

		
		
		
		
		
		
		
		
		
	}
}