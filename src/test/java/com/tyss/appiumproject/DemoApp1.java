package com.tyss.appiumproject;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoApp1 {
	@Test(enabled = false)
	public void tc_openapp1() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Lenovo K8 Plus");
		cap.setCapability("udid", "HNB3B18T");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.1.1");
		cap.setCapability("automationName", "appium");
		
		cap.setCapability("appPackage", "com.google.android.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		
	}
	
	@Test
	public void tc_openapp() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.calculator");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		
	}

}
