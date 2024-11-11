package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckEmailPage extends BasePage{

	public CheckEmailPage(WebDriver driver) {
		super(driver);		
	}

	
	//****** WebElements ******
	
	@FindBy(xpath = "//span[contains(text(),'We sent you an email with an activation link.')]")
	WebElement emailActivationMsg;

	
	
	//****** Actions ******
	
	public String getEmailActivationMsg()
	{
		return emailActivationMsg.getText();
	}
}
