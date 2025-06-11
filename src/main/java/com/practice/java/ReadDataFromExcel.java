package com.practice.java;

public class ReadDataFromExcel {

//    public static Object[][] readData(String sheet ) throws IOException, InvalidFormatException {
//        Object[][] data;
//        FileInputStream fis = new FileInputStream((new File("C:/testdata/test.xlsx")));
//        Workbook workbook = WorkbookFactory.create(fis);
//        Sheet s = workbook.getSheet(sheet);
//        Cell cell = null;
//        int rowCount = s.getLastRowNum();
//        int columnCount = s.getRow(0).getLastCellNum();
//        data = new Object[rowCount][columnCount];
//
//        for(int i=1;i<=rowCount;i++) {
//            for(int j=0;j<=columnCount;j++) {
//                cell = s.getRow(i).getCell(j);
//                data[i-1][j] = cell+"";
//            }
//        }
//        return data;
//
//    }
}
