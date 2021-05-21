package com.SeleniumClass08.hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class firstHw {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
       WebDriverWait wait = new WebDriverWait(driver,20);
       //wait.until()

       wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(new By.ByXPath("//*[@id=\"checkbox\"]/input")));
       WebElement clickableButton= driver.findElementByXPath("//div[@id='checkbox']/input");
       clickableButton.click();
       WebElement removeButton=driver.findElementByXPath("(//*[@type='button'])[1]");
       removeButton.click();
       wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(new By.ByXPath("//p[@id='message']")));
       WebElement message= driver.findElementByXPath("//p[@id='message']");
        System.out.println(message.getText());
        WebElement enableButton= driver.findElementByXPath("//form[@id='input-example']/button");
        enableButton.click();
       // wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(new By.ByXPath("//*[@id=\"input-example\"]/input")));
        //driver.findElementByXPath("//*[@id=\"input-example\"]/input").sendKeys("123456");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(new By.ByXPath("//form[@id='input-example']/button")));

        enableButton.click();
        Thread.sleep(3000);
        driver.quit();


    }
}
