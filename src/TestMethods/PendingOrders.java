package TestMethods;

import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

import registrationTesting.Home_page;

import TestMethods.ValidHomePage;

public class PendingOrders {

	// Pending order list test case
	@Test(priority = 7)
	public void pendiOrederPage() throws InterruptedException {

		Home_page.lnk_pendingOrderLict(ValidHomePage.driver);

	}

	// View Order detail page test case
	@Test(priority = 8)
	public void orederDetailPage() throws InterruptedException {

		Home_page.lnk_pendingOrderDetails(ValidHomePage.driver);

	}

	@Test(priority = 9)
	public void prevoiusOrederDetail() throws InterruptedException {

		Home_page.lnk_previousOrders(ValidHomePage.driver);

	}
	
	 @AfterTest
	 public void Close() throws Exception {
//	 ValidHomePage.driver.quit();
	  //To stop video recording.
	 ValidHomePage.recorder.stop();
	 }

	
}