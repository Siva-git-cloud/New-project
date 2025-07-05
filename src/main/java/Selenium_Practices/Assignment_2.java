package Selenium_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

//info :: This is class is used for add the data in admin-empolyee form in OrangeHrm

public class Assignment_2 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        //Thread.sleep(3000);

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
        //Thread.sleep(3000);
        //Click the Dashboard Buttom
          WebElement dashboard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[contains(@class,'topbar-header') and text()='Dashboard']")));
          dashboard.click();
          //Thread.sleep(3000);
        //Click the Admin-tab Button
          WebElement adminButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'main-menu') and text() = 'Admin']")));
          adminButton.click();
          //Thread.sleep(3000);
          //Click the ADD Button
          WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@type,'button') and  text()=' Add ']")));
          addButton.click();
         //Thread.sleep(3000);

         //Click the User Role down arrow
        WebElement dropRoleClick = driver.findElement(By.xpath("//label[text()='User Role']/..//following-sibling::div//div[text()='-- Select --']"));
        Select option = new Select(dropRoleClick);
        List<WebElement> Useroptions = option.getOptions();
        for(WebElement values :Useroptions){
            System.out.println(values.getText());
        }

        option.selectByVisibleText("Admin");
        //dropRoleClick.click();
        //WebElement UserRoleClick=driver.findElement(By.xpath("//label[text()='User Role']/..//following-sibling::div//span[text()='Admin']"));
        //UserRoleClick.click();
          //Thread.sleep(2000);
        //Select the Downarrow value
        //WebElement statusClick = driver.findElement(By.xpath("//label[text()='Status']/..//following-sibling::div//div[text()='Enabled']"));
        //statusClick.click();
        //Enetr User Name
        WebElement userName1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Username']/..//following-sibling::div//input[contains(@class,'oxd-inpu')]")));
        userName1.sendKeys("Rajesh");
        //Enetr the Password
        WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Password']/..//following-sibling::div//input[@type='password']")));
        password.sendKeys("Rajesh@123");
        //Eneter the Password
        WebElement confPassword =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Confirm Password']/..//following-sibling::div//input[@type='password']")));
        confPassword.sendKeys("Rajesh@123");
        //Find the Employee_Name Box
       WebElement empName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Employee Name']/..//following-sibling::div//input[contains(@placeholder,'Type')]")));
       empName.sendKeys("Automation EMP001");
       // Thread.sleep(2000);
        WebElement saveData = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text() =' Save ' and @type='submit' ] ")));
        saveData.click();
       // driver.quit();
    }

}
