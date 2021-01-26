package main.java.com.practice.creational.patterns.singleton;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

        private Statement sta;

        public void CreateTable(Connection conn){
            try {
                sta = conn.createStatement();
                int count = sta
                        .executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20),"
                                + " City VARCHAR(20))");
                System.out.println("Table created.");
                sta.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void SelectTable(Connection conn){
            try {
                sta = conn.createStatement();
                ResultSet rs = sta.executeQuery("Select * from Address");

                System.out.println("Records fetched");
                rs.close();
                sta.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}

