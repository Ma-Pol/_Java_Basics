package kyh_3_intermediate1.nested.anonymous.ex;

public class Library {
    private Book[] books;
    private int count;

    public Library(int amountOfBook) {
        books = new Book[amountOfBook];
        count = 0;
    }

    public void addBook(String title, String author) {
        if (count < books.length) {
            books[count++] = new Book(title, author);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            book.printBookInfo();
        }
    }

    private class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void printBookInfo() {
            System.out.println("도서 제목: " + title + ", 저자: " + author);
        }
    }
}
