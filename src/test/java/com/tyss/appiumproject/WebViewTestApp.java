package com.tyss.appiumproject;

import java.net.URL;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebViewTestApp {

	@Test(groups = "lokesh")
	public void tc_HybridApptest() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
    	cap.setCapability(MobileCapabilityType.NO_RESET, true);
    	
    	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.snc.test.webview2");
    	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.snc.test.webview.activity.MainActivity");
    	
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"go website\"]")).click();
    	Thread.sleep(3000);
    	WebElement url = driver.findElement(By.id("com.snc.test.webview2:id/input_url"));
    	url.clear();
    	url.sendKeys("m.facebook.com");
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//android.widget.Button[@text='GO']")).click();
    	Thread.sleep(3000);
    	System.out.println("current context---->"+driver.getContext());
    	Set<String> contextset = driver.getContextHandles();
    	System.out.println("contexts present in the app-----> "+contextset);
    	
    	ArrayList<String> al = new   ArrayList<String>(contextset);
    	driver.context(al.get(1));
    	Thread.sleep(3000);
    	System.out.println("current context---->"+driver.getContext());
		driver.findElement(By.xpath("//input[@id='m_login_email']")).sendKeys("lokeshbs");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='m_login_password']")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();


	}
	
	
	
	
}
