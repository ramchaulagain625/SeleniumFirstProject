package com.class03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3Demo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.findElementByXPath("//input[contains(@class,'txt')][1]").sendKeys("tester");
        driver.findElementByXPath("//input[contains(@class,'txt')][2]").sendKeys("test");
        driver.findElementByXPath("//input[contains(@class,'button')][1]").click();
        driver.quit();
    }
}
