import java.util.ArrayList;

public class EmployeeSystem {

    ArrayList<Employee> employeeList = new ArrayList<>();


    public void addNewEmployee(Employee newEmployee) {
        employeeList.add(newEmployee);
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employeeList.remove(i);
                break;
            }
        }
    }

    public void universalRaise(double raisePercentage) {
        if (raisePercentage >= 0) {
            double raiseFactor = 1 + (raisePercentage / 100);
            for (int i = 0; i < employeeList.size(); ++i) {
                employeeList.get(i).setSalary(raiseFactor * employeeList.get(i).getSalary());
            }
        }
    }
}
