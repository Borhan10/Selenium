package pom.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.thoughtworks.selenium.ScreenshotListener;

public class HomePageObject {
	
	WebDriver driver;
	public HomePageObject()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html/body/div/div[2]/header/div/div[2]/a[3]")
	WebElement Account;
	
	public void clickaccountmenu()
	{
		Account.click();
	}
	public void createAccount()
	{
		ScreenshotListener.
	}
}
