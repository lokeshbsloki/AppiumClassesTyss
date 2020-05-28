package com.tyss.appiumproject;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class CameraTest {
	
	@Test(enabled=false)
	public void tc_camera() throws MalformedURLException, InterruptedException {
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
		cap.setCapability("noReset", "true");
		cap.setCapability("uiautomator2ServerInstallTimeout", "40000");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElementById("com.android.camera:id/v9_shutter_button_internal").click();
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		Thread.sleep(3000);
		WebElement switchbtn = driver.findElementById("com.android.camera:id/v9_camera_picker");		
		driver.tap(1, switchbtn, 500);
		Thread.sleep(3000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		//instead of keycode enter we can use below line also
		//driver.findElementById("com.android.camera:id/v9_shutter_button_internal").click();
	}
	
	
	@Test(enabled=false)
	public void tc_cameravideo() throws MalformedURLException, InterruptedException {
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
		cap.setCapability("noReset", "true");
		cap.setCapability("uiautomator2ServerInstallTimeout", "40000");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Video\")").click();
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		Thread.sleep(12000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);

	}
	
	@Test(enabled=false)
	public void tc_cameraFlashon() throws MalformedURLException, InterruptedException {
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
		cap.setCapability("noReset", "true");
		cap.setCapability("uiautomator2ServerInstallTimeout", "40000");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.android.camera:id/top_config_00").click();
		Thread.sleep(4000);
		driver.findElementByAndroidUIAutomator("text(\"On\")").click();
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
	

	}
	
	
	@Test
	public void tc_cameraTimeron() throws MalformedURLException, InterruptedException {
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
		cap.setCapability("noReset", "true");
		cap.setCapability("uiautomator2ServerInstallTimeout", "40000");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.android.camera:id/top_config_06").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='1']").click();
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
	

	}
}
