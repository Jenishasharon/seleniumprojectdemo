package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
@Test
	public void checkWhetherTheUserIsAbleToCreateNews() throws IOException
	{
	String usernamevalue=ExcelUtility.getStringData(1, 0, "LoginPage");
	String passwordvalue=ExcelUtility.getStringData(1, 1, "LoginPage");
	String msg=ExcelUtility.getStringData(1, 0, "ManageNews");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUserName(usernamevalue);
	loginpage.enterPassword(passwordvalue);
	loginpage.signin();
	ManageNewsPage managenewspage=new ManageNewsPage(driver);
	managenewspage.manage();
	managenewspage.createnews();
	managenewspage.message(msg);
	managenewspage.savemessage();
	managenewspage.alert();
	}
}
