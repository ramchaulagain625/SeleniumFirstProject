package com.seleniumClass6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlerts {
    public static String url ="http://test:test@abcdatabase.com/basicauth";
                                    //username:password@
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.quit();
    }

}
