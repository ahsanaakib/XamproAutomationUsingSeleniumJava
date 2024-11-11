package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);		
	}
	
	
	
	// ****** WebElements ******
	
	@FindBy(xpath = "//button[@aria-label='Close']") WebElement btnDialogClose;
	@FindBy(xpath = "//span[normalize-space()='Registration']") WebElement linkReg;
	@FindBy(xpath = "//a[@class='navbar-login-btn nav-link']") WebElement linkLogin;
	
	
	
	// ****** Actions ******
	
	public void clickDialogClose()
	{
		btnDialogClose.click();
	}

	public void clickRegistration()
	{
		linkReg.click();
	}
	
	public void clickSignIn()
	{
		linkLogin.click();
	}
}
