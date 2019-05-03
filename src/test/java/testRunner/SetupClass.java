package testRunner;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.Properties;

//import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SetupClass {
	public static AndroidDriver<MobileElement> driver;
	public static Properties property = new Properties(System.getProperties());
	public static String sauceURL;
	public static String BrowserstackURL;
//	public static Logger log;
	public static WebElement webelement;
	public static String onmobile;
	public static String onsaucelabs;
	public static String OnBStack;
	@BeforeClass
	public static void before_Class() throws Exception {
//		log = Logger.getLogger("devpinoyLogger");
		property.load(new FileReader("config//Config.properties"));
		onmobile = property.getProperty("onmobile");

		sauceURL = property.getProperty("sauce_url");
		onsaucelabs = property.getProperty("onsaucelabs");

		OnBStack = property.getProperty("OnBStack");
		BrowserstackURL = property.getProperty("browserstack_url");
		// On real mobile device
	if ((onmobile.equals("yes"))) {
//			 set up appium against a local application
			File app = new File("C:\\Users\\AL Moin Webtech\\Downloads\\Sandman 1.0.apk");
		
			
			DesiredCapabilities cab = new DesiredCapabilities();
			cab.setCapability(CapabilityType.BROWSER_NAME, "");
			cab.setCapability("deviceName", "Android");
			cab.setCapability("platformName", "Android");
			cab.setCapability("platformVersion", "7.1.1");
			cab.setCapability("noReset", "true");
			cab.setCapability("skipUnlock", "true");
			cab.setCapability("app", app.getAbsolutePath());
			cab.setCapability("appPackage", "com.nethues.mobius");
			cab.setCapability("appActivity", "md5663180cb395b87679fcdb6cb6ac4da0d.HomeScreenActivity");
			
		
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cab);
			Thread.sleep(2000);
		}
		
		
		//camera app
		
//		if ((onmobile.equals("yes"))) {
////			 set up appium against a local application
//			File app = new File("C:\\Users\\AL Moin Webtech\\Downloads\\xha-6229-beta-debug-10.9.0.10009000.apk");
//		
//			
//			DesiredCapabilities cab = new DesiredCapabilities();
//			cab.setCapability(CapabilityType.BROWSER_NAME, "");
//			cab.setCapability("deviceName", "Android");
//			cab.setCapability("platformName", "Android");
//			cab.setCapability("platformVersion", "7.1.1");
//			cab.setCapability("noReset", "true");
//			cab.setCapability("skipUnlock", "true");
//			cab.setCapability("app", app.getAbsolutePath());
//			cab.setCapability("appPackage", "com.nethues.mobius");
//			cab.setCapability("appActivity", "md5663180cb395b87679fcdb6cb6ac4da0d.HomeScreenActivity");
//			
//		
//			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cab);
//			Thread.sleep(2000);
//		}
		// on virtual device
		else if (onsaucelabs.equals("yes")) {
			File app = new File("C:\\Users\\AL Moin Webtech\\Downloads\\Sandman 1.0.apk");
			DesiredCapabilities cab = new DesiredCapabilities();
			cab.setCapability(CapabilityType.BROWSER_NAME, "");
			cab.setCapability("deviceName", "Samsung Galaxy S7 Edge WQHD GoogleAPI Emulator");
			cab.setCapability("platformName", "Android");
			cab.setCapability("platformVersion", "7.0");
			cab.setCapability("app", app.getAbsolutePath());
//			cab.setCapability("app", "sauce-storage:QuickHealthDoctor.apk");
			cab.setCapability("app", "sauce-storage:FutureFoundation.apk");
	 	    cab.setCapability("name", "app test on saucelabs platform device");		
//			create a RemoteWebDriver, the default port for Appium is 4723
			driver = new AndroidDriver<MobileElement>(new URL(sauceURL), cab);
			Thread.sleep(2000);
		}
		else if (OnBStack.equalsIgnoreCase("yes")) {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("device", "Samsung Galaxy S8");
			caps.setCapability("os_version", "7.0");
			caps.setCapability("realMobile", "true");
			caps.setCapability("app", "bs://ba71eab4e94ecbe091a768a3cd393624d815557b");
			caps.setCapability("name", "app automation test on android mobile");
			driver = new AndroidDriver<MobileElement>(new URL(BrowserstackURL), caps);
		} else {
			System.out.println("test");
		}
	}

	@AfterClass
	public static void after_Class() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
	}
}
