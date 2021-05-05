package com.Class4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class getAllLinkFromEbay {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
        List<WebElement> allLink = driver.findElementsByXPath("//a");
        System.out.println(allLink.size());
        for (WebElement link:allLink
             ) {
           String fulllink= link.getAttribute("href");
            String linktext=link.getText();
            if(!linktext.isEmpty()){
                System.out.println(link.getText()+fulllink);
            }

        }


    }
}
