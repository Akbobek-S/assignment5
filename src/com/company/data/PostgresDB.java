package com.company.data;

import com.company.data.interfaces.IDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresDB implements IDB {
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String ConnectionUrl = "jdbc:postgresql://localhost:5432/Assignment5";
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(ConnectionUrl, "postgres", "bobek");
            return con;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
