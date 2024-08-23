package mankind.supermanapp;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import mankind.supermanapp.pageObjects.android.LoginPage;

public class LoginTest extends base {
	
	
	@Test
	public void Login() throws MalformedURLException, URISyntaxException, InterruptedException
	{
		appiumConfiguration();
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.setloginBtn();
		
		loginPage.setusername("demouser56@mankind.com");
	}
	

}
