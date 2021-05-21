package com.SeleniumClass11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UploadFilesFromSelenium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/");
        WebElement fileUpload= driver.findElementByLinkText("File Upload");
        fileUpload.click();
        WebElement upload=driver.findElementById("file-upload");
        upload.sendKeys("C:\\Users\\Ram's Pc\\Desktop\\UNIFORM OPTION PRICING-13.xls");
        WebElement click= driver.findElementById("file-submit");
        click.click();
        driver.quit();

    }
}
