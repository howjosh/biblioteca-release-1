package sourceCode;

/**
 * Created by joshuahowell on 6/17/14.
 */
public class Book {
    
    private String title, author;
    private int yearPublished;
    
    public Book(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}
