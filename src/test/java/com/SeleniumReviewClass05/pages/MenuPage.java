package com.SeleniumReviewClass05.pages;

import com.SeleniumReviewClass05.TestBase.BaseClass;
import org.openqa.selenium.WebElement;

public class MenuPage extends BaseClass {
    public WebElement bag= driver.findElementByXPath("//div[text()='Sauce Labs Backpack']");

}
