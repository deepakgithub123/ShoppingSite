package registrationTesting;

import org.openqa.selenium.*;

public class Login_Page {

	private static WebElement element = null;
	
    public static WebElement txtbx_UserName(WebDriver driver){
 
         element = driver.findElement(By.name("userBean.email"));
         return element;
         }
 
     public static WebElement txtbx_Password(WebDriver driver){
         element = driver.findElement(By.name("userBean.password"));
         return element;
         }
 
     public static WebElement btn_LogIn(WebDriver driver){
        // element = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button"));
         
         element = driver.findElement(By.id("submit"));
         return element;
         }	

     public static WebElement validHome(WebDriver driver){
         element = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button"));
         return element;
         }	
   
}
