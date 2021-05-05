package com.Class4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClaerCommandDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
       WebElement username= driver.findElement(new By.ByXPath("//*[@id=\"ctl00_MainContent_username\"]"));
       username.sendKeys("Tester");
        WebElement password=driver.findElement(new By.ByXPath("//*[@id=\"ctl00_MainContent_password\"]"));
        password.sendKeys("test");
        username.clear();
        password.clear();
        driver.findElement( new By.ByXPath("//*[@id=\"ctl00_MainContent_login_button\"]")).click();

        driver.quit();
       // String s=driver.getTitle();
    }
}
