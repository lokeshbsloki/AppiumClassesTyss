package com.tyss.appiumproject;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BigBasketTest {
    AppiumDriverLocalService appiumService;
    String appiumServiceUrl;
    AndroidDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		
        appiumService = AppiumDriverLocalService.buildDefaultService();
		appiumService.start();
        appiumServiceUrl = appiumService.getUrl().toString();
        System.out.println("Appium Service Address : - "+ appiumServiceUrl);
        
    	DesiredCapabilities cap=new DesiredCapabilities();
    	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
    	cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
    	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
    	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
    	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
    	cap.setCapability(MobileCapabilityType.NO_RESET, true);
    	
    	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bigbasket.mobileapp");
    	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "activity.SplashActivity");
    	
         driver = new AndroidDriver(new URL(appiumServiceUrl), cap);
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(description = "locator")
	public void tc_openBigBasket() throws Exception {
	
	driver.findElement(By.id("com.bigbasket.mobileapp:id/homePageSearchBox")).click();
	driver.findElement(By.id("com.bigbasket.mobileapp:id/searchView")).sendKeys("mangoes");
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
	String items = driver.findElement(By.id("com.bigbasket.mobileapp:id/txtProductCount")).getText();
	System.out.println("items = "+items);
	 String[] itemNum = items.split(" ");
	 int itemnumber = Integer.parseInt(itemNum[0]);
	 System.out.println("item number "+itemnumber);
	 Assert.assertTrue( itemnumber>140, "search items are less than 140");
	
	}
	
	@AfterTest
	public void End() {
		System.out.println("Stop driver");
		driver.quit();
		appiumService.stop();
		System.out.println("Stop appium service");

	}

}
