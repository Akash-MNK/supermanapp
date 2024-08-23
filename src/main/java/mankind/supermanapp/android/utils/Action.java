package mankind.supermanapp.android.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;


import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Action {

AndroidDriver driver;
	
	public Action(AndroidDriver driver)
	{
		this.driver=driver;
		
	}
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture");
		ImmutableMap.of("elementid",((RemoteWebElement)ele).getId(),"duration",2000);
	}
			
	
	
}
