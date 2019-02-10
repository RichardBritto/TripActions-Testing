package com.tripActions.test.stepDefLibrary;


import static com.tripActions.test.helperLibrary.testHooksHelper.WEB_DRIVER;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.tripActions.test.pageObjectLibrary.searchFunction;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class searchFunctionStepDefs {

	
	searchFunction appPage = new searchFunction(WEB_DRIVER);
    public static WebDriverWait waitForElement = null;
       
	
    @Given("^User is in Booking website and clicks accomadation Section$")
    public void user_is_in_booking_website_and_clicks_accomadation_Section() throws Throwable {
	
	appPage.clickHotelSection();
}

    @When("^User do the Search function$")
    public void user_do_the_Search_function() throws Throwable {

	appPage.clickAndSearch();
}

    @Then("^User see the search details and verify the details with search$")
    public void user_see_the_search_details_and_verify_the_details_with_search() throws Throwable {
	
    	appPage.verifyLowsestPriceHotel();
}

}

