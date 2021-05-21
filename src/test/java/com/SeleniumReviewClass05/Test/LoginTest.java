package com.SeleniumReviewClass05.Test;

import com.SeleniumReviewClass05.TestBase.BaseClass;
import com.SeleniumReviewClass05.pages.LoginPage;
import com.SeleniumReviewClass05.pages.MenuPage;
import com.SeleniumReviewClass05.pages.MenuWithPageFactory;

public class LoginTest {
    public static void main(String[] args) {
        BaseClass.setUpWithSpecificUrl("https://www.saucedemo.com/");
        LoginPage login= new LoginPage();
        login.userName.sendKeys("standard_user");
        login.password.sendKeys("secret_sauce");
        login.loginBtn.click();
        MenuPage menu=new MenuPage();
        menu.bag.click();
        MenuWithPageFactory muf= new MenuWithPageFactory();
        muf.allMenu.click();
    }
}
