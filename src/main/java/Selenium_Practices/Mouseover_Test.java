package Selenium_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Mouseover_Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        Actions actions=new Actions(driver);
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebElement button = driver.findElement(By.id("mousehover"));
        actions.moveToElement(button).perform();
        WebElement topOptions =wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Top")));
        //WebElement reloadOptions= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Reload")));
        topOptions.click();
        //reloadOptions.click();
        //driver.quit();
    }
}
