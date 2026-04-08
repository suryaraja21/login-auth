import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testLogin() {
        App app = new App("admin", "123");
        boolean result = app.login();
        assertEquals(true, result);
    }

}