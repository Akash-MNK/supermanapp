package mankind.supermanapp.pageObjects.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

	AndroidDriver driver;
	
	public LoginPage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	//driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"loginHandler-button\"]")).click();
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@resource-id=\"loginHandler-button\"]")
	private WebElement loginBtn;
	//driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"loginHandler-button\"]"))
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id=\"username\"]")
	private WebElement unamefield;
	//driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"username\"]")).sendKeys("demouser56@mankind.com");
	
	
	
	public void setloginBtn() 
	{
		loginBtn.click();
	}
	
	public void setusername(String name)
	{
		unamefield.sendKeys(name);
		driver.hideKeyboard();
	}
	
	
}

