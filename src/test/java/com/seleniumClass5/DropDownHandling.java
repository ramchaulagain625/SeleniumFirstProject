package com.seleniumClass5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownHandling {

    public static void main(String[] args) throws InterruptedException {
       String url="http://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php";
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement day = driver.findElementById("select-demo");
        Select select= new Select(day);
       /* select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByVisibleText("Wednesday");*/
        List<WebElement> allOptions = select.getOptions();
        int size=allOptions.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
           String allDay= allOptions.get(i).getText();
           select.selectByIndex(i);
           Thread.sleep(2000);
            System.out.println(allDay);
        }

    }
}
