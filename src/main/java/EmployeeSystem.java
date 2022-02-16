import java.util.ArrayList;

public class EmployeeSystem {

    ArrayList<Employee> employeeList = new ArrayList<>();


    public void addNewEmployee(Employee newEmployee) {
        employeeList.add(newEmployee);
    }

    public void removeEmployee(int i) {
        for(int j = 0; j < employeeList.size();j++) {
            if(employeeList.get(j).getId() == i) {
                employeeList.remove(j);
                break;
            }
        }
    }
}
