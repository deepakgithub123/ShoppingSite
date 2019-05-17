package TestMethods;

import org.testng.annotations.Test;

import registrationTesting.Home_page;

import TestMethods.ValidHomePage;

public class LogOut {

	// LogOut test case
	@Test(priority = 10)
	public void logOut() throws InterruptedException {
		
		Home_page.lnk_LogOut(ValidHomePage.driver);
	}
}
