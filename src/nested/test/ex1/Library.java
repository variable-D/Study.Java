package nested.test.ex1;


public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        this.bookCount = 0;
    }

    public void addBook(String title, String author) {
        if(bookCount < books.length) {                  // 정상 로직
            books[bookCount++] = new Book(title, author);
        }else{                                         // 검증 로직
            System.out.println("도서관 저장 공간이 부족합니다.");
        }

/*
        if(bookCount >= books.length) {                  // 검증 로직
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        books[bookCount++] = new Book(title, author);    // 정상 로직*/

    }
    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목 : " + books[i].title + ", 저자 :  " + books[i].author);
        }
    }
    static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
