package com.seleniumReviewClass2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ReviewDemo1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        WebElement redButton=driver.findElementByXPath("//input[@value='red']");
        boolean isenable=redButton.isEnabled();
        System.out.println(isenable);
        redButton.click();
        boolean isSelected=redButton.isSelected();
        System.out.println(isSelected);

        List<WebElement> listOfAllCheckbox=driver.findElementsByXPath("//input[@type='checkbox']");
        System.out.println(listOfAllCheckbox.size());
        //select yellow orange purple


        for (WebElement list:listOfAllCheckbox) {
             String checkBoxValue=list.getAttribute("value");
            System.out.println(checkBoxValue);
            if(checkBoxValue.equalsIgnoreCase("yellow")){
                list.click();
            }
            if(checkBoxValue.equalsIgnoreCase("orange")){
                list.click();
            }
            if(checkBoxValue.equalsIgnoreCase("purple")){
                list.click();
            }

        }
    }
}
