package tests;
import sourceCode.Book;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testBookConstructor(){
        String title = "Harry Potter";
        String author = "J.K. Rowling";
        int yearPublished = 1990;

        Book book = new Book(title, author, yearPublished);

        Assert.assertEquals(book.getTitle(), "Harry Potter");
        Assert.assertEquals(book.getAuthor(), author);
        Assert.assertEquals(book.getYearPublished(), yearPublished);

    }

}