import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryIncreaseTest {
    EmployeeSystem testSystem;

    @BeforeEach
    public void setupSystemWithEmployees() {
        testSystem = new EmployeeSystem();
        for (int i = 20000; i<24000; i = i + 300) {
            Employee newEmployee = new Employee("Inge Deg",i/1000, i);
            testSystem.addNewEmployee(newEmployee);
        }
    }


    @Test
    public void checkUniversalRaise() {
        testSystem.universalRaise(2.2);
        double expected = 20440;
        double actual = testSystem.employeeList.get(0).getSalary();
        assertEquals(expected, actual);
    }
}
