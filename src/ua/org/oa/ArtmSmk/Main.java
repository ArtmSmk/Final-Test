package ua.org.oa.ArtmSmk;

//task 8 (main class for Book)
public class Main {
    public static void main(String[] args) {
        MyBook book = new MyBook();
        book.setTitle("A book");
        System.out.println(book.getTitle());
    }
}
