package com.practice.testng;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingDataFromExcel {


    @DataProvider(name = "nameData")
    public static Object[][] readData() throws IOException, InvalidFormatException {

    Object[][] data;

    FileInputStream excelFile = new FileInputStream(new File("testdata/Data.xls"));
        Workbook wb = new HSSFWorkbook(excelFile);
        Sheet s = wb.getSheet("Sheet1");
        int rows = s.getLastRowNum();
        int columns = s.getRow(0).getLastCellNum();
        data = new Object[rows][columns];

        for(int i=1;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                Cell cell = s.getRow(i).getCell(j);
                data[i-1][j] = cell+"";
            }
        }
    return data;
    }
//    public static void main(String[] args) throws FileNotFoundException {
//        readData();
//    }

    @Test(dataProvider = "nameData")
    public static void printNames(String firstName, String lastName) {

        System.out.println(firstName+" "+lastName);

    }
}
