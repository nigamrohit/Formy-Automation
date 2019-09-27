package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExerciseForm
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("ChromeDriver", "C:\\Users\\Chaos\\Desktop\\IntelliJ work folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        WebElement LandingPage = driver.findElement(By.id("logo"));
        WebDriverWait Wait = new WebDriverWait(driver,10);
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("navbar-brand")));
        driver.findElement(By.id("first-name")).sendKeys("Rohit");
        driver.findElement(By.id("first-name")).sendKeys(Keys.TAB);
        driver.findElement(By.id("last-name")).sendKeys("Nigam");
        driver.findElement(By.id("last-name")).sendKeys(Keys.TAB);
        driver.findElement(By.id("job-title")).sendKeys("Senior Software Engineer");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.id("select-menu")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("option[value='4']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //WebElement SelectOption = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("option[value='4']")));
        //driver.findElement(By.xpath("//option[contains(text(),'10+')]")).click();
        driver.findElement(By.id("datepicker")).sendKeys("09/26/2019");
        driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary' and contains(text(),'Submit')]")).click();
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert alert-success")));
        //driver.quit();
    }
}
