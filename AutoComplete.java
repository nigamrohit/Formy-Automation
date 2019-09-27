package com.company;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class AutoComplete
{
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("ChromeDriver","C:\\Users\\Chaos\\Desktop\\IntelliJ work folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/autocomplete");
        WebElement Address = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        Address.sendKeys("406 Summer Street Place, Boston, MA, USA");
        Thread.sleep(2000);
        WebDriverWait Wait = new WebDriverWait(driver,10);
        WebElement autocomplete = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
        //WebElement Selection = driver.findElement(By.xpath("//div[@class='pac-item']"));
        //Selection.click();
        autocomplete.click();


    }
}
