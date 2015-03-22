package main.java.service.implement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import main.java.service.database;

/**
 * Konkretna implementacia databazy
 */
public class db implements database {
    private static database database;

    private db() {
    }

    public static database getInstance() {
        if (db.database == null) {
        	db.database = new db();
        }
        return db.database;
    } 

 
    public Connection openConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        	ex.printStackTrace();
        }        
        try {
        	//connection = DriverManager.getConnection("jdbc:mysql://localhost/filmy?" + "user=root&password=");
        	connection = DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/DB_NAME?" + "user=123&password=123123");
        } catch (SQLException e) {
            System.out.println("connection error");
        	throw new IllegalStateException(e);
        }
        return connection;
    }

    public void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
