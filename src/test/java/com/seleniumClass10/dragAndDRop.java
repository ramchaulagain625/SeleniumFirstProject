package com.seleniumClass10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class dragAndDRop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement dragable= driver.findElementById("draggable");
        WebElement dropable= driver.findElementById("droppable");
        Actions action = new Actions(driver);
        action.dragAndDrop(dragable,dropable).perform();
    }
}
