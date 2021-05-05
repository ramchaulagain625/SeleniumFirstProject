package com.seleniumClass6.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class Second {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php");
      driver.findElementByXPath("//button[@class='btn btn-default']").click();
      Thread.sleep(3000);

        Alert alert=driver.switchTo().alert();
        alert.accept();

        driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[1]").click();
        Thread.sleep(3000);
        alert=driver.switchTo().alert();
        alert.accept();

        driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[2]").click();
        Thread.sleep(3000);
        alert=driver.switchTo().alert();
        alert.sendKeys("Ram");
        alert.accept();
        driver.quit();
    }
}
