package com.tyss.appiumproject;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Assignments {
	
	@Test(enabled = false)
	public void tc_SwipeSeekBarTo80Percent() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
		cap.setCapability(MobileCapabilityType.APP,"G:\\Apkapp\\ApiDemos.apk");

		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement views = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		  views.click();
		  Thread.sleep(3000);
		  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Seek Bar\"))").click();
		  
		 // driver.swipe(200, 268,830 , 278, 1000);
		  WebElement seekBar = driver.findElement(By.id("io.appium.android.apis:id/seek"));
		  Point loc = seekBar.getLocation();
		  
		  int startx=loc.getX();
		  int starty=loc.getY();
		  int endx=(int)(seekBar.getSize().getWidth()*0.8);
		  int endy=startx;
		  
		  driver.swipe(startx, starty, endx, endy, 1000);
  
	}
	@Test(enabled = false)
	public void tc_XpathAndDropDownHandle() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
		cap.setCapability(MobileCapabilityType.APP,"G:\\Apkapp\\ApiDemos.apk");

		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@index='10']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"2. Dark Theme\"]")).click();
        driver.hideKeyboard();
        driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
        Thread.sleep(2000);
       List<MobileElement> dropDownElements = driver.findElementsByXPath("//android.widget.CheckedTextView");
       for(MobileElement ele:dropDownElements)
       {
    	 System.out.println(ele.getText());  
       }
	}

	@Test(enabled = false)
	public void tc_TouchScreenTestAppSquare() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
    	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.rallwell.siriuth.touchscreentest");
    	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Dimension dim = driver.manage().window().getSize();
        int startx1 = (int)(dim.getWidth()*0.2);
        int starty1=(int)(dim.getHeight()*0.2);
        int endx1=startx1;
        int endy1=(int)(dim.getHeight()*0.8);
		driver.swipe(startx1, starty1, endx1, endy1, 1000);
		
		Thread.sleep(2000);
		
        int startx2 = (int)(dim.getWidth()*0.2);
        int starty2=(int)(dim.getHeight()*0.8);
        int endx2=(int)(dim.getWidth()*0.8);
        int endy2=starty2;
		driver.swipe(startx2, starty2, endx2, endy2, 1000);
		
		Thread.sleep(2000);

        int startx3 = (int)(dim.getWidth()*0.8);
        int starty3 = (int)(dim.getHeight()*0.8);
        int endx3   = startx3;
        int endy3   = (int)(dim.getHeight()*0.2);
		driver.swipe(startx3, starty3, endx3, endy3, 1000);
		
		Thread.sleep(2000);

        int startx4 = (int)(dim.getWidth()*0.8);
        int starty4 = (int)(dim.getHeight()*0.2);
        int endx4   = (int)(dim.getWidth()*0.2);
        int endy4   = starty4;
		driver.swipe(startx4, starty4, endx4, endy4, 1000);
	
	}
	
	@Test(enabled = false)
	public void tc_TouchScreenTestAppLshape() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
    	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.rallwell.siriuth.touchscreentest");
    	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Dimension dim = driver.manage().window().getSize();
        int startx1 = (int)(dim.getWidth()*0.2);
        int starty1=(int)(dim.getHeight()*0.2);
        int endx1=startx1;
        int endy1=(int)(dim.getHeight()*0.8);
		driver.swipe(startx1, starty1, endx1, endy1, 1000);
		
		Thread.sleep(2000);
		
        int startx2 = (int)(dim.getWidth()*0.2);
        int starty2=(int)(dim.getHeight()*0.8);
        int endx2=(int)(dim.getWidth()*0.8);
        int endy2=starty2;
		driver.swipe(startx2, starty2, endx2, endy2, 1000);

	}
	
	@Test(enabled = false)
	public void tc_TouchScreenTestAppLDiagonal() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
    	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.rallwell.siriuth.touchscreentest");
    	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Dimension dim = driver.manage().window().getSize();
        int startx1 = (int)(dim.getWidth()*0.2);
        int starty1=(int)(dim.getHeight()*0.2);
        int endx1=startx1;
        int endy1=(int)(dim.getHeight()*0.8);
		driver.swipe(startx1, starty1, endx1, endy1, 1000);
		
		Thread.sleep(2000);
		
        int startx2 = (int)(dim.getWidth()*0.2);
        int starty2=(int)(dim.getHeight()*0.8);
        int endx2=(int)(dim.getWidth()*0.8);
        int endy2=starty2;
		driver.swipe(startx2, starty2, endx2, endy2, 1000);
		
		Thread.sleep(2000);

        int startx3 = (int)(dim.getWidth()*0.2);
        int starty3=(int)(dim.getHeight()*0.8);
        int endx3=(int)(dim.getWidth()*0.8);
        int endy3=(int)(dim.getHeight()*0.2);
		driver.swipe(startx3, starty3, endx3, endy3, 1000);

	}
	
	@Test(enabled = true)
	public void tc_TouchScreenTestAppCrossShape() throws Exception {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Lenovo K8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "HNB3B18T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
    	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jp.rallwell.siriuth.touchscreentest");
    	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "TouchScreenTestActivity");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Dimension dim = driver.manage().window().getSize();
        int startx1 = (int)(dim.getWidth()*0.2);
        int starty1=(int)(dim.getHeight()*0.2);
        int endx1=(int)(dim.getWidth()*0.8);
        int endy1=(int)(dim.getHeight()*0.8);
		driver.swipe(startx1, starty1, endx1, endy1, 1000);
		
		Thread.sleep(2000);
		
        int startx2 = (int)(dim.getWidth()*0.8);
        int starty2=(int)(dim.getHeight()*0.2);
        int endx2=(int)(dim.getWidth()*0.2);
        int endy2=(int)(dim.getHeight()*0.8);
		driver.swipe(startx2, starty2, endx2, endy2, 1000);

	}
}
