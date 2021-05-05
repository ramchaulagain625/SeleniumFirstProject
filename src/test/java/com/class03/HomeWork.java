package com.class03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        Thread.sleep(2000);
        WebElement start= driver.findElementByXPath("(//*[@id=\"btn_basic_example\"])[2]");
        System.out.println(start.isEnabled());
        start.click();
        WebElement simleForm=driver.findElementByXPath("//*[@id=\"basic\"]/div/a[1]");
        simleForm.click();
        WebElement enterSomething= driver.findElementByXPath("//*[@id=\"user-message\"]");
        enterSomething.sendKeys("This is my selenium practice");
        WebElement showMessage= driver.findElementByXPath("//*[@id=\"get-input\"]/button");
        showMessage.click();
        Thread.sleep(2000);
        driver.quit();
    }

}
