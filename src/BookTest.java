import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testBookConstructor(){
        String title = "Harry Potter";
        String author = "J.K. Rowling";
        int yearPublished = 1990;

        Book book = new Book(title, author, yearPublished);

        assertEquals(book.getTitle(), "Harry Potter");
        assertEquals(book.getAuthor(), author);
        assertEquals(book.getYearPublished(), yearPublished);

    }

}