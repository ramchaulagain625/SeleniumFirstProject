package com.seleniumClass2.Homework2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsthw {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        WebElement firstName=driver.findElement(new By.ByName("customer.firstName"));
        firstName.sendKeys("Rammani");
        WebElement lastName= driver.findElement(new By.ByName("customer.lastName"));
        lastName.sendKeys("Chaulagain");
        WebElement address = driver.findElement(new By.ByName("customer.address.street"));
        address.sendKeys("silver springs way");
        WebElement city = driver.findElement(new By.ByName("customer.address.city"));
        city.sendKeys("Georgetown");
        WebElement state = driver.findElement(new By.ByName("customer.address.state"));
        state.sendKeys("Kentucky");
        WebElement zipCode= driver.findElement( new By.ByName("customer.address.zipCode"));
        zipCode.sendKeys("40324");
        WebElement phoneNo=driver.findElement(new By.ByName("customer.phoneNumber"));
        phoneNo.sendKeys("12345436");
        WebElement ssn= driver.findElement(new By.ByName("customer.ssn"));
        ssn.sendKeys("123456789");
        WebElement userName= driver.findElementByName("customer.username");
        userName.sendKeys("ramsdc");
        WebElement password = driver.findElementByName("customer.password");
        password.sendKeys("123456pass");
        WebElement confPassword = driver.findElementByName("repeatedPassword");
        confPassword.sendKeys("123456pass");
        WebElement register = driver.findElementByXPath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");
        register.click();
        Thread.sleep(2000);
        driver.quit();

    }

}
