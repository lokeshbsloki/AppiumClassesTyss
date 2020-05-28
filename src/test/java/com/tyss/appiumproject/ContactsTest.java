package com.tyss.appiumproject;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ContactsTest {

	@Test(enabled = false)
	public void tc_ContactsNativeApp() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.contacts");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"activities.PeopleActivity");


		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"More options\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Settings']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='First name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Surname']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//android.widget.TextView[@text='Surname']")).getText();
		System.out.println("test is pass = "+text);

	}
	
	@Test(enabled = false)
	public void tc_ContactsNewContactTest() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.contacts");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"activities.PeopleActivity");


		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.android.contacts:id/floating_action_button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Name']")).sendKeys("Lokesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Phone']")).sendKeys("8618958034");
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.contacts:id/menu_save")).click();
	}
	
	@Test(enabled = false)
	public void tc_ContactsEditContactTest() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.contacts");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"activities.PeopleActivity");


		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Jagadhambike\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.contacts:id/menu_edit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Phone']")).sendKeys("9591480200");
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.contacts:id/menu_save")).click();
	}
	
	@Test(enabled = true)
	public void tc_ContactsDeleteContact() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.contacts");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"activities.PeopleActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"Lokesh\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"More options\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Delete']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text='DELETE']")).click();
	}
}
