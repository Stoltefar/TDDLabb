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
    //TODO
    /* Vi insåg att det här testet var för stort. Börjar på ett annat ställe.
    @Test
    public void initializeArrayList() {
        employeeSystemObject.employeeList.getName();
    } */



}
