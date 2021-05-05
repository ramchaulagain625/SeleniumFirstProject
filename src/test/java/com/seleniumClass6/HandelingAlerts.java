package com.seleniumClass6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingAlerts {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
       WebElement simpleButton= driver.findElementById("alert");
       simpleButton.click();
        Alert simpleAlert= driver.switchTo().alert();//Switching focus to simple alerts After alerts popup
        simpleAlert.accept();

        WebElement confirmationButton = driver.findElementById("confirm");//confirm alerts
        confirmationButton.click();

        Alert confirmAlerts= driver.switchTo().alert();
        String alertsText=confirmAlerts.getText();
        System.out.println(alertsText);
        confirmAlerts.dismiss();//

        //prompt alerts
     WebElement promptAlertsButton= driver.findElementById("prompt");
     promptAlertsButton.click();
     Alert promptAlerts= driver.switchTo().alert();
     promptAlerts.sendKeys("Ram and Sabi");
     promptAlerts.accept();
     driver.quit();

    }
}
