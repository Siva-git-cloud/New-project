package Selenium_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Xpath {
    public static void main(String [] args){
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        String beforeXpath ="//table[@name='courses']//tbody//tr[";
        String afterXpath = "]//td[1]";
        System.out.println("*****  Instructor Names  *****");
        for(int i=2; i<=11; i++){
            String finalXpath=beforeXpath+i+afterXpath;
            WebElement firstColum=driver.findElement(By.xpath(finalXpath));
            System.out.println(" "+firstColum.getText());
        }
        System.out.println("*****  Course  *****");

        afterXpath = "]//td[2]";
        for(int i=2;i<=11;i++){
            String finalXpath =beforeXpath+i+afterXpath;
            WebElement secondColum=driver.findElement(By.xpath(finalXpath));
            System.out.println("  "+secondColum.getText());
        }
        System.out.println("*****  Price  *****");
        afterXpath = "]//td[3]";
        for (int i=2;i<=11;i++){
            String finalXpath=beforeXpath+i+afterXpath;
            WebElement thirdColum = driver.findElement(By.xpath(finalXpath));
            System.out.println(thirdColum.getText());
        }

        driver.quit();
        //table[@name="courses"]//tbody//tr[2]//td[3]
        //table[@name="courses"]//tbody//tr[3]//td[3]
        //table[@name="courses"]//tbody//tr[4]//td[3]
    }
}
