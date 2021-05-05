package com.seleniumClass5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;

public class cwDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        WebElement catogories=driver.findElementById("searchDropdownBox");
        Select select = new Select(catogories);
     boolean b=   select.isMultiple();
        System.out.println(b);

    }
}
