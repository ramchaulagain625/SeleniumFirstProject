package com.SeleniumClass12;

import com.SeleniumClass12.testBase.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class commonMethod extends BaseClass {
    public void clickOnMethod(){

    }
    /*
    *
    * */
    public void sendText(WebElement element,String text){
element.clear();
element.sendKeys(text);
    }


}
