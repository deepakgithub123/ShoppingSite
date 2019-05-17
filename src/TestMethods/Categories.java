package TestMethods;

import org.testng.annotations.Test;

import registrationTesting.Home_page;

import TestMethods.ValidHomePage;

public class Categories {

	// Category page test case
	@Test(priority = 3)
	public void categoryPage() throws InterruptedException {
		Home_page.lnk_Categories(ValidHomePage.driver);

	}

}
