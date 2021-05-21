package com.SeleniumReviewClass05.pages;

import com.SeleniumReviewClass05.TestBase.BaseClass;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {
public WebElement userName=driver.findElementById("user-name");
public WebElement password=driver.findElementById("password");
public WebElement loginBtn =driver.findElementById("login-button");
}
