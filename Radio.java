package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio
{
        public static void main (String[] args) throws InterruptedException {
        System.setProperty("ChromeDriver","C:\\Users\\Chaos\\Desktop\\IntelliJ work folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/radiobutton");
        Thread.sleep(5000);
        WebElement radio1 = driver.findElement(By.cssSelector("input#radio-button-1"));
        radio1.click();
        Thread.sleep(2000);
        WebElement radio2 = driver.findElement(By.cssSelector("input.form-check-input[value='option2']"));
        radio2.click();
        Thread.sleep(2000);
        WebElement radio3 = driver.findElement(By.cssSelector("input.form-check-input[value='option3']"));
        radio3.click();
        Thread.sleep(2000);

        driver.quit();
    }
    }



