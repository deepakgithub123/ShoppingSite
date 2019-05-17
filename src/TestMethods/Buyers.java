package TestMethods;

import org.testng.annotations.Test;
import registrationTesting.Home_page;

import TestMethods.ValidHomePage;

public class Buyers {

	// Buyers page test case
	@Test(priority = 1)
	public void buyresPage() throws InterruptedException {
		Home_page.lnk_Buyers(ValidHomePage.driver);

	}
}
