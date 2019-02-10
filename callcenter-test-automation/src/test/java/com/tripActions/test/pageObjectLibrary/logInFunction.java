package com.tripActions.test.pageObjectLibrary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

//import static com.tillster.test.mca.mobile.helperLibrary.testHooksHelper.WEB_DRIVER_WAIT;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tripActions.pageObjectConstants.PageObjectConstant;

import cucumber.api.DataTable;
import gherkin.formatter.model.DataTableRow;


public class logInFunction extends basePage implements PageObjectConstant {
	
	@FindBy(how = How.XPATH, using = "//div[@id='spinnerDiv']")
 	private WebElement pageLoader;
	
	public logInFunction(WebDriver driver) {
		
		super(driver);
	}

	
	@FindBy(how = How.ID, using = REGISTER_BUTTON)
	public WebElement registerButton;
	
	@FindBy(how = How.XPATH, using = LOGO_REGISTERPAGE)
	public WebElement logoRegisterPage;
	
	@FindBy(how = How.ID, using = REGISTER_EMAIL_BUTTON)
	public WebElement registerEmailButton;
	
	@FindBy(how = How.ID, using = REGISTER_EMAIL_BUTTON1)
	public WebElement registerEmailButton1;
	
	@FindBy(how = How.CSS, using = REGISTER_GETSTARTED_NEXT_BUTTON)
	public WebElement registerGetStartedNextButton;
	
	@FindBy(how = How.ID, using = REGISTER_PASSWORD_BUTTON)
	public WebElement registerPasswordButton;
	
	@FindBy(how = How.ID, using = REGISTER_CONFIRM_PASSWORD_BUTTON)
	public WebElement registerConfirmPasswordButton;
	
	@FindBy(how = How.CSS, using = REGISTER_BACK_BUTTON)
	public WebElement registerBackButton;
	
	@FindBy(how = How.XPATH, using = SIGNUP_SIGNIN_BUTTON)
	public WebElement signUpSignInButton;
	
	@FindBy(how = How.ID, using = SIGNIN_EMAIL_BUTTON)
	public WebElement signInEmailButton;
	
	@FindBy(how = How.ID, using = ERROR_MESSAGE)
	public WebElement errorMessage;
	
	@FindBy(how = How.XPATH, using = SIGNIN_TAB)
	public WebElement signInTab;
	
	@FindBy(how = How.NAME, using = SIGNIN_TAB_PASSWORD)
	public WebElement signInTabPassword;
	
	@FindBy(how = How.XPATH, using = SIGNIN_TAB_BUTTON)
	public WebElement signInTabButton;
	
	@FindBy(how = How.CSS, using = POPUP_ERRORMESSAGE)
	public WebElement popUpErrorMessage;
	
	
	
	
	public void scroll()throws Exception{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
	}
	
	public void clickLogInButton()throws Exception{
		Thread.sleep(2000);
		popUpCloseButton.click();
		registerButton.click();
		Thread.sleep(5000);
		if(registerEmailButton.isDisplayed()){
			registerEmailButton.click();
			registerEmailButton.sendKeys(EMAIL);
			registerGetStartedNextButton.click();
			Thread.sleep(2000);
			registerPasswordButton.click();
			registerPasswordButton.sendKeys(PASSWORD);
			registerConfirmPasswordButton.click();
			registerConfirmPasswordButton.sendKeys(PASSWORD);
			registerBackButton.click();
			
		}else{
			registerEmailButton1.click();
			registerEmailButton1.sendKeys(EMAIL);
			registerPasswordButton.click();
			registerPasswordButton.sendKeys(PASSWORD);
		}
		
		
	}
	
	public void sendKeysEmailAndPassword()throws Exception{
		if(signUpSignInButton.isDisplayed()){
		signUpSignInButton.click();
		Thread.sleep(2000);
		registerGetStartedNextButton.click();
		}else{
			signInTab.click();
			registerEmailButton1.click();
			registerEmailButton1.sendKeys(EMAIL);
			signInTabPassword.click();
			signInTabPassword.sendKeys(PASSWORD);
			signInTabButton.click();
		}
		
	}
	
	public void verifyErrorMessage()throws Exception{
		if(errorMessage.isDisplayed()){
		String error = errorMessage.getText();
		System.out.println(error);
		assertTrue(ERROR_MESSAGE_TEXT, error.contains(ERROR_MESSAGE_TEXT));
	}else{
		String error = popUpErrorMessage.getText();
		System.out.println(error);
		assertTrue(POPUP_ERRORMESSAGE_TEXT, error.contains(POPUP_ERRORMESSAGE_TEXT));
		}
	}
}
