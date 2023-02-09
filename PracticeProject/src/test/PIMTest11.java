package test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PIMTest11 extends BaseTest11 {

	@Test (priority = 1)
	public void verifypim() {
	 PIMobject.cliconpim();
		 
	}
	@Test (priority = 2)
	public void verifyemailsearch () {
		PIMobject.sendMailId("1999");
	}
	
	@Test (priority = 3)
	public void verifysearchbutton() {
		PIMobject.ClickSearch();
	}
	
}
