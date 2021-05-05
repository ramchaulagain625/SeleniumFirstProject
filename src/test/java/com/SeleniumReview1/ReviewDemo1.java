package com.SeleniumReview1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReviewDemo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        WebElement username=driver.findElementById("user-name");
        username.sendKeys("standard_user");
        WebElement password=driver.findElementById("password");
        password.sendKeys("secret_sauce");
        WebElement login = driver.findElementById("login-button");
        login.click();
        driver.findElementById("add-to-cart-sauce-labs-backpack").click();
        driver.findElementByClassName("shopping_cart_badge").click();
        Thread.sleep(3000);
        driver.navigate().back();
        WebElement menu=driver.findElementById("react-burger-menu-btn");
        menu.click();
        Thread.sleep(3000);
        driver.findElementByLinkText("ABOUT").click();
        String titel =driver.getTitle();
        if(titel.equalsIgnoreCase("Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs")){
            System.out.println("Boom it is right page");
        }else{
            System.out.println("sorry wrong page");
        }
        driver.navigate().back();
        driver.findElementByClassName("shopping_cart_badge").click();
        Thread.sleep(3000);
        driver.findElementByClassName("btn btn_action btn_medium checkout_button").click();
        Thread.sleep(3000);
        driver.findElementById("react-burger-menu-btn").click();
        driver.findElementByPartialLinkText("Log").click();

    }
}
