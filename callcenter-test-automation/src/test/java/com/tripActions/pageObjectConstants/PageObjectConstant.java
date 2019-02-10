
package com.tripActions.pageObjectConstants;


public interface PageObjectConstant {

	String BROWSER_NAME="chromedriver_2.45";
	String BROWSER_NAME_PROPERTY = "browsername";
	String BROWSER_NAME_CHROME = "chrome";
	String BROWSER_NAME1 = "IE";
	String BROWSER_NAME2= "firefox";
	String SITE_URL = "https://www.booking.com/";
	String SEARCH_KEYWORD = "Los Angeles, California, USA";
	String EMAIL = "brittojebarson@gmail.com";
	String PASSWORD = "123comeandgo";
	String NAME = "Tester";
	String POPUP_CLOSE_BUTTON = ".bicon.bicon-aclose.header-signin-prompt__close";
	String HOTEL_SECTION=".xpb__link.selected";
	String SEARCH_BAR="ss";
	String SEARCH_SUGGESTION_LIST = "//*[@id='frm']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[2]";
	String CHECK_IN_BUTTON="//*[@id='frm']/div[1]/div[2]/div[1]/div[2]/div/div/div/div/button";
	String CHECK_IN_DATE="//*[@id='frm']/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[5]/td[4]";
	String CHECK_OUT_BUTTON="//*[@id='frm']/div[1]/div[2]/div[1]/div[3]/div/div/div/div/button";
	String CHECK_OUT_DATE="//*[@id='frm']/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[7]/td[1]";
	
	String SEARCH_BUTTON=".sb-searchbox__button";
	String CALENDAR_CLOSE_BUTTON=".c2-calendar-close-button-icon";
	String SEARCH_RESULT_LOWESTPRICE_TAB="//*[@id='sort_by']/ul/li[2]/a";
	String SEARCH_RESULT_FIRSTLOWPRICE="//*[@id='hotellist_inner']/div[1]/div[2]/div[2]/div/table/tbody/tr/td[2]/div/strong/b";
	String SEARCH_RESULT_SECONDLOWPRICE="//*[@id='hotellist_inner']/div[2]/div[2]/div[2]/div/table/tbody/tr/td[2]/div/strong/b";
	String REGISTER_BUTTON="current_account_create";
	String REGISTER_EMAIL_BUTTON="login_name_register";
	String REGISTER_EMAIL_BUTTON1="username";
	String REGISTER_GETSTARTED_NEXT_BUTTON=".bui-button__text";
	String REGISTER_PASSWORD_BUTTON="password";
	String REGISTER_BACK_BUTTON=".bk-icon.-iconset-navarrow_left";
	String REGISTER_CONFIRM_PASSWORD_BUTTON="confirmed_password";
	String ERROR_MESSAGE="username-error";
	String ERROR_MESSAGE_TEXT="It looks like there is no account associated with this email address. You can ";
	String SIGNUP_SIGNIN_BUTTON="//*[@id='root']/div/div/div/div[2]/div[1]/div/div/div/div/a";
	String SIGNIN_EMAIL_BUTTON = "username";
	String SIGNIN_TAB = "//*[@id='b2indexPage']/div[24]/div[1]/div/div[1]/div[1]";
	String SIGNIN_TAB_PASSWORD = "password";
	String SIGNIN_TAB_BUTTON = "//*[@id='b2indexPage']/div[24]/div[1]/div/div[2]/form[1]/input[10]";
	String POPUP_ERRORMESSAGE = ".alert.alert-error.alert-displayed";
	String POPUP_ERRORMESSAGE_TEXT = "You entered an email address/password combination that doesn't match.";
	String LOGO_REGISTERPAGE = "//*[@id='root']/div/div/div/div[1]/div[1]/span/a/svg";

}
