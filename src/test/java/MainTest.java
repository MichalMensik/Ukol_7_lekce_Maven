import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testNasobeniOk() {
        Main main = new Main();
        main.nasobeni(10, 10);
        assertEquals(100, main.nasobeni(10, 10));
    }

    @Test
    public void testNasobeniFail(){
            Main main = new Main();
            main.nasobeni(9, 10);
            assertEquals(90, main.nasobeni(9, 10));
    }
}
