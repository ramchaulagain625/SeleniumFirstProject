package com.SeleniumReview1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");
        Thread.sleep(3000);
        WebElement signin=driver.findElementByXPath("//a[@id='idcta-link']");//xpath using by id
        signin.click();
        Thread.sleep(3000);

        WebElement registernow= driver.findElementByXPath("//*[@id=\"signin-page\"]/div[2]/div[2]/div[2]/div[2]/a/span");//xpath using by text
       registernow.click();
        Thread.sleep(3000);
        WebElement age= driver.findElementByXPath("//a[contains(@href, 'age?')]");
        age.click();
        Thread.sleep(3000);
        WebElement day= driver.findElementByXPath("//input[starts-with(@id,'day')]");
        day.sendKeys("1");
        Thread.sleep(3000);
        WebElement month= driver.findElementByXPath("//input[starts-with(@id,'month')]");
        month.sendKeys("12");
        Thread.sleep(3000);
        WebElement year= driver.findElementByXPath("//input[starts-with(@id,'year')]");
        year.sendKeys("1994");
        driver.findElementByXPath("//button[@id='submit-button']").click();

    }
}
