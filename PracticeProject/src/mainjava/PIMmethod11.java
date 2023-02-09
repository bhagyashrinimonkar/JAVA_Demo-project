package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest11;


public class PIMmethod11 extends BaseTest11{

	@FindBy(xpath = "//span[text()='PIM']")
	WebElement pimlocator ;

	@FindBy(xpath = "//*[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")
	WebElement emailidlocator;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement clicksearchlocator ;
	
	// constructor 
	public PIMmethod11(WebDriver div ) {
		this.div = div ;
		PageFactory.initElements(div , this);
	}
	//method step 
	/**
	 * @author Bhagyashri_Nimonkar
	 * @date 2023-2-08
	 * @discription - this method is used to click on button
	 * @parametr return String
	 */
	public void cliconpim () {
		pimlocator.click();
	}
	/**
	 * @author Bhagyashri_Nimonkar
	 * @date 2023-2-08
	 * @discription - this method is used to send maild id of employe
	 * 
	 */
	
	public void sendMailId(String mail) {
		emailidlocator.sendKeys(mail);
	}
	/**
	 * @author Bhagyashri_Nimonkar
	 * @date 2023-2-08
	 * @discription - this method is used to click
	 * 
	 */
	
	public void ClickSearch() {
		clicksearchlocator.click();
	}
}











