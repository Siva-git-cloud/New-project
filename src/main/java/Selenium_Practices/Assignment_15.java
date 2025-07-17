package Selenium_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//Info :: Navigates to the Worldometers population page, scrolls to the summary table,
// and then scroll to the year 2100 and  retrieves the population forecast for the year 2100 using XPath, and prints it to the console.

public class Assignment_15 {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://www.worldometers.info/world-population/");
        WebElement summarytag=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("summary-table")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",summarytag);
        WebElement year2100Element=wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class=\"overflow-x-auto pb-4\"]//thead//tr//th[23]")));
        WebElement year2100Value = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class=\"overflow-x-auto pb-4\"]//tbody//tr//td[23]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",year2100Element);
        System.out.println("Year :"+year2100Element.getText() + " ====>> "+"Value :" + year2100Value.getText());
        driver.quit();
    }
}
