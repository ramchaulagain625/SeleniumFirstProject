package com.seleniumClass2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(new By.ByXPath("//*[@id=\"ctl00_MainContent_username\"]")).sendKeys("Tester");
driver.findElement(new By.ByXPath("//*[@id=\"ctl00_MainContent_password\"]")).sendKeys("test");
driver.findElement( new By.ByXPath("//*[@id=\"ctl00_MainContent_login_button\"]")).click();
String s=driver.getTitle();
if(s.equalsIgnoreCase("Web Orders")){
    System.out.println(true);
}else{
    System.out.println(false);
}
driver.findElement(new By.ByLinkText("Logout")).click();
    }
}
