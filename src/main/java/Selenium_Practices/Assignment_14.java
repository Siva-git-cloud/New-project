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
        //driver insitization
        WebDriver driver=new ChromeDriver();
        //Window  maximize
        driver.manage().window().maximize();
        //Navigate to URL
        driver.navigate().to("https://www.worldometers.info/world-population/");
        //finding country Element
        WebElement scrollDown=driver.findElement(By.id("country"));
        //Scrooling to World Population by Country
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollDown);
        //Using selector for select text
        WebElement options=driver.findElement(By.xpath("//select[@name=\"per-page\"]"));
        Select select=new Select(options);
        select.selectByVisibleText("100");
        //finding the elements of Country Name
       List<WebElement> startingElement=driver.findElements(By.xpath("//div[@class=\"datatable-container\"]//table//tbody//td//a[@data-country]"));
       //Finding the element of World share
       List<WebElement> shareElement= driver.findElements(By.xpath("//div[@class='datatable-container']//table//tbody//tr[@id]//td[12]"));
       int i=1;
       //Doing Iteration for Country Name
       for(WebElement countryName : startingElement) {
           System.out.println("Country Names :: " +i +")"+ countryName.getText());
           i++;
       }
        int j=1;
        //Doing Iteration for World share
           for (WebElement share : shareElement) {

               System.out.println("World Share of Country :: " +j  +")" +share.getText());
               j++;
           }
           //Driver closing
        driver.close();
    }
}
