package ANDREY;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Alex", "alex@gmail.com", 'm');
        Author author2 = new Author("Ann", "ann@mail.ru", 'f');
        Author author3 = new Author("Mike", "mike2@ya.ru",'m');
        System.out.println(author3);
        author1.out();
        author2.out();
        author3.out();
        System.out.println();
    }
}