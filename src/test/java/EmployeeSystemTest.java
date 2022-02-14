import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeSystemTest {

    @BeforeEach
    public void setUpEmployeeSystem() {
        EmployeeSystem employeeSystemObject;
        employeeSystemObject = new EmployeeSystem();
    }
    @Test
    public void createEmployeeSystem() {
        EmployeeSystem testSystem;
        testSystem = new EmployeeSystem();

        assertInstanceOf(EmployeeSystem.class,testSystem);
    }

    @Test
    public void initializeArrayList() {
        employeeSystemObject.employeeList.getName();
    }
}
