package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtilities;
import utilities.PageUtility;

public class SubCategoryPage {
	WebDriver driver;
	public SubCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
		
	}

	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']")private WebElement moreinfo; 
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/add']")private WebElement newbutton;
	@FindBy(xpath="//select[@id='cat_id']")private WebElement category;
	@FindBy(xpath="//input[@id='subcategory']")private WebElement subcat;
	@FindBy(xpath="//input[@id='main_img']")private WebElement file;
	@FindBy(xpath="//button[@type='submit']")private WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alert; 
	

	
	public void subCategoryMoreinfo()
	{
		moreinfo.click();
	}
	public void newCategory()
	{
		newbutton.click();	
	}
	public void category()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.selectByVisibleText(category,"Synergistic Wool Knife");
	}
	public void subCategory(String subcategory)
	{
		subcat.sendKeys(subcategory);
	}
	public void image() throws AWTException
	{
		
		FileUploadUtilities fileuploadutilities=new FileUploadUtilities();
		//fileuploadutilities.fileuploadRobotClass(file,Constants.COCONUTOIL);
		fileuploadutilities.fileuploadSendKeys(file,Constants.COCONUTOIL);
	}
	public void save()
	{
		savebutton.click();
	}
	public boolean alert()
	{
		return alert.isDisplayed();
	}
	}

