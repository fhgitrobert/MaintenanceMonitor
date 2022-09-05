package at.fhtechnikum.maintenancemonitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaintenanceMonitorApplicationTests {

    @Test
    void getMessageTest() {
        //arrange
        MaintenanceMonitor maint = new MaintenanceMonitor();
        //act
        String messageText = maint.getMessage();
        //assert
        Assertions.assertEquals("", messageText);
    }

}
