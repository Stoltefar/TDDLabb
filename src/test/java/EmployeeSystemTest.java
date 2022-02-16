import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeSystemTest {

    EmployeeSystem employeeSystemObject;

    @BeforeEach
    public void setUpEmployeeSystem() {

        employeeSystemObject = new EmployeeSystem();
    }
    @Test
    public void createEmployeeSystem() {
        EmployeeSystem testSystem;
        testSystem = new EmployeeSystem();

        assertInstanceOf(EmployeeSystem.class,testSystem);
    }

    @Test
    public void addEmployeeToEmployeeList() {
        Employee newEmployee = new Employee("Adam Ant", 1, 100);
        employeeSystemObject.addNewEmployee(newEmployee);
        String expected = "Name: Adam Ant, Age: 1, Salary: 100.0, ID: 1";
        String actual = employeeSystemObject.employeeList.get(0).toString();

        assertEquals(expected, actual);
    }

}
