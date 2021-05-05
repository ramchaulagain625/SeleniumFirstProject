package com.seleniumReviewClass2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownListDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.surveymonkey.com/r/?sm=uQNn3rYKMcVS0Dyy6GTjSw%3D%3D");
        WebElement dropdown=driver.findElementByXPath("//select[@id]");
        Select select=new Select(dropdown);
        select.selectByIndex(1);

        List<WebElement> allOptions=select.getOptions();
        int size=allOptions.size();
        System.out.println(size);
        for (WebElement option:  allOptions          ) {

            System.out.println(option.getText());
        }
    }
}
