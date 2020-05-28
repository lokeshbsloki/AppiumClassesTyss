package com.tyss.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Pedometer {
	
	@Test(enabled=true)
	public void tc_PedometerOpen() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"pedometer.stepcounter.calorieburner.pedometerforwalking");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"activity.SplashActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("pedometer.stepcounter.calorieburner.pedometerforwalking:id/iv_play_pause")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("pedometer.stepcounter.calorieburner.pedometerforwalking:id/iv_play_pause")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("pedometer.stepcounter.calorieburner.pedometerforwalking:id/iv_play_pause")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("pedometer.stepcounter.calorieburner.pedometerforwalking:id/iv_play_pause")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("pedometer.stepcounter.calorieburner.pedometerforwalking:id/iv_play_pause")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pedometer.stepcounter.calorieburner.pedometerforwalking:id/iv_reset")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pedometer.stepcounter.calorieburner.pedometerforwalking:id/md_buttonDefaultPositive")).click();
	}

}
