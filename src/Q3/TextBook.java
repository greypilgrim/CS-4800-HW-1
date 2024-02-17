package Q3;

public class TextBook {

    private String bookTitle, bookAuthor;

    public TextBook(String bookTitle, String bookAuthor) {
        this.setBookTitle(bookTitle);
        this.setBookAuthor(bookAuthor);
    }

    protected void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    protected String getBookTitle() {
        return this.bookTitle;
    }

    protected void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    protected String getBookAuthor() {
        return this.bookAuthor;
    }
}
