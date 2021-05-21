package com.seleniumRevision3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class demo1Rivision {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://swagger.io/tools/swaggerhub/");
        String homepageHandel=driver.getWindowHandle();
        WebElement link1=driver.findElementByXPath("//a[@href='https://bitbar.com/?utm_medium=referral&utm_source=swagger.io&utm_campaign=footer']");
        link1.click();//clicking the first link to open the new window
        Set<String> allLink=  driver.getWindowHandles();
        Iterator<String> it=allLink.iterator();
        while(it.hasNext()){
            it.next();
            String str= it.next();
            driver.switchTo().window(str);
        }
        WebElement link2=driver.findElementByXPath("//a[@href='https://www.youtube.com/user/BitbarChannel/']");
        link2.click();
    }
}
class main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Syntax\\selenium\\intaall\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launch the browser
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx";
        driver.get(url);
        //login code
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
        password.sendKeys("test");
        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginBtn.click();
        //table code
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        System.out.println(rows);
//        Iterator<WebElement> row = rows.iterator();
        for (int i = 0; i < rows.size(); i++) {
            String row = rows.get(i).getText();
            System.out.println(row);
        }
    }
}