import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employeeObject;

    @BeforeEach
    public void setUpEmployee() {
        employeeObject = new Employee();
    }

    @Test
    public void createEmployee() {
        employeeObject = new Employee();
        assertInstanceOf(Employee.class,employeeObject);
    }

    @Test
    public void checkNameVariable() {
        //Arrange
        employeeObject.setName("Adam");
    }


}