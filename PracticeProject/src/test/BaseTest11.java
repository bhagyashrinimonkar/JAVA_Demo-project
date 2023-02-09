package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.Baseclass11;
import mainjava.DashboardMethod;
import mainjava.PIMmethod11;
import mainjava.TitleMethod11;

public class BaseTest11 extends Baseclass11{
	
	@BeforeSuite
	public void initialbrowser() {
		WebDriverManager.chromedriver().setup();
		div = new ChromeDriver();
		div.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		div.manage().window().maximize();
		div.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		div.manage().timeouts().pageLoadTimeout(20 , TimeUnit.SECONDS);
	}

	@BeforeClass
	  public void verifyuser() {
	    	 titleobj.setuser("Admin");
	    	 titleobj.setpass("admin123");
	    	 titleobj.clicked();
	    }
	
	@AfterClass
	public void logoutafterevryclass() {
		dashboardobj.logout();
	}
	@AfterSuite
	public void logout() {
		div.quit();
		
		
	}
}
