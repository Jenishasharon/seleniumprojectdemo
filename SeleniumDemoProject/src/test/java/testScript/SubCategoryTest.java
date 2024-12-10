package testScript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtility;

public class SubCategoryTest extends Base{
@Test
	public void subCategory() throws IOException, AWTException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "LoginPage");
		String subcategoryvalue=ExcelUtility.getStringData(1, 0, "SubCategory");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signin();
		SubCategoryPage subcategorypage=new SubCategoryPage(driver);
		subcategorypage.subCategoryMoreinfo();
		subcategorypage.newCategory();
		subcategorypage.category();
		subcategorypage.subCategory(subcategoryvalue);
		subcategorypage.image();
		subcategorypage.save();
		boolean alertCheck=subcategorypage.alert();
		Assert.assertTrue(alertCheck);
	}
}
