package by.practice.maria.exception;

import java.sql.SQLException;

public class Database {

    public String query(String query) throws SQLException {
        System.out.println("Query to database: " + query);
        throw new SQLException("Wrong query syntax");
    }
}
