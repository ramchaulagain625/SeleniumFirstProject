package com.SeleniumClass08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class ExplicitWaitExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://syntaxtechs.com/selenium-practice/dynamic-data-loading-demo.php");
       WebElement button=driver.findElementById("save");
       button.click();
        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(new By.ByXPath("//p[contains(text(),'First Name')]")));
       WebElement firstName=driver.findElementByXPath("//p[contains(text(),'First Name')]");
        System.out.println(firstName.getText());
    }
}
