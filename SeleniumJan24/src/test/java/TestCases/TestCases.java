package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.cartPage;
import Pages.checkoutPage;
import Pages.completePage;
import Pages.infoPage;
import Pages.loginPage;
import Pages.productDetailsPage;
import Pages.productsPage;

public class TestCases extends BaseTest{

	@Test
	public void Purchase() {
		new loginPage(driver).enterUsername("standard_user");
		new loginPage(driver).enterPassword("secret_sauce");
		new loginPage(driver).clickLogin();
		new productsPage(driver).clickBackPack();
		new productDetailsPage(driver).clickAddToCart();
		String price = new productDetailsPage(driver).getPrice();
		Assert.assertEquals(price, "$29.99");
		new productDetailsPage(driver).clickShoppingCart();
		new cartPage(driver).clickCheckout();
		new infoPage(driver).enterDetails("Ahalya", "Prashant", "432423");
		new checkoutPage(driver).clickFinish();
		String actual = new completePage(driver).getHeader();
		Assert.assertEquals(actual, "Thank you for your order!");
	}
	
	@Test
	public void invalidLogin() {
		new loginPage(driver).enterUsername("standard_TTTT");
		new loginPage(driver).enterPassword("secret_sauce");
		new loginPage(driver).clickLogin();
	}


}
