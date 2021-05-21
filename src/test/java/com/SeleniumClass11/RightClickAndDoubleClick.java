package com.SeleniumClass11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.concurrent.TimeUnit;

public class RightClickAndDoubleClick {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightClick= driver.findElementByXPath("//span[text()='right click me']");
        Actions action=new Actions(driver);
        action.contextClick(rightClick).perform();
        WebElement editBtn= driver.findElementByXPath("//span[text()='Edit']");
        action.click(editBtn).perform();
        Alert alerts=driver.switchTo().alert();
        alerts.accept();
        WebElement doubleClickBtn=driver.findElementByXPath("//button[contains(text(),Double)]");
        action.doubleClick(doubleClickBtn).perform();
        String str=alerts.getText();
        System.out.println(str);
        alerts.accept();
        driver.quit();

    }
}
