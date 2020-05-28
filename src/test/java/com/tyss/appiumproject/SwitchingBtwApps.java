package com.tyss.appiumproject;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwitchingBtwApps {

	
	@Test(enabled = false)
	public void tc_SwitchApps() throws Exception {
		
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
    	Thread.sleep(5000);
    	if (driver.isAppInstalled("com.google.android.apps.messaging")) {
			
		
    	driver.startActivity("com.google.android.apps.messaging", "home.HomeActivity");
    	Thread.sleep(5000);
    	}

    	driver.launchApp();
	}
	
	@Test(enabled = false)
	public void tc_SwitchToApiDemos() throws Exception {
		
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
    	Thread.sleep(5000);
    	if (driver.isAppInstalled("io.appium.android.apis")) {
			
		System.out.println("apiDemos app is installed");
    	driver.startActivity("io.appium.android.apis", "ApiDemos");
    	}
    	else {
    		System.out.println("api demos is not installed = "+driver.isAppInstalled("io.appium.android.apis"));
    		driver.installApp("G:\\Apkapp\\ApiDemos.apk");
    		driver.startActivity("io.appium.android.apis", "ApiDemos");

    	}
    	Thread.sleep(5000);
    	driver.launchApp();
	}
	
	@Test(enabled = true)
	public void tc_LockAndUnlockDevice() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
    	cap.setCapability(MobileCapabilityType.NO_RESET, true);
    	
    	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
    	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ApiDemos");
    	
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	if(!driver.isLocked())
    	{
    		System.out.println("device is not locked = "+driver.isLocked());
    		Thread.sleep(2000);
    		driver.lockDevice();
    	}
		Thread.sleep(3000);
		driver.unlockDevice();
		System.out.println("device is unlocked");
		Thread.sleep(3000);
	}
}
