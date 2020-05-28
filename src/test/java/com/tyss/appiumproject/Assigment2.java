package com.tyss.appiumproject;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Assigment2 {

	@Test(enabled = false)
	public void tc_RatingBar() throws Exception {
		
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
		  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rating Bar\"))").click();
		  
		 WebElement ratingelement = driver.findElement(By.id("io.appium.android.apis:id/ratingbar2"));
		 
		
		Point loc = ratingelement.getLocation();
		
		int startx=loc.getX();
		int starty=loc.getY();
		int endx=(int)(ratingelement.getSize().getWidth()*0.7);
		int endy=starty;
		driver.tap(1, endx, endy, 1000);
		//driver.swipe(startx, starty, endx, endy, 1000);
		Thread.sleep(3000);
		String ratingmsg = driver.findElement(By.id("io.appium.android.apis:id/rating")).getText();
		
		System.out.println("rating message = "+ratingmsg);
		Assert.assertEquals(ratingmsg, "Rating: 3.5/5");
		 
	}
	



}
