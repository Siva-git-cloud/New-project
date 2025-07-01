package Selenium_Practices;

import com.sun.jdi.request.StepRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownExample {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebElement dropDownExample = driver.findElement(By.xpath("//legend[text()='Dropdown Example']/..//following-sibling::select[@id='dropdown-class-example']"));
        Select values = new Select(dropDownExample);
        List<WebElement> options = values.getOptions();
        for(WebElement optionValues: options){
            System.out.println(optionValues.getText());
        }
        values.selectByVisibleText("Option2");
        //driver.quit();
    }
}
