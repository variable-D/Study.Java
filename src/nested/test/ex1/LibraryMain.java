package nested.test.ex1;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library(8);
        library.addBook("Java Programming", "Kim");
        library.addBook("C Programming", "Lee");
        library.addBook("Python Programming", "Park");
        library.addBook("C++ Programming", "Choi");
        library.addBook("Kotlin Programming", "Jung");
        library.addBook("Swift Programming", "Kang");
        library.addBook("Go Programming", "Yoon");
        library.addBook("자바 ORM 표준 JPA 프로그래밍", "김영한");
        library.showBooks();
    }
}


