package com.seleniumReviewClass2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class x {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "D:\\Syntax\\selenium\\intaall\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(); // launch the browser
        String url = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
        driver.get(url);
        //SwitchTo()
//        it simply switches to that particular alert and allows us to perform operations in it
//        type of js aleerts
//            Simlpe
//                    Comfirmation
//                    prompt
//        Dealing with alerts
//          1.accept()
//          2. dismiss()
//          3.getText();
//          4.Sendkeys();
        //simple alert
        driver.findElement(By.xpath(" //input[@value='Alert']")).click();
        Thread.sleep(2000);
        Alert simplealert=driver.switchTo().alert();
        simplealert.accept();
        //confirmation box
        driver.findElement(By.xpath(" //input[@value='Confirmation Box']")).click();
        Thread.sleep(2000);
        Alert confirmationalert=driver.switchTo().alert();
        String alertText=confirmationalert.getText();
        System.out.println("the text of the alert is :"+ alertText);
        Thread.sleep(2000);
        confirmationalert.dismiss();
        //prompt alerts
        driver.findElement(By.xpath(" //input[@value='Prompt']")).click();
        Thread.sleep(2000);
        Alert promptAlert=driver.switchTo().alert();
        Thread.sleep(2000);
        promptAlert.sendKeys("klenfkmsgksmgklsm");
        Thread.sleep(2000);
        promptAlert.accept();
    }
}
 class Main {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver", "D:\\Syntax\\selenium\\intaall\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(); // launch the browser
        String url = "https://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";
        driver.get(url);
        //Switch to the iframe under consideration
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        //to interact with any other element on the the home page we need to swtich back
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[text()='Alerts & Modals']")).click();
        //switch using webelement
        WebElement iframe = driver.findElement(By.xpath("//iframe[@name='FrameOne']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//a[@id='btn_inter_example']")).click();
        driver.switchTo().defaultContent();
    }
}