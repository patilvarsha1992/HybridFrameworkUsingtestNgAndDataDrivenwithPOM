package com.qa.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class RegistrationPage extends TestBase {
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstName;
	
	@FindBy(id="last_name")
	WebElement lastName;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement pass;
	
	@FindBy(id="confirm_pass")
	WebElement confirmPass;
	
//	@FindBy(id="submitReg")
//	WebElement submitButton;
	
	//Initializing the Page Objects:
	public RegistrationPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void regitrastion(String fName, String lName, String email1, String password, String confirmPassword){
//		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("vvvv");
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		email.sendKeys(email1);
		pass.sendKeys(password);
		confirmPass.sendKeys(confirmPassword);
//		submitButton.click();
	}
	
}
