package Selenium_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testpage_Eviltester {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        //Navigate to test page eviltester
        driver.navigate().to("https://testpages.eviltester.com/styled/index.html");
        driver.manage().window().maximize();
        // To find the Xpath for tableTestPage link
        WebElement tableTestPage = driver.findElement(By.xpath("//a[@id='tablestest']"));
        tableTestPage.click();
        WebElement alanAmount = driver.findElement(By.xpath("//tr//td[text()=\"Alan\"]/..//following-sibling::td[text()='12']"));
        System.out.println("Alan amount is :: "+alanAmount.getText());
        WebElement  bobAmount = driver.findElement(By.xpath("//tr//td[text()='Bob']/..//following-sibling::td[text()='23']"));
        System.out.println("Bob amount is :: "+bobAmount.getText());
        WebElement aleisterAmount = driver.findElement(By.xpath("//tr//td[text()='Aleister']/..//following-sibling::td[text()='33.3']"));
        System.out.println("Aleister Amount is ::"+aleisterAmount.getText() );
        WebElement douglasAmount = driver.findElement(By.xpath("//tr//td[text()='Douglas']/..//following-sibling::td[text()='42']"));
        System.out.println("Douglas Amount is ::"+douglasAmount.getText());
        driver.quit();


    }
}
