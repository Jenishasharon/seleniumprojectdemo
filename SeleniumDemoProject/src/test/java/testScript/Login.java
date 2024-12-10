package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base{

	@Test
	public void loginTest()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String username="admin";
		String password="admin";
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		user.sendKeys(username);
		pass.sendKeys(password);
		signin.click();
		WebElement dashboard=driver.findElement(By.xpath("//p[text()='Dashboard']"));
		boolean isHomePageAvailable=dashboard.isDisplayed();
				Assert.assertTrue(isHomePageAvailable);
		
		}
	@Test
	public void inCorrectPassword()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String username="admin";
		String password="1234";
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		user.sendKeys(username);
		pass.sendKeys(password);
		signin.click();
		WebElement alert=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean isHomePageAvailable=alert.isDisplayed();
		Assert.assertTrue(isHomePageAvailable);
		
		}
	@Test
	public void inCorrectUsername()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String username="hello";
		String password="admin";
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		user.sendKeys(username);
		pass.sendKeys(password);
		signin.click();
		WebElement alert=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean isHomePageAvailable=alert.isDisplayed();
		Assert.assertTrue(isHomePageAvailable);	
	}
	@Test
	public void inCorrectLogin()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String username="hello";
		String password="1234";
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		user.sendKeys(username);
		pass.sendKeys(password);
		signin.click();
		WebElement alert=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean isHomePageAvailable=alert.isDisplayed();
		Assert.assertTrue(isHomePageAvailable);	
		
	}
	
}
