package TestMethods;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import registrationTesting.Home_page;
import registrationTesting.Login_Page;

public class ValidHomePage {

	public static WebDriver driver;
	
	public static ATUTestRecorder recorder;
	
	 @BeforeTest
	 public void setup() throws Exception {
	  DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	  Date date = new Date();
	  //Created object of ATUTestRecorder
	  //Provide path to store videos and file name format.
	  recorder = new ATUTestRecorder("D:\\Sumit_Backup\\Automation\\Workspace\\ShoppingStore3\\ScriptVideos\\","TestVideo-"+dateFormat.format(date),false);
	  //To start video recording.
	  recorder.start();  
	 }

	@Test(priority = 0)
	public void testHomePageAppear() throws InterruptedException {

		String url = System.getProperty("user.dir") + "\\src\\Browser\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", url);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://st2.idsil.com:8081/ShoppingStore/login");

		driver.manage().window().maximize();

		Login_Page.txtbx_UserName(driver).sendKeys("admin@admin.com");
		Login_Page.txtbx_Password(driver).sendKeys("admin");
		Login_Page.btn_LogIn(driver).click();

		Home_page.validateHomeage(driver);

		Thread.sleep(4000);
	}

}
