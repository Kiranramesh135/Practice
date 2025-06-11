package com.practice.java;

import java.sql.*;

public class DbReader {

    public static final String USER_NAME = "kiran";
    public static final String PASSWORD = "pwd";
    public static final String DB_URL = "https://dbUrl";

    public static Object[][] readDataFromDb(String tableName) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
            Statement statement = connection.createStatement();
            String sql1 = "SELECT COUNT(*) FROM" + tableName + " ;";
            String sql2 = "SELECT * FROM" + tableName + " ;";

            ResultSet rs = statement.executeQuery(sql1);
            rs.next();
            int rowCount = Integer.parseInt(rs.getString(1));

            rs = statement.executeQuery(sql2);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            Object[][] data = new Object[rowCount][columnCount];

            int count = 0;

            while(rs.next()) {

                for(int i=0;i<columnCount;i++) {

                    data[count][i] = rs.getString(i+1);
                }

                count++;
            }



        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
