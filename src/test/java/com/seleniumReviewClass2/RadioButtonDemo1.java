package com.seleniumReviewClass2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonDemo1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://material-ui.com/components/radio-buttons/");
        List<WebElement> listAll= driver.findElementsByXPath("//input[@name='gender1']");
        for (WebElement list:listAll ) {
            String value=list.getAttribute("value");
            if(value.equalsIgnoreCase("female")){
                list.click();
            }
            if(!list.isEnabled()){
                System.out.println("There is a disable radio button");
            }

        }
    }

}
