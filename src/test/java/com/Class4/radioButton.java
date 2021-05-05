package com.Class4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxtechs.com/selenium-practice/basic-radiobutton-demo.php");
        WebElement radioButton=driver.findElementByCssSelector("input[value='0 - 5']");
       // radioButton.click();
        boolean b= radioButton.isEnabled();
       boolean b1= radioButton.isDisplayed();
       boolean b2= radioButton.isSelected();
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
    }
}
