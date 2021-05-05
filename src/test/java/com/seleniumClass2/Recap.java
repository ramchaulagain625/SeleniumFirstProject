package com.seleniumClass2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Recap {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://Facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//*[@id=\"email\"]")).sendKeys("syntax");
        driver.findElement(new By.ByXPath("//*[@id=\"pass\"]")).sendKeys("syntax123");
        driver.findElement(new By.ByName("login")).click();
        Thread.sleep(2000);
        driver.findElement(new By.ByLinkText("Forgot Password?")).click();



    }
}
