package com.seleniumClass10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calenderHandeling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.delta.com/");
        WebElement calender = driver.findElementById("input_departureDate_1");
        calender.click();
        WebElement dMonth= driver.findElementByClassName("dl-datepicker-month-0");
        String month= dMonth.getText();
        WebElement next= driver.findElementByXPath("//span[text()='Next']");
        while(!month.equalsIgnoreCase("July")){
            next.click();
            month=dMonth.getText();
        }
        List<WebElement> departDates= driver.findElementsByXPath("//tbody[@class='dl-datepicker-tbody-0']/tr/td");
        for(WebElement date:departDates){
            if(date.getText().equals("19")){
                date.click();
                break;
            }
        }
        WebElement reMonth= driver.findElementByClassName("dl-datepicker-month-1");
        String month1=reMonth.getText();
        while(!month1.equals("September")){
            next.click();
            month1=reMonth.getText();
        }
        List<WebElement> returnDate=driver.findElementsByXPath("//tbody[@class='dl-datepicker-tbody-1']/tr/td");
        for(WebElement date1:returnDate){
            if(date1.getText().equals("3")){
                date1.click();
                break;

            }
        }
        WebElement done= driver.findElementByClassName("donebutton");
        done.click();
    }
}
