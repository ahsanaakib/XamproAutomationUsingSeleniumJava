package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.DashboardPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.ProfilePage;
import testBase.BaseClass;

public class TC003_VerifyUpdateProfile extends BaseClass {

	@Test(groups = { "Sanity", "Regression", "Functional","Master" })
	public void verifyUpdateProfile_TC003() throws InterruptedException {
		
		logger.info("***** Starting verifyUpdateProfile_TC003 *****");
		
		try {
			HomePage hp = new HomePage(driver);
			hp.clickDialogClose();
			hp.clickSignIn();

			LoginPage lp = new LoginPage(driver);

			lp.inputEmail(p.getProperty("email"));
			lp.inputPassword(p.getProperty("password"));
			lp.clickSubmit();

			DashboardPage dp = new DashboardPage(driver);
			dp.clickUpdateProfile();

			ProfilePage pp = new ProfilePage(driver);
			
			pp.setFullName("Testing");

			pp.clickDOB();
			pp.setDOB("01122000");
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pp.inputRadioMale);
			pp.setGender();	
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pp.drpdwnEducation);
			pp.clickEducationDropDown();
			pp.setEducation();

			pp.clickUpdate();
			
		} catch (Exception e) {
			
			Assert.fail("Test failed due to an exception: " + e.getMessage());
		}
		
		logger.info("***** Ending verifyUpdateProfile_TC003 *****");
	}

}
