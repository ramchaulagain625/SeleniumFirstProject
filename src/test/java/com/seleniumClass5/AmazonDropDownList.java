package com.seleniumClass5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonDropDownList {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        WebElement catogories=driver.findElementById("searchDropdownBox");
        Select select = new Select(catogories);

        List <WebElement> options = select.getOptions();
        for (WebElement opt:options
             ) {
            String opttext=opt.getText();
            System.out.println(opttext);
        }
    }
}
