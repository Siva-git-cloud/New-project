package Selenium_Practices;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
//This class is used for shadowroot open

public class Assignment_11 {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.navigate().to("https://www.htmlelements.com/demos/menu/shadow-dom/index.htm");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement fileButton = (WebElement) ((JavascriptExecutor) driver)
                .executeScript("document.querySelector('smart-ui-menu.smart-ui-component').shadowRoot.querySelector('[aria-label='File']')");
        //WebElement file =
        wait.until(ExpectedConditions.elementToBeClickable(fileButton)).click();


    }
}
