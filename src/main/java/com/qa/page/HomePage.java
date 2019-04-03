package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.test.LoginPageTest;
import com.qa.test.RegistrationPageTest;
import com.qa.test.SearchPageTest;

public class HomePage extends TestBase {
	
	//page factory or object repository
	@FindBy(id="navbarSigninButton")
	@CacheLookup //this improve performance of script by taking elements from cache. 
	//note;- use only when element which not going to change in future. other wise every time refresh the page and element is changing then get steal element exception
	 WebElement loginLink;
	
	@FindBy(id="navbarSignupButton")
	 WebElement registrationLink;
	
	@FindBy(xpath="//a[text()='Search']")
	 WebElement searchLink;
	
	@FindBy(xpath="//a[text()='Buy Points']")
	 WebElement buyPointTitle;

	@FindBy(xpath="//a[text()='Earn Points']")
	 WebElement earnPointTitle;
	
	@FindBy(id="logo-image")
	 WebElement checkLogo;
	
	//Initializing the Page Objects:
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
			
    //Actions:
	public LoginPage logInLink(){
		loginLink.click();
		return new LoginPage();
		
	}
	
	public RegistrationPage regisitrationLink(){
		registrationLink.click();
		return new RegistrationPage();
		
	}
	
	public SearchPage searchLink(){
		
		driver.findElement(By.linkText("Search")).click();
		searchLink.click();
		return new SearchPage();
		
	}
	public LoginPage buyPointTest(){
		buyPointTitle.click();
		return new LoginPage();
		
	}
	
	public String earnPointTitle(){
		earnPointTitle.click();
		return driver.getTitle();
		
	}
	
	public boolean checkLogo(){
		return checkLogo.isDisplayed();
		 
		
	}
	
	
}
