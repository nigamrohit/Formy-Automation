package com.company;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class DataFromExcel {
    public static void main(String args[]) throws IOException {


        String emailID;
        FileInputStream fis = new FileInputStream("C:\\Users\\Chaos\\Desktop\\IntelliJ work folder\\TestData.xlsx");
        XSSFWorkbook WB = new XSSFWorkbook(fis);
        XSSFSheet Sheet = WB.getSheetAt(0);
        emailID = Sheet.getRow(1).getCell(0).getStringCellValue();
        System.out.println("email ID is - " + emailID);
    }
}