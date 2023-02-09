package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class logintest11 extends BaseTest11  {

	@Test(priority = 0 , groups = { "sanity" , "regression"})
	public void verifytitle() {
		String verifytitle = titleobj.pageTitle();
		Assert.assertEquals(verifytitle, "Login"); // hard
			}

    @Test (priority = 1 , groups = {"sanity" , "regression" })
    public void verifyurl() {
    	String verifyurl= titleobj.urlofpage();
    	Assert.assertEquals(verifyurl, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	
    }
    
    @Test (priority = 2 , groups = {"sanity" , "regression"})
    public void verifyuser() {
    	 titleobj.setuser("Admin");
    	 titleobj.setpass("admin123");
    	 titleobj.clicked();
    }
    
    @Test(priority = 3 , groups = {"sanity" ,"regression" } )
    public void verifydashboard() {
    	String verifydashboard= dashboardobj.Dashboardcheck();
    }
    
    @Test(priority = -1 , groups = {"sanity" , "regression"})
    public void VerifyDashboard () {
    String 	VerifyDashboard= titleobj.getBuildTitle();
    AssertJUnit.assertEquals(VerifyDashboard , "OrangeHRM");
    	
    	
    }
    
  }
