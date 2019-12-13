package hospital;

import java.sql.*;

public class DatabaseConnectionManager extends EmployeeDAO {

    private Connection conn;
    private String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();


    private DatabaseConnectionManager(){

    }
    public static DatabaseConnectionManager getManagerInstance(){
        return connectionInstance;
    }

    public void connect() throws SQLException {
        //Establish connection object
        Connection conn = DriverManager.getConnection(url,"root","mEStu8aj");
        System.out.println("Establised Database Connection...");
    }

    public Connection getConnectionObject(){
        return conn;
    }


    public DatabaseConnectionManager(Connection conn) {
        this.conn = conn;
    }

    public void disconnect() throws SQLException {
        conn.close();
    }
}
