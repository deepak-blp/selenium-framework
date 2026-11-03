package test;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	public void testValidLogin() {
		
		LoginPage loginPage = new LoginPage(driver); 
		loginPage.enterUsername("standard_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickLogin();
		System.out.println("Title is : "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
	}

}
