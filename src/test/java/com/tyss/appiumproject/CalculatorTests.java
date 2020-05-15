package com.tyss.appiumproject;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorTests {
	
	
	@Test(description = "locator")
	public void tc_openapp1() throws Exception {
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
	cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
	
	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.calculator");
	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
	
	AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
	driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
	driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
	String result = driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
	System.out.println("sum is = "+result);
	
	
	
	}

}
