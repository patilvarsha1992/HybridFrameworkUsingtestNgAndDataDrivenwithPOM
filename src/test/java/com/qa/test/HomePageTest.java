package com.qa.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.page.HomePage;
import com.qa.page.LoginPage;
import com.qa.page.RegistrationPage;
import com.qa.page.SearchPage;
import com.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homepage;
	RegistrationPage registrationPage;
	SearchPage searchPage;
	
 @BeforeMethod
	public void setUp() throws IOException{
		initialization();
		homepage= new HomePage();
		loginPage = new LoginPage();
		registrationPage = new RegistrationPage();
		searchPage = new SearchPage();
	}
	
	@Test(priority=1)
	public void verifyLogInlink(){
		loginPage=homepage.logInLink();
	
	}

	@Test(priority=2)
	public void verifyregistrationLink(){
		HomePage homepage = new HomePage();
		registrationPage=homepage.regisitrationLink();
	}
	
	@Test(priority=3)
	public void verifySearchLink(){
		searchPage=homepage.searchLink();
	}
	
	
	@Test(priority=4)
	public void verifyBuypointLink(){
		loginPage=homepage.buyPointTest();
	}
	
	@Test(priority=5)
	public void verifyEarnPointlink(){
		String title= homepage.earnPointTitle();
		Assert.assertEquals(title, "Earn Points | LeadFerret.com");
//		System.out.println(homepage.earnPointTitle());
	}
	
	@Test(priority=6)
	public void verifyLogo(){
		homepage.checkLogo();
		Assert.assertTrue(homepage.checkLogo(), "logo is not present on home page");
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	

}
