package com.seleniumClass5.hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class firstHw {
    public static String url="https://www.facebook.com";
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement signUP=driver.findElementByLinkText("Create New Account");
        signUP.click();
       driver.findElementById("Month");
     /*   Select select= new Select();
        select.selectByIndex(3);
       List <WebElement> dropDownList=select.getOptions();
        System.out.println(dropDownList.size());*/




    }








}
