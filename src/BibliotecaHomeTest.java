import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaHomeTest {

    @Test
    public void testWelcomeMessage(){
        BibliotecaHome biblioteca = new BibliotecaHome();

        assertEquals(biblioteca.welcomeMessage(), "Hello, user!");


    }

}