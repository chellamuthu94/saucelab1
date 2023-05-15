package saucelab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

@SuppressWarnings("deprecation")
public class pom {
	
	@FindBy(xpath ="//android.widget.Button[@resource-id='android:id/button1']")
	public static WebElement allow1;
	
	@FindBy(xpath ="//android.widget.TextView[@text='Log In']")
	public static WebElement touch;
	
	
	
	
	@FindBy(xpath ="//android.widget.EditText[@password='false']")
	public static WebElement username;
	
	
	@FindBy(xpath = "//android.widget.EditText[@password='true']")
	public static WebElement password;
	
	
	@FindBy(xpath ="//android.widget.Button[@text='LOG IN']")
	public static WebElement login;
	
	@FindBy(xpath ="//android.widget.Button[@text='filter outline']")
	public static WebElement filterclick;
	
	@FindBy(xpath ="//android.widget.TextView[@text='Deselect All']")
	public static WebElement deselect;
	
	@FindBy(xpath = "//android.view.View[3]/android.view.View[1]/android.view.View/android.view.View/android.widget.ToggleButton/android.view.View/android.view.View/android.widget.TextView[@checkable='false']")
	public static WebElement option;
	
	@FindBy(xpath ="//android.widget.Button[@text='Apply']")
	public static WebElement apply;
	
	@FindBy(xpath ="//android.widget.TextView[@text='Select All']")
	public static WebElement select;
	
	
	@FindBy(xpath ="//android.view.View[3]/android.view.View[1]/android.view.View/android.view.View/android.widget.ToggleButton/android.view.View/android.view.View/android.widget.TextView[@checkable='false']")
	public static WebElement unoption;
	
	@FindBy(xpath ="//android.widget.Button[@text='Apply']")
	public static WebElement apply1;

	@FindBy(xpath ="//android.view.View[2]/android.view.View/android.view.View/android.view.View[13]/android.view.View/android.widget.CheckBox")
	public static WebElement bookmark;
	
	@FindBy(xpath ="//android.widget.EditText[@checkable='false']")
	public static WebElement search;
	
	@FindBy(xpath ="//android.widget.Button[@text='search sharp']")
	public static WebElement searchclick;
	
	
	public static void filtersearchlist(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(559,619)).release().perform();
	}
	
	

	public static void copylink(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(988,213)).release().perform();
	}
	
	public static void closetab(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(988,213)).release().perform();
	}
	public static void exit(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(83,225)).release().perform();
	}
	
	
	public static void speaker(PerformsTouchActions driver) {
		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(288,842)).release().perform();
	}
	
	

	@FindBy(xpath = "//android.widget.Image[@text='bar chart outline']")
	public static WebElement tradingroom;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Options']")
	public static WebElement option1;
			

	
	
			@FindBy(xpath = "//android.widget.Button[@text='ENTER ROOM']")
			public static WebElement enterroom;
			

			@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[2]/android.view.View")
			public static WebElement alert;
			
		
			
			
			@FindBy(xpath = "//android.widget.Button[@text='back']")
			public static WebElement exitalert;
			
			
			
			

			@FindBy(xpath = "//android.view.View[@resource-id='tab-button-users']")
			public static WebElement usertab;
			
			
			
		
			
			@FindBy(xpath = "//android.view.View[@resource-id='tab-button-files']")
			public static WebElement files;
				
			@FindBy(xpath = "//android.widget.Image[@bounds='[926,445][995,514]']")
			public static WebElement download;
			
			@FindBy(xpath = "//android.view.View[@text='Schedule']")
			public static WebElement schedule;
			
			
			@FindBy(xpath = "//android.view.View[@text='Settings']")
			public static WebElement seting;
			

			@FindBy(xpath = "//android.widget.ToggleButton[@text='Push NotificationOnly affects this Room']")
			public static WebElement pushnotification;
			

			@FindBy(xpath = "//android.widget.ToggleButton[@text='Audio']")
			public static WebElement audio;
			

			@FindBy(xpath = "//android.widget.ToggleButton[@text='Video / ScreensTurning video off saves mobile data']")
			public static WebElement video;
			
			@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button")
			public static WebElement exitroom;
			

			@FindBy(xpath = "//android.widget.Button[@text='OK']")
			public static WebElement ok;
			
			
			
			
			

			@FindBy(xpath = "//android.view.View[@resource-id='tab-button-classes']")
			public static WebElement classes;	
			
			@FindBy(xpath = "//android.widget.TextView[@text='Internal Use Only']")
	        public static WebElement internal;
			
			


			@FindBy(xpath = "//android.view.View[@resource-id='tab-button-alerts']")
			public static WebElement alerthome;	
			
			@FindBy(xpath = "//android.widget.Image[@text='bookmark outline']")
			public static WebElement bookmarkalerthome;	
			
			
			public static void unmute1(PerformsTouchActions driver) {
				TouchAction action = new TouchAction(driver);
				
				action.tap(PointOption.point(705,776)).release().perform();
			}
			public static void play(PerformsTouchActions driver) {
				TouchAction action = new TouchAction(driver);
				
				action.tap(PointOption.point(404,630)).release().perform();
			}

			public static void homefiltersearchlist(PerformsTouchActions driver) {
				TouchAction action = new TouchAction(driver);
			
				action.tap(PointOption.point(465,495)).release().perform();
			}

			@FindBy(xpath = "//android.view.View[@resource-id='tab-button-home']")
			public static WebElement homemodule;
			
			
			
			@FindBy(xpath = "//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.Image")
			public static WebElement  downloadlink;
			@FindBy(xpath = "//android.widget.Button[@text='Allow']")
			public static WebElement allow;
			
			@FindBy(xpath = "//android.widget.TextView[@text='Download Complete']")
			public static WebElement completd;
			
			@FindBy(xpath = "//android.widget.Button[@text='OK']")
			public static WebElement ok1;
			
			@FindBy(xpath ="//android.widget.TextView[@text='Enter Username to Continue']")
			public static WebElement validatetradingroomuserdefault;
			
			
			@FindBy(xpath ="//android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
			public static WebElement tradinguserclear;
			
			@FindBy(xpath ="//android.view.View[3]/android.widget.Button")
			public static WebElement enterroom1;
			
			
}
			
			
			
			
			
			
			
			
			

			
			
			
			
			
			
			
			
			
			

