package Check;

import java.sql.*;

public class Database {
    public static void main(String[] args) {


        Connection connection = null;
        try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Connect to the database
            String url = "jdbc:oracle:thin:@//illnqw8290:1521/CHRDB7971";
            String user = "ABPAPP1";
            String password = "ABPAPP1";
            connection = DriverManager.getConnection(url, user, password);

            System.out.println("Connection established successfully!");

            // Create a statement
            Statement stmt = connection.createStatement();

            // Execute a query
            ResultSet rs = stmt.executeQuery("SELECT * FROM customer");

            // Process the result set
            while (rs.next()) {
                System.out.println("Column1: " + rs.getString("customer_id"));
                // Add more columns as needed
            }

            // Close the result set, statement, and connection
            rs.close();
            stmt.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to establish connection.");
            e.printStackTrace();
        }

    }
}
