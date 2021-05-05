package com.SeleniumClass7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvanceWindowHandle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxtechs.com/selenium-practice/window-popup-modal-demo.php");
        String driverWindowHandle= driver.getWindowHandle();
        WebElement insta=driver.findElementByLinkText("Follow On Instagram");

        WebElement facebook=driver.findElementByLinkText("Like us On Facebook");

        WebElement facebookAndInsta=driver.findElementByLinkText("Follow Instagram & Facebook");
        insta.click();
        facebook.click();
        facebookAndInsta.click();
        Set<String> allWindowsHandle= driver.getWindowHandles();
       // System.out.println(allWindowsHandle);
        Iterator<String> iterator= allWindowsHandle.iterator();
        while(iterator.hasNext()){
          String handle= iterator.next();

          if(!handle.equals(driverWindowHandle)){
              driver.switchTo().window(handle);
              System.out.println(driver.getTitle());
              driver.close();
          }

        }
        driver.switchTo().window(driverWindowHandle);
        insta.click();
    }
}
