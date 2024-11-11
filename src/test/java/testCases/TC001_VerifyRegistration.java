package testCases;

import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CheckEmailPage;
import PageObjects.HomePage;
import PageObjects.SignupPage;
import testBase.BaseClass;


public class TC001_VerifyRegistration extends BaseClass{
	
	@Test(groups= {"Sanity","Functional","Regression","Master"})
	public void verifyRegistration_TC001()
	{
		logger.info("***** Starting verifyRegistration_TC001 *****");
		
		HomePage hp= new HomePage(driver);
		hp.clickDialogClose();
		
		hp.clickRegistration();
		
		
		try (InputStream is = TC001_VerifyRegistration.class.getClassLoader().getResourceAsStream("data.json")) {
            if (is == null) {
                throw new RuntimeException("Unable to find data.json");
            }
            JSONTokener tokener = new JSONTokener(is);
            JSONObject jsonData = new JSONObject(tokener);

            SignupPage sp= new SignupPage(driver);
            
            sp.fillFormWithJsonData(jsonData);
            sp.clickRegisterButton();
            
            CheckEmailPage cep= new CheckEmailPage(driver);
            
            //Validation
            String expectedActivationMsg="We sent you an email with an activation link. Click on it to activate your account.";
            String actualActivationMsg= cep.getEmailActivationMsg();
            
            Assert.assertEquals(actualActivationMsg, expectedActivationMsg,"Missmatch:");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		logger.info("***** Ending verifyRegistration_TC001 *****");
	}
	

}
