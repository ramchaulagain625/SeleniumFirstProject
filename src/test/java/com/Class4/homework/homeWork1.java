package com.Class4.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeWork1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName= driver.findElementByXPath("//input[@id='txtUsername']");
        userName.sendKeys("Admin");
        Thread.sleep(2000);
      WebElement password=  driver.findElementByXPath("//*[@id=\"txtPassword\"]");//span[text()='Password']
        password.sendKeys("Hum@nhrm123");
        Thread.sleep(2000);
        WebElement login = driver.findElementByXPath("//input[@id='btnLogin']");
        login.click();
        String title=driver.getTitle();

        if(title.equalsIgnoreCase("Human Management System")){
            System.out.println("You are in the right page your title is :"+title);
        }else{
            System.out.println("Sorry you are in wrong page");
        }
        Thread.sleep(5000);
        driver.quit();


    }
}
