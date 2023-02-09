package mainjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest11;

public class DashboardMethod extends BaseTest11 {

	//all locators 
	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement dashboardlocator ;

	@FindBy(xpath ="//*[@class='oxd-userdropdown']//i")
	WebElement logoutlocator;
	
	@FindBy(xpath="//*[text()='Logout']")
	WebElement clciklogoutlocator ;
	
   // initialize variable 
   public DashboardMethod(WebDriver div) {
	   this.div = div ;
	   PageFactory.initElements(div, this);
   }
   
   
   //methods
   /**
	 * @author bhagyashri_nimonkar
	 * @date 2023-2-07
	 * @discription - this method used to verify dashboard  
	 */
  
   public String Dashboardcheck() {
	  return dashboardlocator.getText();
   
   }
   /**
  	 * @author bhagyashri_nimonkar
  	 * @date 2023-2-07
  	 * @discription - this method used to verify dashboard  
  	 */
  public void logout() {
	  div.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
	  div.navigate().refresh();
	  logoutlocator.click();
	  clciklogoutlocator.click();
  }
 
  
  
  
  
  
  
  
  
  
  
   }