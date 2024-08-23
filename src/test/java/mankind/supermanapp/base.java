package mankind.supermanapp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class base<MobileElement, AndroidElement> {
	
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void appiumConfiguration() throws MalformedURLException, URISyntaxException, InterruptedException {
		
		//Code to start server
		service = new AppiumServiceBuilder().withAppiumJS(new File("\\Users\\akash.shrivastava\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
		.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("R9ZX10Q0HMH");   //emulator-5554 ,R9ZX10Q0HMH
		options.setApp("C:\\Users\\akash.shrivastava\\eclipse-workspace\\superman\\src\\test\\java\\resources\\app-qa-arm64-v8a-release-383.apk");
        options.setChromedriverExecutable("C:\\Users\\akash.shrivastava\\eclipse-workspace\\superman\\src\\test\\java\\driver\\chromedriver.exe");       
		
		
	   driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		
		Thread.sleep(20000);
		
		
			
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		service.stop();
	}

}
