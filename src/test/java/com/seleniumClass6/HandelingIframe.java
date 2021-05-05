package com.seleniumClass6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingIframe {
    public static String url="http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.switchTo().frame(0);
       WebElement textBox= driver.findElementById("name");
       textBox.sendKeys("Java");
       driver.switchTo().defaultContent();
    /*    WebElement simpleButton= driver.findElementById("alert");
        simpleButton.click();
        Alert simpleAlert= driver.switchTo().alert();//Switching focus to simple alerts After alerts popup
        simpleAlert.accept();
        driver.switchTo()*/
        driver.switchTo().frame("iframe_a");
        textBox.clear();
        Thread.sleep(2000);
        textBox.sendKeys("Ram");
        driver.switchTo().defaultContent();
        WebElement frameElement=driver.findElementByXPath("//iframe[@src='/Demo.html']");
        driver.switchTo().frame(frameElement);
        textBox.clear();
        textBox.sendKeys("Sabita");

    }
}
