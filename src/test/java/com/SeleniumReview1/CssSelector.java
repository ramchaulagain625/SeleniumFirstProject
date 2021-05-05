package com.SeleniumReview1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxtechs.com/selenium-practice/basic-first-form-demo.php");
        Thread.sleep(2000);
        driver.findElementByCssSelector("#user-message").sendKeys("Ram");
        driver.findElementByXPath("//button[text()= 'Show Message']").click();
    }
}
