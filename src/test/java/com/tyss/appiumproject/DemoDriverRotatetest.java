package com.tyss.appiumproject;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoDriverRotatetest {

	
	@Test(enabled = false)
	public void tc_rotateTest() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
		cap.setCapability(MobileCapabilityType.APP,"G:\\Apkapp\\ApiDemos.apk");

		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("mobile orientation is"+driver.getOrientation());
		Thread.sleep(3000);
		driver.rotate(ScreenOrientation.LANDSCAPE);
		System.out.println("mobile orientation is"+driver.getOrientation());
		Thread.sleep(3000);
		driver.rotate(ScreenOrientation.PORTRAIT);
		System.out.println("mobile orientation is"+driver.getOrientation());
	}
	
	@Test(enabled = false)
	public void tc_OpenNotificationNetworkOnOff() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
		cap.setCapability(MobileCapabilityType.APP,"G:\\Apkapp\\ApiDemos.apk");

		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.openNotifications();
		System.out.println("initial network"+driver.getConnection());
		Thread.sleep(3000);
		driver.setConnection(Connection.NONE);
		System.out.println("initial network"+driver.getConnection());
		Thread.sleep(3000);
		driver.setConnection(Connection.WIFI);
		System.out.println("initial network"+driver.getConnection());
		Thread.sleep(3000);
		driver.setConnection(Connection.NONE);
		System.out.println("initial network"+driver.getConnection());
		Thread.sleep(3000);
		driver.setConnection(Connection.DATA);
		System.out.println("initial network"+driver.getConnection());

	}
	
	@Test(groups = "lokesh",enabled = false)
	public void tc_NotificationRemainder() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
    	cap.setCapability(MobileCapabilityType.NO_RESET, true);
    	
    	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bhanu.notificationreminders");
    	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "MainDrawerActivity");
    	
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.id("com.bhanu.notificationreminders:id/txtNewNoteTitle")).sendKeys("Testdata");
    	driver.findElement(By.id("com.bhanu.notificationreminders:id/btnNotify")).click();
    	Thread.sleep(3000);
    	driver.openNotifications();
    	Thread.sleep(3000);
    	driver.findElement(By.id("android:id/big_text")).click();
    	String testdata = driver.findElement(By.id("com.bhanu.notificationreminders:id/txtNewNoteText")).getText();
    	Assert.assertEquals(testdata, "Testdata");
        
    	
	}
	
	@Test(enabled = false)
	public void tc_TapTest() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
		cap.setCapability(MobileCapabilityType.APP,"G:\\Apkapp\\ApiDemos.apk");

		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.tap(1, driver.findElementByAccessibilityId("Views"), 50);
	}
	
	@Test(enabled = false)
	public void tc_TapOnCoOrdinates() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
		cap.setCapability(MobileCapabilityType.APP,"G:\\Apkapp\\ApiDemos.apk");

		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.tap(1, 159, 1788, 50);
		Thread.sleep(3000);
		//driver.swipe(568, 1778, 568, 393, 1000);
		
		Dimension dim = driver.manage().window().getSize();
        int startx = dim.getWidth()/2;
        int starty=(int)(dim.getHeight()*0.8);
        int endx=startx;
        int endy=(int)(dim.getHeight()*0.2);
		driver.swipe(startx, starty, endx, endy, 1000);


	}
	
	@Test(enabled = true)
	public void tc_FindElementByAndroidAutomator() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
		cap.setCapability(MobileCapabilityType.APP,"G:\\Apkapp\\ApiDemos.apk");

		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement views = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		  views.click();
		  Thread.sleep(3000);
		  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Seek Bar\"))").click();
		  
	}
}
