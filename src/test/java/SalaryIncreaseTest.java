import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryIncreaseTest {
    EmployeeSystem testSystem;

    @BeforeEach
    public void setupSystemWithEmployees() {
        testSystem = new EmployeeSystem();
        for (int i = 20000; i < 24000; i = i + 300) {
            Employee newEmployee = new Employee("Inge Deg", i / 1000, i);
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


    @ParameterizedTest
    @CsvSource({
            "0, 20440.0",
            "2, 21053.2",
            "4, 21666.4",
            "10, 23506.0"
    })
    public void checkUniversalRaiseWithCsvValues(int employeeListIndex, double expectedSalary) {
        testSystem.universalRaise(2.2);
        double actual = testSystem.employeeList.get(employeeListIndex).getSalary();
        assertEquals(expectedSalary, actual);
    }

    @Test
    public void checkNegativeRaisePercentage() {
        double expected = 20000;
        testSystem.universalRaise(-10);
        double actual = testSystem.employeeList.get(0).getSalary();

        assertEquals(expected, actual);
    }

    @Test
    public void checkRaiseAbove100Percent() {
        double expected = 20000;
        testSystem.universalRaise(101);
        double actual = testSystem.employeeList.get(0).getSalary();
        assertEquals(expected, actual);
    }

    @Test
    public void checkRaiseIndividualSalary() {
        double expected = 22000;
        testSystem.employeeList.get(0).raiseSalary(10.0);
        double actual = testSystem.employeeList.get(0).getSalary();

        assertEquals(expected, actual);
    }

}


