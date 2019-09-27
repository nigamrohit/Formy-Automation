package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchWindowTabs {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("ChromeDriver", "C:\\Users\\Chaos\\Desktop\\IntelliJ work folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/switch-window");
        WebElement NewTab = driver.findElement(By.id("new-tab-button"));
        NewTab.click();
        String OriginalHandle = driver.getWindowHandle();
        System.out.println("Window handles are - "+ driver.getWindowHandles());
        for(String handle1: driver.getWindowHandles()) {
            Thread.sleep(2000);
        driver.switchTo().window(handle1);
        }
        Thread.sleep(2000);
        driver.switchTo().window(OriginalHandle);
        driver.quit();
    }
}