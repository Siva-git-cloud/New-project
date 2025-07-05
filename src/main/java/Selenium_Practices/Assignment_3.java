package Selenium_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//info:: this class is used for validate the data from Orange HRM


public class Assignment_3 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

        //Thread.sleep(3000);
        //Browser Maximize
        driver.manage().window().maximize();
        //Finding the username
        WebElement UserName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        //Enetr the User Name
        UserName.sendKeys("Admin");
        //Finding the Password
        WebElement Password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        //Eneter the Password
        Password.sendKeys("admin123");
        //Click the login button
        WebElement login =wait.until(ExpectedConditions.elementToBeClickable(By.className("orangehrm-login-button")));
        login.click();
        //Thread.sleep(3000);
        //Click the Dashboard Buttom
        WebElement dashboard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[contains(@class,'topbar-header') and text()='Dashboard']")));
        dashboard.click();
        //Thread.sleep(3000);
        //Click the Admin-tab Button
        WebElement adminButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'main-menu') and text() = 'Admin']")));
        adminButton.click();
        //Thread.sleep(3000);
        //Enter data in UserName
        WebElement userName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form//input[contains(@class,'oxd-input')]")));
        userName.sendKeys("Harish");
        //Thread.sleep(1000);
        //Enter data in Employee Name
        WebElement employeeName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Type for hints...']")));
        employeeName.sendKeys("Thomas Kutty Benny");
        //Thread.sleep(1000);
        employeeName.click();
        //Click Search button
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'button--medium') and @type = 'submit']")));

        searchButton.click();
        //driver.quit();
    }
}
