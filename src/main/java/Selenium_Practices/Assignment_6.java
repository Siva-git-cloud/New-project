package Selenium_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

//Suggession Class Example--> Used URL -->https://rahulshettyacademy.com/AutomationPractice/
//inf0:: We need to enter the values in Suggession Class Example box it has to eneter the data in that need to display the values

public class Assignment_6 {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebElement enterSuggestion = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='autocomplete']")));
        enterSuggestion.sendKeys("India");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='ui-menu-item']")));
        List<WebElement> values = driver.findElements(By.xpath("//li[@class='ui-menu-item']//div"));
        for (WebElement options :values){
            System.out.println(options.getText());
            if (options.getText().equalsIgnoreCase("India")){
                options.click();
                break;
            }
        }
        //driver.quit();
    }

}
