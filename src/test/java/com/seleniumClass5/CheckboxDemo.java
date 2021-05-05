package com.seleniumClass5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxDemo {
    static String url="http://syntaxtechs.com/selenium-practice/basic-checkbox-demo.php";
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
       List<WebElement> lists= driver.findElementsByXPath("//input[@class='cb1-element']");
        System.out.println(lists.size());
        for (WebElement list:lists) {
String checkBox=list.getAttribute("value");
            if(checkBox.equalsIgnoreCase("Option-2")){
                list.click();
                break;
            }
        }


    }

}
