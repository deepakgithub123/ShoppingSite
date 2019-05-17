package registrationTesting;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.text.SimpleDateFormat;

import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.NoSuchElementException;

public class Home_page {
	private static WebElement element = null;

	public static String price;
	public static float tax;

	public static String subTotalAmount;
	public static String taxInViewCart;
	public static String totalAmount;

	// product detail in Pending Orders List
	public static String buyerName;
	public static String totalAmount1;
	public static String grantTotal;

	// Products in Pending Order Details page
	public static String subTotal;
	public static String taxx;
	public static String gTotal;

	public static float foo;
	public static float roundOfA;
	public static String realValue1;

	public static String realValue;
	public static float foo1;
	public static float roundOfB;

	static String homeUrl;

	public static String validateHomeage(WebDriver driver) {

		homeUrl = driver.getCurrentUrl();
		return homeUrl;
	}

	public static void lnk_LogOut(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		// return element;

	}

	public static void lnk_Cancel(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);

		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element1);
		// return element;

		// *[@id="exampleModal"]/div/div/div[3]/button

	}

	public static void lnk_Categories(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);

		// Click on Categories link
		driver.findElement(By.xpath("//*[@id=\"exampleAccordion\"]/li[2]/a/span")).click();

		// Check validation
		driver.findElement(By.xpath("//*[@id=\"searchResult\"]")).click();

		Thread.sleep(2000);

		// String uuid = UUID.randomUUID().toString();

		// Add new category
		WebElement testCatog = driver.findElement(By.name("categoriesBean.bookCategoryName"));
		// testCatog.sendKeys(uuid);

		testCatog.sendKeys("TestCategory");

		Thread.sleep(2000);

		// Choose Parent Category
		WebElement catogParent = driver.findElement(By.name("categoriesBean2.parentCategoryName"));
		catogParent.sendKeys("None");

		Thread.sleep(2000);

		// Click on submit button
		driver.findElement(By.xpath("//*[@id=\"searchResult\"]")).click();

		Thread.sleep(4000);

		WebElement table = driver.findElement(By.xpath("//table[@class='table table-bordered']"));
		List<WebElement> row = table.findElements(By.tagName("tbody"));
		// System.out.println("Total Number of Rows = " + row.size());

		int totalRows = row.size();

		// Click on edit botton of TestCategory
		driver.findElement(By.xpath("//*[@id='page-top']/div[1]/div/div/div[2]/div/div[2]/div/table/tbody[" + totalRows
				+ "]/tr/td[3]/a[1]")).click();

		Thread.sleep(4000);

		String catEdit = UUID.randomUUID().toString();

		// Clear EditCateory
		driver.findElement(By.name("categoriesBean.bookCategoryName")).clear();

		Thread.sleep(2000);

		// Edit new category
		WebElement editCatog = driver.findElement(By.xpath("//*[@id='editOrUpdateCategory']/div[1]/div/input"));
		editCatog.sendKeys(catEdit);

		Thread.sleep(2000);

		// editCatog.sendKeys("BB");

		// driver.findElement(By.name("categoriesBean.bookCategoryName")).sendKeys(combine);

		// Description update
		driver.findElement(By.name("categoriesBean.categoryDescription")).sendKeys("Test Description");

		Thread.sleep(2000);

		// Click on update button
		driver.findElement(By.name("searchResult")).click();

		// Click on delete button of last category
		// driver.findElement(By.xpath("//*[@id='page-top']/div[1]/div/div/div[2]/div/div[2]/div/table/tbody["+totalRows+"]/tr/td[3]/a[2]")).click();

		Thread.sleep(4000);

		// WebElement deleteButtonClick =
		// driver.findElement(By.xpath("//*[@id=\"myModal1\"]/div/div/div[3]/button[1]"));
		// ((JavascriptExecutor) driver).executeScript("arguments[0].click()",
		// deleteButtonClick);

		// WebElement editrowValue = driver.findElement(By.xpath("//table[@class='table
		// table-bordered']//following-sibling::tbody["+totalRows+"]//following-sibling::tr//following-sibling::td//following-sibling::td//following-sibling::td//following-sibling::a"));
		// editrowValue.click();

		// for(int j=1;j<=row.size();j++)
		// {

		// WebElement table1 = driver.findElement(By.xpath("//table[@class='table
		// table-bordered']//following-sibling::tbody["+j+"]//following-sibling::tr"));

		// WebElement table1 = driver.findElement(By.xpath("//table[@class='table
		// table-bordered']//following-sibling::tbody["+j+"]"));

		// List<WebElement> row1 = table.findElements(By.tagName("td"));

		// List<WebElement> row1 = table1.findElements(By.tagName("td"));

		// System.out.println("Total Number of Rows size = " + row.size());

		// String total = driver.findElement(By.xpath("//table[@class='table
		// table-bordered']//following-sibling::tbody["+j+"]//following-sibling::tr//following-sibling::td")).getText();

		// following-sibling::td["+j+"]")).getText();

		// System.out.println("TOTAL" + total);

		// }

		/*
		 * //To locate rows of table. List < WebElement > rows_table =
		 * table.findElements(By.tagName("tr"));
		 * 
		 * //To calculate no of rows In table. int rows_count = rows_table.size();
		 * 
		 * //Loop will execute till the last row of table. for (int row2 = 0; row2 <
		 * rows_count; row2++) {
		 * 
		 * 
		 * //To locate columns(cells) of that specific row. List < WebElement >
		 * Columns_row = rows_table.get(row2).findElements(By.tagName("td"));
		 * 
		 * 
		 * // List < WebElement > Columns_row111 =
		 * rows_table.findElements(By.tagName("td")).get(row2)
		 * 
		 * //To calculate no of columns (cells). In that specific row. int columns_count
		 * = Columns_row.lastIndexOf(Columns_row);
		 * 
		 * System.out.println("COLUMN"+ columns_count);
		 * 
		 * System.out.println("Number of cells In Row " + row2 + " are " +
		 * columns_count);
		 * 
		 * 
		 * //Loop will execute till the last cell of that specific row. // for (int
		 * column = 0; column < columns_count; column++) {
		 * 
		 * // To retrieve text from that specific cell. // String celtext =
		 * Columns_row.get(column).getText();
		 * 
		 * // String celtext = Columns_row.
		 * 
		 * 
		 * // String cat[][]= "TestCategory";
		 * 
		 * // String aa[row2][column]=
		 * 
		 * // String cat[][]= "TestCategory";
		 * 
		 * // if(celtext==cat) // { // System.out.println("Hello"); //To edit the value
		 * of cell of that specific row. // }
		 * 
		 * 
		 * 
		 * // System.out.println("Cell Value of row number " + row2 +
		 * " and column number " + column + " Is " + celtext);
		 * 
		 * 
		 * // } //
		 * System.out.println("-------------------------------------------------- "); //
		 * }
		 * 
		 * }
		 */

		// WebElement table1 = driver.findElement(By.xpath("//table[@class='table
		// table-bordered']//following-sibling::tbody"));
		// List<WebElement> row1 = table.findElements(By.tagName("tr"));
		// System.out.println("Total Number of Rows = " + row1.size());

		// WebElement table1 = driver.findElement(By.xpath("//table[@class='table
		// table-bordered'][@]"));

		// List<WebElement> row1 = table.findElements(By.tagName("tr"));
		// System.out.println("Total Number of Rows = " + row1.size());

		// *[@id="page-top"]/div[2]/div/div/div[2]/div/div[2]/div/table/tbody[20]/tr/td[1]

		// System.out.println("Total Number of Rows Nme = " +
		// row.get(row.size()).getText());

		// System.out.println(row.get(i).getText());

		// System.out.println("Total Number of Rows = " + row.size());

		// Column Count in WebTable
		// List<WebElement> column = row.get(10).findElements(By.tagName("td"));
		// System.out.println("Total Number of Column = " + column.size());

		// if (cellText== "TestCategory")
		// {

		// System.out.println("Cat name same");

		// }

	}

	public static void lnk_Buyers(WebDriver driver) throws InterruptedException {

		// Thread.sleep(2000);

		driver.findElement(By.linkText("Buyers")).click();

		String addRandomBuyer = UUID.randomUUID().toString();

		// Click on Add New Buyer button
		driver.findElement(By.xpath("//*[@id=\"buyers\"]/div[2]/div[3]/div/a")).click();

		// Check the validation
		driver.findElement(By.name("searchResult")).click();

		Thread.sleep(2000);

		// Fill first name
		driver.findElement(By.name("buyers.firstName")).sendKeys(addRandomBuyer);

		Thread.sleep(2000);

		// Fill last name
		driver.findElement(By.name("buyers.lastName")).sendKeys(addRandomBuyer);

		Thread.sleep(2000);

		// Fill Email
		driver.findElement(By.name("buyers.email")).sendKeys("deepak@gmail.com");

		Thread.sleep(2000);

		// Fill phone
		driver.findElement(By.name("buyers.phone")).sendKeys("8557847992");

		Thread.sleep(2000);

		// Fill billing address
		driver.findElement(By.name("buyers.billingAddress")).sendKeys("H. N. 343");

		Thread.sleep(2000);

		// Fill city
		driver.findElement(By.name("buyers.billingCity")).sendKeys("Mohali");

		Thread.sleep(2000);

		// Fill postalCode
		driver.findElement(By.name("buyers.billingPostalCode")).sendKeys("160062");

		Thread.sleep(2000);

		// Same as Billing Address

		driver.findElement(By.id("sameasbilling")).click();

		Thread.sleep(2000);

		// Click on submit button
		driver.findElement(By.name("searchResult")).click();

		Thread.sleep(2000);

		// Count the total buyers
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-bordered']"));
		List<WebElement> row = table.findElements(By.tagName("tbody"));
		// System.out.println("Total Number of Rows = " + row.size());

		Thread.sleep(3000);

		// Delete last added buyer
		driver.findElement(By.xpath("//*[@id='dataTable']/tbody[" + row.size() + "]/tr/td[7]/a[2]/i")).click();

		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath("//*[@id='myModal1']/div/div/div[3]/button[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);

		Thread.sleep(4000);

		/****************** //Again add the new buyer *************************/

		// Click on Add New Buyer button
		driver.findElement(By.xpath("//*[@id=\"buyers\"]/div[2]/div[3]/div/a")).click();

		Thread.sleep(2000);

		// Fill first name
		driver.findElement(By.name("buyers.firstName")).sendKeys("Deepak");

		Thread.sleep(2000);

		// Fill last name
		driver.findElement(By.name("buyers.lastName")).sendKeys("Chamoli");

		Thread.sleep(2000);

		// Fill Email
		driver.findElement(By.name("buyers.email")).sendKeys("deepak@gmail.com");

		Thread.sleep(2000);

		// Fill phone
		driver.findElement(By.name("buyers.phone")).sendKeys("8555654367");

		Thread.sleep(2000);

		// Fill billing address
		driver.findElement(By.name("buyers.billingAddress")).sendKeys("H. N. 344");

		Thread.sleep(2000);

		// Fill city
		driver.findElement(By.name("buyers.billingCity")).sendKeys("Punjab");

		Thread.sleep(2000);

		// Fill postalCode
		driver.findElement(By.name("buyers.billingPostalCode")).sendKeys("160055");

		Thread.sleep(2000);
		// Same as Billing Address

		driver.findElement(By.id("sameasbilling")).click();

		Thread.sleep(2000);

		// Click on submit button
		driver.findElement(By.name("searchResult")).click();

		// Count the latest buyers
		WebElement table1 = driver.findElement(By.xpath("//table[@class='table table-bordered']"));
		List<WebElement> row1 = table1.findElements(By.tagName("tbody"));
		// System.out.println("Total Number of Rows1 = " + row1.size());

		// Clicking on Edit icon
		driver.findElement(By.xpath("//*[@id='dataTable']/tbody[" + row1.size() + "]/tr/td[7]/a[1]/i")).click();

		Thread.sleep(2000);

		String editRandomfirstname = UUID.randomUUID().toString();

		// Clear first name
		driver.findElement(By.name("buyers.firstName")).clear();

		Thread.sleep(2000);

		// Edit first name
		driver.findElement(By.name("buyers.firstName")).sendKeys(editRandomfirstname);

		Thread.sleep(2000);

		// Clear last name
		driver.findElement(By.name("buyers.lastName")).clear();

		String editRandomlastname = UUID.randomUUID().toString();

		// Edit last name
		driver.findElement(By.name("buyers.lastName")).sendKeys(editRandomlastname);

		Thread.sleep(2000);

		// Clear email
		driver.findElement(By.name("buyers.email")).clear();

		Thread.sleep(2000);

		// Edit Email
		driver.findElement(By.name("buyers.email")).sendKeys("test@gmail.com");

		Thread.sleep(2000);

		Select stateSelect = new Select(driver.findElement(By.name("buyers.billingState")));
		stateSelect.selectByValue("Chandigarh");

		Thread.sleep(2000);

		Select stateCountry = new Select(driver.findElement(By.name("buyers.billingCountry")));
		stateCountry.selectByValue("India");

		// Click on submit button
		driver.findElement(By.name("searchResult")).click();

		Thread.sleep(4000);

		// Search buyer by first name
		driver.findElement(By.name("buyers.firstName")).sendKeys("Deepak");

		Thread.sleep(1000);

		// Click on search button
		driver.findElement(By.xpath("//*[@id='searchResult']")).click();

		Thread.sleep(1000);

		// Click on Show All
		driver.findElement(By.xpath("//*[@id='buyers']/div[2]/div[2]/div/a")).click();

	}

	public static void lnk_Products(WebDriver driver) throws InterruptedException {

		// Click on Products link
		driver.findElement(By.xpath("//*[@id=\"exampleAccordion\"]/li[3]/a/span")).click();

		// Click on Add new Products
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/div/div[1]/div[2]/div/a[2]")).click();

		// Click on Add button for check the validation
		driver.findElement(By.name("searchResult")).click();

		// Add new products detail
		Select productCategory = new Select(driver.findElement(By.name("productsBean.productCategory")));
		productCategory.selectByValue("BB");

		Thread.sleep(2000);

		String randomProduct = UUID.randomUUID().toString();

		// title
		driver.findElement(By.name("productsBean.productTitle")).sendKeys(randomProduct);

		Thread.sleep(2000);

		// description
		driver.findElement(By.name("productsBean.productDescription")).sendKeys("This is the test product");

		Thread.sleep(2000);

		// Product price
		driver.findElement(By.name("productsBean.productActualPrice")).clear();
		driver.findElement(By.name("productsBean.productActualPrice")).sendKeys("10");

		Thread.sleep(2000);

		// Tax
		driver.findElement(By.name("productsBean.tax")).clear();
		driver.findElement(By.name("productsBean.tax")).sendKeys(".10");

		Thread.sleep(2000);

		// Stock available
		driver.findElement(By.name("productsBean.stock")).clear();
		driver.findElement(By.name("productsBean.stock")).sendKeys("100");

		Thread.sleep(2000);

		// Click on Add button
		driver.findElement(By.name("searchResult")).click();
		
		Thread.sleep(4000);
	}

	public static void search_Products(WebDriver driver) throws InterruptedException {

		// Select category name for search product
		Select productCategory = new Select(driver.findElement(By.name("productsBean.bookCategoryName")));
		productCategory.selectByValue("Dairy");

		Thread.sleep(3000);

		// Click on Search button
		driver.findElement(By.name("searchResult")).click();

		Thread.sleep(4000);
		// Click on Show All search button
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/div/div[1]/div[2]/div/a[1]")).click();

	}

	public static void lnk_addtoCart(WebDriver driver) throws InterruptedException {

		// Click on Products link
		driver.findElement(By.xpath("//*[@id=\"exampleAccordion\"]/li[3]/a/span")).click();

		// Click on first add to cart button
		driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[1]/td[8]")).click();

		// Click on second add to cart button
		driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[2]/td[8]")).click();

		// Click on second add to cart button
		// driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[3]/td[8]")).click();

		// Get the product price
		price = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[1]/td[5]")).getText();
		// System.out.println("Product Price:"+price);

		// Get the tax percentage of product
		String tax = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[1]/td[6]")).getText();
		// System.out.println("Tax:"+tax);

	}

	public static void lnk_viewCart(WebDriver driver) throws InterruptedException {
		// Click on View Cart link
		driver.findElement(By.xpath("//*[@id=\"exampleAccordion\"]/li[4]/a/span")).click();

		Thread.sleep(4000);

		// Select buyer in Cart Details
		// Select productBuyer = new
		// Select(driver.findElement(By.xpath("//*[@id='saveDataToPending']/select")));
		// productBuyer.selectByValue("Deepak Chamoli");

		/*
		 * System.out.println("Product Price in View cart:"+price);
		 * System.out.println("Tax in View cart:"+tax); System.out.println("Tax:"+tax);
		 */

		//////////////////////////////////////
		// Detail in BELOW of page

		/*
		 * subTotalAmount =
		 * driver.findElement(By.xpath("//*[@id=\"subtotal\"]")).getText();
		 * System.out.println("Sub Total Amount:"+subTotalAmount);
		 * 
		 * taxInViewCart = driver.findElement(By.xpath("//*[@id=\"tax\"]")).getText();
		 * System.out.println("Tax In View Cart:"+taxInViewCart);
		 * 
		 * totalAmount
		 * =driver.findElement(By.xpath("//*[@id=\"totalamount\"]")).getText();
		 * System.out.println("Total Amount:"+totalAmount);
		 * 
		 * //
		 * System.out.println("SubTotal Amount || Tax || Total Amount in VIEW CART: :"
		 * +tax);
		 */

		Select drpCountry = new Select(driver.findElement(By.xpath("//*[@id='saveDataToPending']/select")));
		drpCountry.selectByVisibleText("Deepak Chamoli");

		// Click on Save button
		driver.findElement(By.xpath("//*[@id=\"saveDataToPending_0\"]")).click();

	}

	public static void lnk_pendingOrderLict(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);

		// Thread.sleep(4000);

		// System.out.println("In Pending Order:: Sub Total Amount:"+subTotalAmount);
		// System.out.println("In Pending Order:: Tax In View Cart:"+taxInViewCart);
		// System.out.println("In Pending Order:: Total Amount:"+totalAmount);

		// Thread.sleep(4000);
		/////////////////////////////////////////////////////////////
		// Original detail in Pending Orders List Page

		buyerName = driver.findElement(By.xpath("//*[@id=\"dataTable\"]/tbody[1]/tr/td[2]")).getText();
		// System.out.println("Original detail in Pending Orders List Page:: Buyer name
		// :"+buyerName);

		totalAmount1 = driver.findElement(By.xpath("//*[@id=\"dataTable\"]/tbody[1]/tr/td[3]")).getText();
		// System.out.println("($)Total Amount:"+totalAmount1);

		grantTotal = driver.findElement(By.xpath("//*[@id=\"dataTable\"]/tbody[2]/tr/td[5]")).getText();
		// System.out.println("Grant Total:"+grantTotal);

		Thread.sleep(2000);

		// Click on view first pending order detail in Action field
		driver.findElement(By.xpath("//*[@id=\"dataTable\"]/tbody[1]/tr/td[5]/a/i")).click();

		Thread.sleep(4000);

		// System.out.println("Total Amount:"+totalAmount);

	}

	public static void lnk_pendingOrderDetails(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);

		// SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		// Date date = new Date();
		// System.out.println(formatter.format(date));

		// driver.findElement(By.xpath("//*[@id=\'datepicker\']")).sendKeys(formatter.format(date));

		// Original Detail Pending order detail for Deepak Chamoli
		/*
		 * String productPrice =driver.findElement(By.xpath(
		 * "//*[@id=\"page-top\"]/div[1]/div[1]/div/div[2]/div/table[1]/tbody[1]/tr/td[4]"
		 * )).getText(); System.out.
		 * println("Original Detail Pending order detail for Deepak Chamoli:: ($)Product Price:"
		 * +productPrice);
		 * 
		 * 
		 * String tax1 =driver.findElement(By.xpath(
		 * "//*[@id=\"page-top\"]/div[1]/div[1]/div/div[2]/div/table[1]/tbody[1]/tr/td[6]"
		 * )).getText(); System.out.
		 * println("Original Detail Pending order detail for Deepak Chamoli:: Tax(%):"
		 * +tax1);
		 * 
		 * String orderSubTotal =driver.findElement(By.xpath(
		 * "//*[@id=\"page-top\"]/div[1]/div[1]/div/div[2]/div/table[1]/tbody[1]/tr/td[7]"
		 * )).getText(); System.out.
		 * println("Original Detail Pending order detail for Deepak Chamoli:: ($)Order SubTotal:"
		 * +orderSubTotal);
		 * 
		 */

		// Count the total rows
		WebElement table1 = driver.findElement(By.xpath("//table[@class='table table-bordered']"));
		List<WebElement> row1 = table1.findElements(By.tagName("tbody"));
		// System.out.println("Total Number of Rows1 = " + row1.size());

		int getRowItem = row1.size() - 1;

		Thread.sleep(4000);

		// Below detail
		subTotal = driver.findElement(By.xpath(
				"//*[@id=\"page-top\"]/div[1]/div[1]/div/div[2]/div/table[1]/tbody[" + getRowItem + "]/tr[1]/td[7]"))
				.getText();

		taxx = driver.findElement(By.xpath(
				"//*[@id=\"page-top\"]/div[1]/div[1]/div/div[2]/div/table[1]/tbody[\"+getRowItem+\"]/tr[2]/td[7]"))
				.getText();

		realValue1 = grantTotal.substring(1);

		foo = Float.parseFloat(realValue1);

		roundOfA = Math.round(foo);

		gTotal = driver.findElement(By.xpath(
				"//*[@id=\"page-top\"]/div[1]/div[1]/div/div[2]/div/table[1]/tbody[\"+getRowItem+\"]/tr[3]/td[7]"))
				.getText();
		// System.out.println("Original Detail Pending order detail for Deepak Chamoli::
		// Below detail:: Grand Total::"+gTotal);

		Thread.sleep(2000);

		realValue = gTotal.substring(1);

		foo1 = Float.parseFloat(realValue);
		roundOfB = Math.round(foo1);

		// Click on search button
		// driver.findElement(By.xpath("//*[@id=\'date_0\']")).click();

		// Click on Generate Invoice button
		 driver.findElement(By.xpath("//*[@id=\'generateInvoice_0\']")).click();

		// Date date=java.util.Calendar.getInstance().getTime();
		// System.out.println(date);

		// Click on Pending orders link in left side menu bar
		// driver.findElement(By.xpath("//*[@id=\"exampleAccordion\"]/li[5]/a/span")).click();

		// Thread.sleep(4000);

		// Click on view second pending order detail in Action field
		// driver.findElement(By.xpath("//*[@id=\"dataTable\"]/tbody[1]/tr/td[5]/a/i")).click();
		//

		// Thread.sleep(2000);
		/*
		 * String downloadFilepath =
		 * "D:\\Sumit_Backup\\Automation\\Workspace\\ShoppingStore"; HashMap<String,
		 * Object> chromePrefs = new HashMap<String, Object>();
		 * chromePrefs.put("profile.default_content_settings.popups", 0);
		 * chromePrefs.put("download.default_directory", downloadFilepath);
		 * ChromeOptions options = new ChromeOptions();
		 * options.setExperimentalOption("prefs", chromePrefs); WebDriver driver1 = new
		 * ChromeDriver(options);
		 */
	}

	public static void OrderDetailsConfirmationPage(WebDriver driver) throws InterruptedException {

		if (roundOfA == roundOfB) {
			System.out.println("SUCESS");

		}

	}

	public static void lnk_previousOrders(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"exampleAccordion\"]/li[6]/a/span")).click();
		
		Thread.sleep(6000);

		// Click on Previous Order details
		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[1]/td[5]/a")).click();
		
	}

}
