package base;

import static org.junit.Assert.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Desiredcap {

	@Test
	public void test() throws MalformedURLException, InterruptedException {
		File appdir= new File("src");
		File apppath = new File(appdir,"com.bt.bms_4.3.9.apk");
		DesiredCapabilities cap= new DesiredCapabilities();
//		cap.setCapability("platformName" , "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.APP, apppath.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "500");     //max waiting time
//		cap.setCapability("deviceName", "Android Emulator");
//		cap.setCapability("app", apppath.getAbsolutePath());

/*		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		Thread.sleep(5000L);
		driver.findElementById("com.bt.bms:id/btnNoThanks").click();
		driver.findElementById("com.bt.bms:id/dismiss").click();
		
		*/
	}

}
