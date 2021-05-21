package com.SeleniumClass11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.ReviewClass04.commonMethod.FindElementByXpath;
import static com.ReviewClass04.commonMethod.openBrowser;

public class Demo1JSExecutor {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        openBrowser(driver,"http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
       WebElement loginButton= driver.findElement(By.cssSelector("input#btnLogin"));

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='blue'", driver.findElement(By.cssSelector("input#txtPassword")));
        js.executeScript("arguments[0].click()",loginButton);


        /*// driver.findElementById("menu_pim_viewPimModule").click();
        WebElement pimbtn= FindElementByXpath(driver,"//a[@id='menu_pim_viewPimModule']");
        pimbtn.click();
        WebElement Empbtn= FindElementByXpath(driver,"//a[@id='menu_pim_viewEmployeeList']");
        Empbtn.click();*/


    }
}
