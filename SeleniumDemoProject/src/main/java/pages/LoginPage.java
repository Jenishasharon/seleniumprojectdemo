package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}
	@FindBy(xpath="//input[@name='username']")private WebElement user;
	@FindBy(xpath=" //input[@type='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']")private WebElement dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement alert;
	
	
public void enterUserName(String username)
{
	user.sendKeys(username);
}
public void enterPassword(String pass)
{
	password.sendKeys(pass);
}
public void signin()
{
	signin.click();
}
public boolean isHomePageLoaded()
{
	return dashboard.isDisplayed();
}
public boolean alert()
{
	return alert.isDisplayed();
}
}