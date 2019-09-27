package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragnDrop
{
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("ChromeDriver","C:\\Users\\Chaos\\Desktop\\IntelliJ work folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/dragdrop");
        WebElement Image = driver.findElement(By.id("image"));

        WebElement emptyNox = driver.findElement(By.id("box"));
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.dragAndDrop(Image,emptyNox).build().perform();
        Thread.sleep(3000);
        driver.quit();
    }
}
