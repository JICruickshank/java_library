public class Book {
    private String title;
    private BookType description;

    public Book(String title, BookType description) {
        this.title = title;
        this.description = description;
    }

    public String getBookTitle() {
        return this.title;
    }

    public String getBookTypeDescription() {
        return this.description.getDescription();
    }

}
