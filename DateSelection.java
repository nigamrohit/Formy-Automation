package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateSelection {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("ChromeDriver", "C:\\Users\\Chaos\\Desktop\\IntelliJ work folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/datepicker");
        WebElement DatePick = driver.findElement(By.id("datepicker"));
        DatePick.sendKeys("09/26/2019");
        DatePick.sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        driver.quit();
    }
}
