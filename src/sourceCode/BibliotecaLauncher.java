package sourceCode;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by joshuahowell on 6/17/14.
 */
public class BibliotecaLauncher {

    private PrintStream out;
    private List<String> library;

    public BibliotecaLauncher(PrintStream out, List<String> library){
        this.out = out;
        this.library = library;
    }

    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<String>();
        books = new ArrayList<String>();
        books.add("1984");
        books.add("Harry Potter");



        BibliotecaLauncher biblioteca = new BibliotecaLauncher(System.out, books);

        biblioteca.start();
    }

    public void start() {
        welcomeMessage();
        listBooks();

        System.out.println();
    }

    public void welcomeMessage() {
        out.println("Hello, user!");
    }

    public void listBooks() {

        for (String book : library) {
            out.println(book);
        }
    }
}
