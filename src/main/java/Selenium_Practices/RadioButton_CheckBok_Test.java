package Selenium_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*This class is used
Radio Button Example & Checkbox Example--> Used URL -->https://rahulshettyacademy.com/AutomationPractice/
 We need to click on Radio button option3 & Checkbox button option2*/



public class RadioButton_CheckBok_Test {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebElement radiobuttonclick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='radioButton' and @value='radio3']")));
        radiobuttonclick.click();
        WebElement checkbokclick = wait.until(ExpectedConditions.elementToBeClickable(By.id("checkBoxOption2")));
        checkbokclick.click();

        System.out.println("Radio Button selected: " + radiobuttonclick.isSelected());
        System.out.println("Checkbox selected: " + checkbokclick.isSelected());
        driver.quit();
    }

}
