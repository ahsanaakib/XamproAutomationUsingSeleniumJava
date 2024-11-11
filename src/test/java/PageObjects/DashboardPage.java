package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

	public DashboardPage(WebDriver driver) {
		super(driver);	
	}
	
	
	
	//****** WebElements ******
	
	@FindBy(xpath = "//div[@class='profile-view-btn nav-item dropdown']/a") WebElement drpdwnProfile;
	@FindBy(xpath = "//a[@class='svg-nav-icon-dropdown log-out-btn']") WebElement linkLogout;	
	@FindBy(xpath = "//div[@class='user-profile-info-wrap']//a") WebElement linkUpdateProfile;
	
	
	
	//****** Actions ******
	
	public void clickProfile()
	{
		drpdwnProfile.click();
	}
	
	public boolean isLogoutDisplayed()
	{
		return linkLogout.isDisplayed();
	}
	
	public void clickUpdateProfile() 
	{
		linkUpdateProfile.click();
	}

}
