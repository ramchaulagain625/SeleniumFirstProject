package com.SeleniumClass08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTableDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://syntaxtechs.com/selenium-practice/table-search-filter-demo.php");
       List<WebElement> rowData= driver.findElementsByXPath("//table[@id='task-table']/tbody/tr");
       // System.out.println(rowData.size());
        Iterator<WebElement> it= rowData.iterator();
        while(it.hasNext()){
            WebElement row=it.next();
            String rowText= row.getText();
            System.out.println(rowText);
        }
       List<WebElement>colsnDta =driver.findElementsByXPath("//table[@id='task-table']/thead/tr/th");
        int size=colsnDta.size();
        for (WebElement coldata : colsnDta) {
            String text = coldata.getText();
            System.out.println(text);

        }
    }
}
