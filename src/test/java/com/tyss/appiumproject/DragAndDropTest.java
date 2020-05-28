package com.tyss.appiumproject;

import org.openqa.selenium.Dimension;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DragAndDropTest {

	@Test
	public void tc_openapp() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		// cap.setCapability(MobileCapabilityType.FULL_RESET, true);

		cap.setCapability(MobileCapabilityType.APP, "G:\\Apkapp\\ApiDemos.apk");

		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("Views").click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
		Thread.sleep(3000);
		WebElement srcele = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		WebElement desele = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
		// WebElement desele2 =
		// driver.findElement(By.id("io.appium.android.apis:id/drag_dot_hidden"));

		Dimension dim = driver.manage().window().getSize();
		int x = (int) (dim.getWidth() * 0.6);
		int y = (int) (dim.getHeight() * 0.5);

		TouchAction ta = new TouchAction(driver);
		ta.longPress(srcele).waitAction(5000).moveTo(x, y).release().perform();

	}
}
