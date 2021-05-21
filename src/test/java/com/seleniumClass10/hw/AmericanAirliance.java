package com.seleniumClass10.hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmericanAirliance {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.aa.com/homePage.do");
        WebElement toDestination = driver.findElementById("reservationFlightSearchForm.destinationAirport");
        toDestination.sendKeys("Kathmandu");
        WebElement fromDate = driver.findElementById("aa-leavingOn");
        fromDate.click();
        WebElement monthName = driver.findElementByXPath("//span[@class='ui-datepicker-month']");
        String month = monthName.getText();
        System.out.println(month);
        Thread.sleep(3000);
        // month=driver.findElementByXPath("//a[@class='ui-datepicker-next ui-corner-all']").getText();

        boolean flag = true;
        while (flag) {
            if (!month.equals("July")) {
                WebElement next = driver.findElementByXPath("//a[@title='Next']");
                next.click();
                month = driver.findElementByXPath("//span[@class='ui-datepicker-month']").getText();
                // System.out.println(month);
            } else
                flag = false;
        }
        List<WebElement> listOfDates = driver.findElementsByXPath("//table[@class='ui-datepicker-calendar']/tbody/tr/td");
        for (WebElement date : listOfDates) {
            String day = date.getText();
            if (day.equals("19")) {
                date.click();
                break;
            }

        }
        WebElement returnDate = driver.findElementByXPath("//input[@id='aa-returningFrom']");
        returnDate.click();
        WebElement returnMonth = driver.findElementByXPath("(//span[@class='ui-datepicker-month'])[2]");
        while (true) {
            if (!returnMonth.getText().equals("September")) {
                WebElement reNextBtn = driver.findElementByXPath("//a[@class='ui-datepicker-next ui-corner-all']");
                reNextBtn.click();
                returnMonth = driver.findElementByXPath("(//span[@class='ui-datepicker-month'])[2]");
            } else
                break;

        }
        List<WebElement> listOfRtnDates = driver.findElementsByXPath("//table[@class='ui-datepicker-calendar']/tbody/tr/td");
        for (WebElement date : listOfRtnDates) {
            String day = date.getText();
            if (day.equals("19")) {
                date.click();
                break;
            }

        }
        driver.quit();
    }
}