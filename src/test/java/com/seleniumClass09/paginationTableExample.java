package com.seleniumClass09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class paginationTableExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://syntaxtechs.com/selenium-practice/table-pagination-demo.php");
       // WebDriverWait wait = new WebDriverWait(driver,20);
        List<WebElement> list=driver.findElementsByXPath("//table[@class='table table-hover']/tbody/tr");
         WebElement nextButton= driver.findElementByXPath("(//a[@class='page_link'])[1]");
         boolean flag=true;
         while(flag){
            for(WebElement tablerow:list){
                 String text = tablerow.getText();
            if(text.contains("Archy J")){
            System.out.println(text);
            flag=false;
        }

}

   nextButton.click();
}

driver.quit();
    }
}
