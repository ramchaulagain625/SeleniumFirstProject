package com.Class4.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        List<WebElement> link=driver.findElementsByXPath("//a");
        System.out.println(link.size());

        for(WebElement list:link){
            String str= list.getAttribute("href");
            String title = list.getText();
            if(!title.isEmpty()){
                System.out.println(list.getText());

            }else{

            }
        }
driver.quit();
    }
}
