package com.Class4.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork03 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName=driver.findElementByXPath("//input[@id='txtUsername']");

        userName.sendKeys("Admin");
        WebElement login= driver.findElementByXPath("//input[@id='btnLogin']");
        login.click();
        WebElement text=driver.findElementByXPath("//span[@id='spanMessage']");
        String str= text.getText();
        if(str.equalsIgnoreCase("Password cannot be empty")){
            System.out.println(str);
        }
        driver.quit();

    }
}
