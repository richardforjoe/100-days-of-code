package hospital;

import java.sql.SQLException;

public class EmployeeDAO { //Data access object

    public void saveEmployee(Employee emp) throws SQLException {
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
        connectionManager.connect();
        connectionManager.getConnectionObject().prepareStatement("insert into Employee_tbl");
        connectionManager.disconnect();
        System.out.println("saved employee to the database: " + emp);
    }
    public void deleteEmployee(Employee emp){
        System.out.println("deleted employee from the database" + emp);
    }
}
