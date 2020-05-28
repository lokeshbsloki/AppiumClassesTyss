package com.tyss.appiumproject;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DialNativeApp {

	@Test
	public void tc_DialApp() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		//cap.setCapability(MobileCapabilityType.NO_RESET, true);
		// cap.setCapability(MobileCapabilityType.FULL_RESET, true);

		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.dialer");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "DialtactsActivity");


		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.android.dialer:id/floating_action_button_container")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='2']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='3']")).click();

		driver.findElement(By.xpath("//android.widget.TextView[@text='4']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='5']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='6']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='7']")).click();
		Thread.sleep(4000);

		driver.findElement(By.id("com.android.dialer:id/dialpad_floating_action_button_container")).click();
		Thread.sleep(4000);

		driver.findElement(By.id("com.android.dialer:id/floating_end_call_action_button")).click();
		
		driver.closeApp();
		
		
	}
}
