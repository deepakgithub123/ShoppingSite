package TestMethods;

import org.testng.annotations.Test;

import registrationTesting.Home_page;

import TestMethods.ValidHomePage;

public class Products {

	@Test(priority = 4)
	public void productsPage() throws InterruptedException {
		Home_page.lnk_Products(ValidHomePage.driver);

	}

	// Search Products
	@Test(priority = 5)
	public void searchproducts() throws InterruptedException {
		Home_page.search_Products(ValidHomePage.driver);

	}

	// Products Add and View test case
	@Test(priority = 6)
	public void AddToCartPage() throws InterruptedException {

		// Click on Add to Cart button
		Home_page.lnk_addtoCart(ValidHomePage.driver);

		Home_page.lnk_viewCart(ValidHomePage.driver);

	}
}
