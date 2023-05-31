import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MainTest {

    @Test
    public void deveMostrarOlaMundo(){
        Main main = new Main();
        assertEquals("Olá Mundo!", main.imprime());


    }
}
