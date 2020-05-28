package com.tyss.appiumproject;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class StopWatchAppTest {

	@Test(enabled = true)
	public void tc_StopWatchTimerTest() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.deskclock");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.deskclock.DeskClock");

		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Stopwatch']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.google.android.deskclock:id/fab")).click();
		Thread.sleep(2000);

		driver.runAppInBackground(10);
		Thread.sleep(2000);

		System.out.println("success");

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Lap\"]")).click();
		Thread.sleep(2000);
		 String text = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView[2]\r\n" + 
		 		"")).getText();
		 System.out.println("time lap is "+text);
			driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Pause\"]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//nh[@content-desc=\"Alarm\"]")).click();

			
//		String min = driver.findElement(By.id("com.google.android.deskclock:id/stopwatch_time_text")).getText();
//		String secs = driver.findElement(By.id("com.google.android.deskclock:id/stopwatch_hundredths_text")).getText();
//		System.out.println("stop watch time is "+min+"minutes "+secs+"seconds");
	}
}
