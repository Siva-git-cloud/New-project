package Selenium_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//info :: This class is used for the aleart pop-ups in rahulshettyacademy
public class Assignment_9 {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement enterName = driver.findElement(By.id("name"));
        enterName.sendKeys("Siva");
        //For alraet key

        //WebElement alreatButton= driver.findElement(By.id("alertbtn"));
        //alreatButton.click();
        //System.out.println(driver.switchTo().alert().getText());
        //driver.switchTo().alert().accept();

        //for confirm key for accepet
        /*WebElement confirmButton=driver.findElement(By.id("confirmbtn"));
        confirmButton.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();*/

        //for confirm key for cancel
        WebElement confirmButton = driver.findElement(By.id("confirmbtn"));
        confirmButton.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

        //driver.quit();
    }
}
