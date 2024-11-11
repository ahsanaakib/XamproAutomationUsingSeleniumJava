package PageObjects;

import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {

	public SignupPage(WebDriver driver) {
		super(driver);
	}

	// ****** WebElements ******

	@FindBy(xpath = "//input[@id='name']")
	WebElement inputName;
	@FindBy(xpath = "//input[@id='email']")
	WebElement inputEmail;
	@FindBy(xpath = "//input[@id='phoneNumber']")
	WebElement inputPhoneNo;
	@FindBy(xpath = "//input[@id='password']")
	WebElement inputPassword;
	@FindBy(xpath = "//input[@id='confirmPassword']")
	WebElement inputConfirmPassword;
	@FindBy(xpath = "//div[@class='account-access-submit-button']")
	WebElement btnRegister;

	
	
	// ****** Actions ******

	public void fillFormWithJsonData(JSONObject jsonData) {
		inputName.sendKeys(jsonData.getString("name"));
		inputEmail.sendKeys(jsonData.getString("email"));
		inputPhoneNo.sendKeys(jsonData.getString("phoneNumber"));
		inputPassword.sendKeys(jsonData.getString("password"));
		inputConfirmPassword.sendKeys(jsonData.getString("confirmPassword"));
	}
	
	public void clickRegisterButton()
	{
		btnRegister.click();
	}
}
