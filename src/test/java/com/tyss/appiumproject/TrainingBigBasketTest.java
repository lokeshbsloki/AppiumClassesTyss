package com.tyss.appiumproject;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TrainingBigBasketTest{
	
	@Test(groups = "lokesh")
	public void tc_openapp() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
    	cap.setCapability(MobileCapabilityType.NO_RESET, true);
    	
    	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bigbasket.mobileapp");
    	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "activity.SplashActivity");
    	
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
	


}
