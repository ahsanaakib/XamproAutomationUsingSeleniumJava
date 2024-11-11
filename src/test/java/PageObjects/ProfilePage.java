package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{

	public ProfilePage(WebDriver driver) {
		super(driver);		
	}
	
	
	
	//****** WebElements ******
	
	@FindBy(xpath = "//input[@id='fullName']") WebElement inputFullName;
	@FindBy(xpath = "//input[@id='dob']") WebElement inputDOB;
	@FindBy(xpath = "//input[@id='radio-gender-male']")
	public WebElement inputRadioMale;
	@FindBy(xpath = "//select[@id='education']")
	public WebElement drpdwnEducation;
	@FindBy(xpath = "//select[@id='education']/option[6]") WebElement selectEduBSC;
	@FindBy(xpath = "//button[@class='profile-submit-page-btn btn btn-primary']") WebElement btnUpdate;
	
	
	
	//****** Actions ******
	
	public void setFullName(String name)
	{
		inputFullName.clear();
		inputFullName.sendKeys(name);
	}
	
	public void clickDOB()
	{
		inputDOB.click();	
	}
	
	public void setDOB(String dob)
	{
		inputDOB.sendKeys(dob);
	}
	
	public void setGender()
	{
		inputRadioMale.click();
	}
	
	public void clickEducationDropDown()
	{
		drpdwnEducation.click();
	}
	
	public void setEducation()
	{
		selectEduBSC.click();
	}
	
	public void clickUpdate()
	{
		btnUpdate.click();
	}
	
}
