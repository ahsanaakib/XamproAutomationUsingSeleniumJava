package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.DashboardPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import testBase.BaseClass;

public class TC002_VerifyLogin extends BaseClass {

	@Test(groups = { "Sanity", "Regression", "Functional","Master" })
	public void verifyLogin_TC002() {
		
		logger.info("***** Starting verifyLogin_TC002 *****");
		
		try {
			HomePage hp = new HomePage(driver);
			hp.clickDialogClose();
			hp.clickSignIn();

			LoginPage lp = new LoginPage(driver);

			lp.inputEmail(p.getProperty("email"));
			lp.inputPassword(p.getProperty("password"));
			lp.clickSubmit();

			DashboardPage dp = new DashboardPage(driver);

			dp.clickProfile();
			boolean logoutDisplayedStatus = dp.isLogoutDisplayed();

			// Validation
			Assert.assertTrue(logoutDisplayedStatus, "Logout link not displayed.");

		} catch (Exception e) {

			Assert.fail("Test failed due to an exception: " + e.getMessage());
		}
		
		logger.info("***** Ending verifyLogin_TC002 *****");
	}
}
