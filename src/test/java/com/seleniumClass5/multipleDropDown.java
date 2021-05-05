package com.seleniumClass5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class multipleDropDown {
    public static String url="http://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php";
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.get(url);
        WebElement stateId= driver.findElementById("multi-select");
        Select select= new Select(stateId);
        boolean b=select.isMultiple();
        System.out.println(b);
if(b){
   List<WebElement>options= select.getOptions();
    for (WebElement option:options  ) {
String str= option.getText();
select.selectByVisibleText(str);
Thread.sleep(2000);

    }
}

    }
}
