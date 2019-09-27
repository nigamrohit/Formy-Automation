package com.company;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        System.out.println(" Hello world 2");
        System.setProperty("GeckoDriver", "C:\\Users\\Chaos\\Desktop\\IntelliJ work folder\\geckodriver.exe");
        System.setProperty("ChromeDriver", "C:\\Users\\Chaos\\Desktop\\IntelliJ work folder\\chromedriver.exe");
        System.setProperty("webdriver.ie.driver", "C:\\Users\\Chaos\\Desktop\\IntelliJ work folder\\IEDriverServer.exe");
        //WebDriver driver = new ChromeDriver();
        //driver.get("https://google.com");
        String emailID;
        WebDriver driver2 = new FirefoxDriver();
        //InternetExplorerDriver driver1 = new InternetExplorerDriver();
        //driver1.get("https://google.com");
        FileInputStream fis = new FileInputStream("C:\\Users\\Chaos\\Desktop\\IntelliJ work folder\\TestData.xlsx");
        XSSFWorkbook WB = new XSSFWorkbook(fis);
        XSSFSheet Sheet = WB.getSheetAt(0);
        emailID = Sheet.getRow(2).getCell(1).getStringCellValue();
        LaunchBrowser(driver2,Sheet);
        Register(emailID, driver2,Sheet);
        driver2.quit();
    }

    public static void LaunchBrowser(WebDriver driver2, XSSFSheet Sheet){
        driver2.get(Sheet.getRow(1).getCell(1).getStringCellValue());
    }
    public static void Register(String emailID, WebDriver driver2,XSSFSheet Sheet) {
        driver2.findElement(By.xpath(Sheet.getRow(3).getCell(1).getStringCellValue())).click();
        driver2.findElement(By.xpath(Sheet.getRow(4).getCell(1).getStringCellValue())).sendKeys(emailID);
        driver2.findElement(By.xpath(Sheet.getRow(5).getCell(1).getStringCellValue())).click();
        driver2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(driver2.findElement(By.xpath("//li[contains(text(),'Invalid email address.')]")).getText());
        if (driver2.findElement(By.xpath(Sheet.getRow(6).getCell(1).getStringCellValue())).isDisplayed())
        {
            System.out.println("Enter correct email address - ID already registered");
        }
        else
            //((driver2.findElement(By.xpath("//li[contains(text(),'Invalid email address.')]"))).getText() == "Invalid email address.")
        {
            System.out.println("Enter email address - please fill required details");
        }

    }
}
