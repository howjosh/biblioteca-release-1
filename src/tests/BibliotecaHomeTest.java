package tests;

import sourceCode.BibliotecaHome;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaHomeTest {

    @Test
    public void testWelcomeMessage(){
        BibliotecaHome biblioteca = new BibliotecaHome();

        Assert.assertEquals(biblioteca.welcomeMessage(), "Hello, user!");


    }

}