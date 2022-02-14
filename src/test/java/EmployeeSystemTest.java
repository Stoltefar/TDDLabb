import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeSystemTest {

    @Test
    public void createEmployeeSystem() {
        EmployeeSystem testSystem;
        testSystem = new EmployeeSystem();

        assertInstanceOf(EmployeeSystem.class,testSystem);
    }
}
