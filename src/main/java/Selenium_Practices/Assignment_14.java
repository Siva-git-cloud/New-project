package Selenium_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

/* Info
Automate data extraction from Worldometers World Population table:
Country Name ---> World Share (%)
With 100 entries displayed via dropdown selection
*/

public class Assignment_14 {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.worldometers.info/world-population/");
        WebElement scrollDown=driver.findElement(By.id("country"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollDown);
        WebElement options=driver.findElement(By.xpath("//select[@name=\"per-page\"]"));
        Select select=new Select(options);
        select.selectByVisibleText("100");

        //WebElement startingElement = driver.findElement(By.xpath("//div[@class='datatable-container']//table//tbody//tr[@id=\"india\"]"));
       List<WebElement> startingElement=driver.findElements(By.xpath("//div[@class=\"datatable-container\"]//table//tbody//td//a[@data-country]"));
       List<WebElement> shareElement= driver.findElements(By.xpath("//div[@class='datatable-container']//table//tbody//tr[@id]//td[12]"));
       int i=1;
       for(WebElement countryName : startingElement) {
           System.out.println("Country Names :: " +i +")"+ countryName.getText());
           i++;
       }
        int j=1;
           for (WebElement share : shareElement) {

               System.out.println("World Share of Country :: " +j  +")" +share.getText());
               j++;
           }

        driver.close();
    }
}
