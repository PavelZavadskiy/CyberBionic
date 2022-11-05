public class Book {
    private Title title;
    private Author author;
    private Content content;

    public Book(String inTitle, String inAuthor, String inContent) {
        title = new Title(inTitle);
        author = new Author(inAuthor);
        content = new Content(inContent);
    }

    public void show() {
        title.show();
        author.show();
        content.show();
    }
}
