package hospital;

import java.sql.SQLException;

public class ClientModule {

    public static void main(String[] args) {


    Employee james = new Employee(1, "James","Art",true);
        System.out.println(james.isWorking());
        try {
            ClientModule.hireNewEmployee(james);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void printEmployeeDetailsReportXML(Employee emp){
        System.out.println("Employee details"+ emp);
    }
    public static void printEmployeeDetailsReportsCSV(Employee emp){
        System.out.println("Printing employee reports" + emp);
    }
    public static void terminateEmployee(Employee emp){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(emp);
        System.out.println("Terminating employee" + emp);
    }
    public static void hireNewEmployee(Employee emp) throws SQLException {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(emp);
        System.out.println("Hiring new employee" + emp);
    }
}
