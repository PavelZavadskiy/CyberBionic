/*
 * Требуется: Создать класс Book(Main). Создать классы Title, Author и Content,
 * каждый из которых должен содержать одно строковое поле и метод void show ().
 * Реализуйте возможность добавления в книгу названия книги, имени автора и содержания.
 * Выведите на экран при помощи метода show() название книги, имя автора и Содержание.
 */
public class Main {
    public static void main(String[] args) {
        final String TITLE = "Head First Java ";
        final String AUTHOR = "Kathy Sierra & Bert Bates";
        final String CONTENT = "Head First Java is referred to as the Java programming "
                + "bible by most readers and is probably the best Java book for beginners.";

        Book book = new Book(TITLE, AUTHOR, CONTENT);

        book.show();
    }
}