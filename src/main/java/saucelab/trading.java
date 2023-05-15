package saucelab;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import io.appium.java_client.android.AndroidDriver;

public class trading {
	static AndroidDriver driver = null;
	public static DesiredCapabilities caps = new DesiredCapabilities();	
	
	public static String USERNAME="oauth-odcchella-b25bf";
	
	public static String PASSWORD="78867111-5bbb-4119-82f7-dddc274fb544";
	
       @Test
	public void test() throws MalformedURLException {
	
    	 
    	   caps.setCapability("appiumVersion", "1.22.3");
    	    caps.setCapability("deviceName","Samsung Galaxy S9 Plus FHD GoogleAPI Emulator");
    	    caps.setCapability("deviceOrientation", "portrait");
    	   
    	    caps.setCapability("platformVersion","8.1");
    	    caps.setCapability("platformName","Android");
    	    caps.setCapability("appium:app", "storage:filename=simpler-trading-0805.apk");
    	    MutableCapabilities sauceOptions = new MutableCapabilities();
    	    sauceOptions.setCapability("build", "appium-build-7V7BX");
    	    sauceOptions.setCapability("name", "<your test name>");
    	    caps.setCapability("sauce:options", sauceOptions);
    	    URL url = new java.net.URL("https://"+USERNAME+":"+PASSWORD+"@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
    		driver= new AndroidDriver(url,caps);
    		PageFactory.initElements(driver, pom.class);
    		
    		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    		   pom.allow1.click();
    		   pom.username.sendKeys("roomtest1@simplertrading.com");
    		   pom.touch.click();

    		  pom.password.sendKeys("4IW6i8vINHxWD@1upABBOqxG");
    		  pom.touch.click();

    		 pom.login.click();
    		 
	}
	
	
	
	
}
