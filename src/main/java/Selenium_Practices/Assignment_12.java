package Selenium_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
 //info :: This class is used for upload the files & submit
//Data enter in git

public class Assignment_12 {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.navigate().to("https://practice.expandtesting.com/upload");
        driver.manage().window().maximize();
        WebElement choosefile = driver.findElement(By.id("fileInput"));
        choosefile.sendKeys("C:\\Users\\sivak\\Downloads\\image_2.jpg");
        WebElement uploadfile = driver.findElement(By.id("fileSubmit"));
        wait.until(ExpectedConditions.elementToBeClickable(uploadfile)).click();
        //uploadfile.click();

    }
}
