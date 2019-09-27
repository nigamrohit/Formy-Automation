package com.company;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("ChromeDriver", "C:\\Users\\Chaos\\Desktop\\IntelliJ work folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/switch-window");
        WebElement NewAlert = driver.findElement(By.id("alert-button"));
        NewAlert.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.dismiss();
        Thread.sleep(2000);
        driver.quit();
    }
}