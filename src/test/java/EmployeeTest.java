import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employeeObject;

    @BeforeEach
    public void setUpEmployee() {
        employeeObject = new Employee("StartName", 42, 3.14);
    }

    @Test
    public void createEmployee() {
        //employeeObject = new Employee(); Removed when creating constructor.
        assertInstanceOf(Employee.class, employeeObject);
    }

    @Test
    public void checkNameVariable() {
        //Arrange
        String expected = "Adam";

        // Act
        employeeObject.setName("Adam");
        String actual = employeeObject.getName();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkAgeVariable() {
        //Arrange
        int expected = 42;

        //Act
        employeeObject.setAge(42);
        int actual = employeeObject.getAge();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkIdVariable() {
        int actual = employeeObject.getId();
        int expected = 1;

        assertEquals(expected, actual);
    }
    //TODO Create test for unique ID values.
    // Check auto-increment on id.
    @Test
    public void checkAutoIncrementOnId() {
        Employee object2 = new Employee("SecondEmployee", 55, 10000);
        int expected = 2;
        int actual = object2.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void checkSalaryVariable() {
        double expected = 3.14;
        double actual = employeeObject.getSalary();

        assertEquals(expected, actual);
    }

    @Test
    public void checkSetSalary() {
        // Arrange
        employeeObject.setSalary(1.41);
        double expected = 1.41;

        // Act
        double actual = employeeObject.getSalary();

        //Assert
        assertEquals(expected, actual);
    }
}