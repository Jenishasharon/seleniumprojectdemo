package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	WebDriver driver;
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}
	@FindBy(xpath="//p[text()='Manage News']")private WebElement managenews;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement create;
	@FindBy(xpath="//textarea[@id='news']")private WebElement information;
	@FindBy(xpath="//button[text()='Save']")private WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alert;
	

	public void manage()
	{
		managenews.click();
	}
	public void createnews()
	{
	create.click();	
	}
	public void message(String newmessage)
	{
		information.sendKeys(newmessage);
	}
	public void savemessage()
	{
		save.click();
	}
	public boolean alert()
	{
		return alert.isDisplayed();
	}
}
