package com.ReviewClass04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PaginationTable {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://syntaxtechs.com/selenium-practice/table-pagination-demo.php");
        List<WebElement> allList=driver.findElementsByXPath("//table[@class='table table-hover']/tbody/tr");
        for (WebElement list:allList) {
            if(list.getText().contains("Computer ")){
                System.out.println(list.getText());
            }

        }
        WebElement nextBtn= driver.findElementByXPath("//a[@class='next_link']");
        boolean flag=true;
        while(flag){
            for (WebElement list:allList) {
                if(list.getText().contains("Juan valdez")){
                    System.out.println(list.getText());
                    flag=false;
                    break;

                }

            }
            nextBtn.click();

        }
    }
}
