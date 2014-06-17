package tests;

import org.junit.Before;
import sourceCode.BibliotecaLauncher;
import org.junit.Test;


import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaLauncherTest {

    private PrintStream printStream;
    private BibliotecaLauncher biblioteca;
    private List<String> library;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);

        library = new ArrayList<String>();
        library.add("1984 George Orwell 1949");
         library.add("Harry Potter");



        biblioteca = new BibliotecaLauncher(printStream, library);

    }

    @Test
    public void testWelcomeMessage(){
        //Act
        biblioteca.welcomeMessage();

        //Assert
        verify(printStream).println("Hello, user!");
    }

    @Test
    public void testListBooks() {
        biblioteca.listBooks();

        for(int book = 0; book <library.size(); book++)
            verify(printStream).println(library.get(book));

    }

}