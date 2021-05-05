package com.seleniumReviewClass2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MultipleSelection {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php");
        WebElement lists= driver.findElementByXPath("//select[@name='States']");
        Select select= new Select(lists);
        boolean boo= select.isMultiple();
        System.out.println(boo);
        //select cali and ohio
        select.selectByVisibleText("California");
        select.selectByVisibleText("Ohio");
        Thread.sleep(2000);
        select.deselectAll();
    }
}
