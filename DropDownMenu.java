package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.ListIterator;

public class DropDownMenu
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("ChromeDriver", "C:\\Users\\Chaos\\Desktop\\IntelliJ work folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/dropdown");
        WebElement DropDownList = driver.findElement(By.id("dropdownMenuButton"));

        driver.quit();
    }
}
