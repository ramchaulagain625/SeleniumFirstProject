package com.seleniumClass2.Homework2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class secondHw {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //Wait<WebElement> wait= new FluentWait<WebElement>((WebElement) driver);
        WebElement signUp=driver.findElement(new By.ByLinkText("Create New Account"));
        signUp.click();
        //Alert alert = driver.switchTo().alert();
        WebElement firstName=driver.findElementByName("firstname");
        firstName.sendKeys("ram");
        WebElement lastName= driver.findElementByName("lastname");
        lastName.sendKeys("chau");
        WebElement mobileOrEmail=driver.findElementByName("reg_email__");
        mobileOrEmail.sendKeys("chau@gmail.com");
        WebElement reEmailorPassword=driver.findElementByName("reg_email_confirmation__");
        reEmailorPassword.sendKeys("chau@gmail.com");
        WebElement password= driver.findElementByName("reg_passwd__");
        password.sendKeys("passwo123");
       /*WebElement confirmPass=driver.findElementByName("");
        confirmPass.sendKeys("passwo123");
        WebElement birthDate= driver.findElementByName("birthday_age");
        birthDate.sendKeys("28");*/
        WebElement submit = driver.findElementByName("websubmit");
        submit.click();



    }

}
