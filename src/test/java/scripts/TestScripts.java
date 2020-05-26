package scripts;

import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import pom.HomePage;

public class TestScripts  extends BaseTest{
	@Test(enabled=true)
	public void testcreateEmployee()  {
		HomePage pi=new HomePage(driver);
		pi.setUserName("Admin");
		pi.setPwd("admin123");
		pi.clickLoginBtn();
		BasePage.verifyTitle("OrangeHRM");
		pi.clickPimMenu();
		pi.clickAddEmpMenu();
		pi.setFName("Kevin1");
		pi.setlName("Fernanades");
		pi.clickSaveBtn();
		//pi.verifyFirstname("Kevin1");
		
	}

}
