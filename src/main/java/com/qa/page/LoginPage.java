package com.qa.page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {


	
	//page factory or object repository
	
		@FindBy(id="req1")
		WebElement username;
		
		@FindBy(id="req2")
		WebElement password;
		
//		@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[4]")
//		WebElement loginBtn;
//		
//		@FindBy(xpath="//a[text()='Sign Up']")
//		WebElement signUpBtn;
		
//		@FindBy(xpath="//img[contains(@class,'img-responsive')]")
//		WebElement crmLogo;
	
		//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		
		public HomePage login(String un, String pwd){
			System.out.println("00000");
			username.sendKeys(un);
			System.out.println("11111");
			password.sendKeys(pwd);
			System.out.println("22222");
//		    loginBtn.click();
//			    	JavascriptExecutor js = (JavascriptExecutor)driver;
//			    	js.executeScript("arguments[0].click();", loginBtn);
			    	
			return new HomePage();
		}	


}
