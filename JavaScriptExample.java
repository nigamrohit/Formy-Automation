package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExample
{
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("ChromeDriver","C:\\Users\\Chaos\\Desktop\\IntelliJ work folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/modal");
        WebElement Modal = driver.findElement(By.id("modal-button"));
        Modal.click();
        Thread.sleep(3000);
        // We need to handle POP UP
        WebElement CloseButton = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click;",CloseButton);
        driver.close();
        driver.quit();
    }
}
