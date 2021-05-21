package com.SeleniumReviewClass05.pages;

import com.SeleniumReviewClass05.TestBase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuWithPageFactory extends BaseClass {

    @FindBy(id="inventory_sidebar_link")
    public WebElement allMenu;
    
}
