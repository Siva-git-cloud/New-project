package Selenium_Practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Assignment_13 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        //to navigate the url
        driver.navigate().to("https://opensource-demo.orangehrmlive.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
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
        WebElement adminButton =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Admin']")));
        adminButton.click();
        WebElement organizationButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav[@aria-label='Topbar Menu']/..//following-sibling::span[@class='oxd-topbar-body-nav-tab-item' and  text()='Organization ']")));
        organizationButton.click();
        WebElement locationclick=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Locations")));
        locationclick.click();
        WebElement countryDropdown=wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//label[text()='Country']/following::div[@class='oxd-select-text-input'])")));
        countryDropdown.click();
        /*WebElement countryOption=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Country']/..//following-sibling::div//div[text()='India']")));
        countryOption.click();*/
        WebElement indiaOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@role='option']//span[text()='India']")));
        indiaOption.click();
        WebElement deletebutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='row']/..//following-sibling::div//button[@type='button']//i[@class='oxd-icon bi-trash']")));
        deletebutton.click();
        WebElement deleteAlreat = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button' and text()=' Yes, Delete ']")));
        deleteAlreat.click();

        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit' and text()=' Search ']")));
        searchButton.click();
        WebElement addButton =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button' and text()=' Add ']")));
        addButton.click();
        WebElement enterName =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()=\"Name\"]/..//following-sibling::div//input[@class='oxd-input oxd-input--active']")));
        enterName.sendKeys("Testing");
        WebElement phonenumber=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()=\"Phone\"]/..//following-sibling::div//input[@modelmodifiers='[object Object]']")));
        phonenumber.sendKeys("9987678868");
        WebElement formcountryDropdown=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[text()='Country']/following::div[@class='oxd-select-text-input'])")));
        formcountryDropdown.click();

        WebElement formcountryName = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@role='option']//span[text()='India']")));
        formcountryName.click();
        WebElement saveButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()=' * Required']/..//button[text()=' Save ']")));
        saveButton.click();
    }
}
