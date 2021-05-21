package com.seleniumClass09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalenderExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement user= driver.findElementByXPath("//input[@id='txtUsername']");
        user.sendKeys("Admin");
        WebElement pass= driver.findElementByXPath("//input[@id='txtPassword']");
        pass.sendKeys("Hum@nhrm123");
        WebElement login= driver.findElementByXPath("//input[@id='btnLogin']");
        login.click();
        Thread.sleep(3000);
        WebElement leave= driver.findElementById("menu_leave_viewLeaveModule");
        leave.click();
        WebElement leaveList= driver.findElementByLinkText("Leave List");
        leaveList.click();
        WebElement startDate=driver.findElementById("calFromDate");
        startDate.click();
        WebElement month= driver.findElementByClassName("ui-datepicker-month");
        Select monthDRopDown= new Select(month);
        monthDRopDown.selectByVisibleText("Jul");
        List<WebElement> fromDate=driver.findElementsByXPath("//table[@class='ui-datepicker-calendar']/tbody/tr/td");
        for (WebElement from:fromDate) {
            if(from.getText().equals("29")){
                from.click();
                break;
            }

        }

        WebElement endDate= driver.findElementById("calToDate");
        endDate.click();
        WebElement month1= driver.findElementByClassName("ui-datepicker-month");

        Select endMonthLIst= new Select(month1);
        endMonthLIst.selectByVisibleText("Nov");
        List<WebElement> toDate=driver.findElementsByXPath("//table[@class='ui-datepicker-calendar']/tbody/tr/td");
        for (WebElement to:toDate) {
            if(to.getText().equals("29")){
                to.click();
                break;
            }

        }
        WebElement pendingApproval= driver.findElementById("leaveList_chkSearchFilter_1");
        pendingApproval.click();
        WebElement cancelButton= driver.findElementById("leaveList_chkSearchFilter_0");
        cancelButton.click();
        WebElement rejectedButton=driver.findElementById("leaveList_chkSearchFilter_-1");
        rejectedButton.click();
        WebElement reset=driver.findElementById("btnReset");
        reset.click();
        Thread.sleep(5000);
        driver.quit();

    }
}
