package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollPage {

        public static void main(String args[]) throws InterruptedException {
            System.setProperty("ChromeDriver","C:\\Users\\Chaos\\Desktop\\IntelliJ work folder\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://formy-project.herokuapp.com/scroll");

            Thread.sleep(5000);
            WebElement EnterName= driver.findElement(By.id("name"));
            Actions action = new Actions(driver);
            action.moveToElement(EnterName);
            Thread.sleep(5000);
            EnterName.sendKeys("Rohit");
            WebElement EnterDate= driver.findElement(By.id("date"));
            EnterDate.sendKeys("09/22/2019");
            //driver.quit();
        }
    }

