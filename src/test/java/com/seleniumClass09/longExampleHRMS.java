package com.seleniumClass09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class longExampleHRMS {
    public static void main(String[] args) {
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
        WebElement pim= driver.findElementById("menu_pim_viewPimModule");
        pim.click();
        WebElement addEmp= driver.findElementById("menu_pim_addEmployee");
        addEmp.click();
        WebElement firstName= driver.findElementById("firstName");
        firstName.sendKeys("Rammani");
        WebElement lastName= driver.findElementByXPath("//input[@id='lastName']");
        lastName.sendKeys("Chaulagain");
        WebElement getId=driver.findElementByXPath("//input[@id='employeeId']");
       String EmployeeId= getId.getAttribute("value");
        WebElement save= driver.findElementByXPath("//input[@id='btnSave']");
        save.click();
        WebElement empList= driver.findElementByLinkText("Employee List");
        empList.click();

        boolean flag=true;
        while(flag){
            List<WebElement> allEmployee=driver.findElementsByXPath("//table[@id='resultTable']/tbody/tr");
           for (int i = 0; i < allEmployee.size(); i++) {
              String text=allEmployee.get(i).getText();
                if(text.contains(EmployeeId)){
                    flag=false;
                  WebElement checkBox=  driver.findElementByXPath("//table[@id='resultTable']/tbody/tr[" + i+ "]/td[1]");
                  checkBox.click();
                  WebElement delete=driver.findElementById("btnDelete");
                  delete.click();
                  WebElement confirm=driver.findElementById("dialogDeleteBtn");
                  confirm.click();
                  break;


                }

            }
           WebElement next= driver.findElementByLinkText("Next");
           next.click();
        }

    }
}
