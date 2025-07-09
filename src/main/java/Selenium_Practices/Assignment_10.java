package Selenium_Practices;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.Set;
 //info :: This class is used for window handel & Tab handel


public class Assignment_10 {
    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        // Get parent window handle
        String parentWindow = driver.getWindowHandle();

        // Click REST API link with SHIFT key (to open in new window/tab)
        //WebElement restApi = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("REST API")));
        WebElement soapUI=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("SoapUI")));
        WebElement appium=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Appium")));
        WebElement jMeter=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("JMeter")));
        //Switch to new Window
        //actions.keyDown(Keys.SHIFT).click(jMeter).keyUp(Keys.SHIFT).perform();
        //Switch to new tab
        actions.keyDown(Keys.CONTROL).click(appium).keyUp(Keys.CONTROL).perform();

        // Switch to new window
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(parentWindow)) {
                driver.switchTo().window(handle);
                break;
            }

        }

        // Print new window title
        System.out.println("Child window title: " + driver.getTitle());

        // Close child window
        driver.close();

        // Switch back to parent
        driver.switchTo().window(parentWindow);
        System.out.println("Back to parent window: " + driver.getTitle());

        //driver.quit();
    }
}
