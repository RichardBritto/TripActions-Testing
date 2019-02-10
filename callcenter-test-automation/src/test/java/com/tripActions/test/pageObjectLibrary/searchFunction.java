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

import com.tripActions.pageObjectConstants.PageObjectConstant;

import cucumber.api.DataTable;
import gherkin.formatter.model.DataTableRow;


public class searchFunction extends basePage implements PageObjectConstant {
	
	public static WebDriver WEB_DRIVER;
	public searchFunction(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(how = How.CSS, using = HOTEL_SECTION)
	public WebElement hotelSection;
	
	@FindBy(how = How.ID, using = SEARCH_BAR)
	public WebElement searchBar;
	
	@FindBy(how = How.XPATH, using = SEARCH_SUGGESTION_LIST)
	public WebElement searchSuggestionList;
	
	@FindBy(how = How.CSS, using = SEARCH_BUTTON)
	public WebElement searchButton;
	
	@FindBy(how = How.XPATH, using = CHECK_IN_BUTTON)
	public WebElement checkInButton;
	
	@FindBy(how = How.XPATH, using = CHECK_IN_DATE)
	public WebElement checkInDate;
	
	@FindBy(how = How.XPATH, using = CHECK_OUT_DATE)
	public WebElement checkOutDate;
	
	@FindBy(how = How.XPATH, using = SEARCH_RESULT_LOWESTPRICE_TAB)
	public WebElement searchResultLowestPriceTab;
	
	@FindBy(how = How.XPATH, using = SEARCH_RESULT_FIRSTLOWPRICE)
	public WebElement searchResultFirstLowestPrice;
	
	@FindBy(how = How.XPATH, using = SEARCH_RESULT_SECONDLOWPRICE)
	public WebElement searchResultSecondLowestPrice;
	
	public void scroll()throws Exception{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
	}
	
	public void clickHotelSection() throws Exception{
		Thread.sleep(5000);
		popUpCloseButton.click();
		hotelSection.click();
	}
		
	public void clickAndSearch() throws Exception{
		searchBar.click();
		searchBar.sendKeys(SEARCH_KEYWORD);
		Thread.sleep(2000);
		searchSuggestionList.click();
		scroll();
		checkInDate.click();
		checkOutDate.click();
		searchButton.click();
		
	}
	
	public void verifyLowsestPriceHotel() throws Exception{
		Thread.sleep(5000);
		searchResultLowestPriceTab.click();
		Thread.sleep(5000);
		String searchResultLP1 = searchResultFirstLowestPrice.getText();
		System.out.println(searchResultLP1);
		scroll();
		String searchResultLP2 = searchResultSecondLowestPrice.getText();
		System.out.println(searchResultLP2);
		assertFalse(searchResultLP1 == searchResultLP2);
		
	}
	
}
