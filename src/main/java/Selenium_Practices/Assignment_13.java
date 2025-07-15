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
import java.util.Collections;
import java.util.List;

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


        //Click adminButton
        WebElement adminButton =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Admin']")));
        adminButton.click();
        //Click Organization dropdown
        WebElement organizationButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav[@aria-label='Topbar Menu']/..//following-sibling::span[@class='oxd-topbar-body-nav-tab-item' and  text()='Organization ']")));
        organizationButton.click();
        //Click location button
        WebElement locationclick=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Locations")));
        locationclick.click();
        //Click CountryDropDown
        WebElement countryDropdown=wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//label[text()='Country']/following::div[@class='oxd-select-text-input'])")));
        countryDropdown.click();
        //Click Select country & Here Eneter Country Name
        WebElement SelectCountry = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@role='option']//span[text()='United States']")));
        SelectCountry.click();
        //Click SearchButton
        WebElement searchbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        searchbutton.click();
       /* If Country Records are found then we used the */

        //If List present with selected country Name & Here Eneter Country Name
       List <WebElement> checkcountryName= Collections.singletonList(wait.until(ExpectedConditions.visibilityOfElementLocated(
               By.xpath("//div[@role='row']//div[text()=\"United States\"]"))));

        //If country selected value is present then tick the selected country values
        if (!checkcountryName.isEmpty()){
            WebElement tickbox = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[@role=\"columnheader\"]//input[@type='checkbox']/..//following-sibling::span")));
            tickbox.click();
        }
        //Click delete Button
        WebElement deletebutton=wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@role='row']/..//following-sibling::div//button[@type='button']//i[@class='oxd-icon bi-trash']")));
        deletebutton.click();

        //Click Delete Alreat Button
        WebElement deleteAlreat = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@type='button' and text()=' Yes, Delete ']")));
        deleteAlreat.click();
        // optional: wait until the original rows disappear
        wait.until(ExpectedConditions.stalenessOf(checkcountryName.get(0)));


        //Click add Button Form
        WebElement addButton =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button' and text()=' Add ']")));
        addButton.click();
        //Enter the Value in Name Box
        WebElement enterName =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()=\"Name\"]/..//following-sibling::div//input[@class='oxd-input oxd-input--active']")));
        enterName.sendKeys("USA_Testing");
        //Eneter the Phone Number in Phone value
        WebElement phonenumber=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()=\"Phone\"]/..//following-sibling::div//input[@modelmodifiers='[object Object]']")));
        phonenumber.sendKeys("9987123456");
        //Click country dropdown select Button
        WebElement formcountryDropdown=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[text()='Country']/following::div[@class='oxd-select-text-input'])")));
        formcountryDropdown.click();
        //Select the country Name & Here Eneter Country Name
        List<WebElement> formcountryName = Collections.singletonList(wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@role='option']//span[text()='United States']"))));
        //for loop is used select the country names and select which required & Here Eneter Country Name
        for(WebElement countryName:formcountryName){
            if (countryName.getText().equals("United States")){
                countryName.click();
            }
        }
        //Click Save Button
        WebElement saveButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()=' * Required']/..//button[text()=' Save ']")));
        saveButton.click();
        //driver.close();
    }
}
