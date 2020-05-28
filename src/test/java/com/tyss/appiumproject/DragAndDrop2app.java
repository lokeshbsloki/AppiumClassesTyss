package com.tyss.appiumproject;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DragAndDrop2app {

	@Test
	public void tc_draganddrop2() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		// cap.setCapability(MobileCapabilityType.FULL_RESET, true);

		cap.setCapability(MobileCapabilityType.APP, "G:\\Apkapp\\DragSortDemos.apk");

		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.mobeta.android.demodslv:id/activity_title")).click();
		
		 List<WebElement> list = driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle"));
		
		TouchAction ta= new TouchAction(driver);
		
		ta.press(list.get(0)).waitAction(3000).moveTo(list.get(3)).release().perform();
		
	}
	
	@Test
	public void tc_multiTouchtestApp() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		//cap.setCapability(MobileCapabilityType.NO_RESET, true);
		// cap.setCapability(MobileCapabilityType.FULL_RESET, true);

		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.the511plus.MultiTouchTester");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "MultiTouchTester");


		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		TouchAction ta1= new TouchAction(driver);
		
		TouchAction swipe1 = ta1.press(235,413).waitAction(3000).moveTo(532,1514).release();
		
		TouchAction ta2= new TouchAction(driver);
		
		TouchAction swipe2 = ta2.press(555,443).waitAction(3000).moveTo(552,1544).release();
		
		MultiTouchAction ma=new MultiTouchAction(driver);
		ma.add(swipe1).add(swipe2).perform();
	}
		
		
}
