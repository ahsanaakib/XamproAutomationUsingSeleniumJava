package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);		
	}

	
	//****** WebElements ******
	@FindBy(xpath = "//input[@id='email']") WebElement inputEmail;
	@FindBy(xpath = "//input[@id='password']") WebElement inputPassword;
	@FindBy(xpath = "//button[@type='submit']") WebElement btnSubmit;
	
	

	
	
	//****** Actions ******
	
	public void inputEmail(String email)
	{
		inputEmail.sendKeys(email);
	}
	
	public void inputPassword(String pwd)
	{
		inputPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnSubmit.click();
	}
	
	
	
	
}
