package com.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.page.HomePage;
import com.qa.page.LoginPage;
import com.qa.page.RegistrationPage;
import com.qa.util.TestUtil;

public class RegistrationPageTest extends TestBase {
	RegistrationPage registartion; 
	HomePage homePage;
	String sheetName = "registrationTestdata";
	
	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		registartion = new RegistrationPage();
		homePage = new HomePage();
		homePage.regisitrationLink();
	}
	

	@DataProvider
	public Object[][] getTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1, dataProvider="getTestData")
	// dataprovide getting data from sheet and sheet has 4 colms that we have to pass four veriable
	public void registrationTest( String firstName, String lastName, String email,String password, String confirmPassword){
//		registartion.regitrastion("sugar","throw","s@gmail.com","pppp","pppp");
		registartion.regitrastion(firstName,lastName,email,password,confirmPassword);
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
