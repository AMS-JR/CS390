package Prob3;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();
        System.out.println(library.addBook("123456789", "Book 1", "Author 1"));
        System.out.println(library.addBook("987654321", "Book 2", "Author 2"));
        System.out.println(library.borrowBook("123456789"));
        System.out.println(library.borrowBook("123456789"));
        System.out.println(library.returnBook("123456789"));
        System.out.println(library.getBookDetails("123456789"));
        library.listAllBooks();
        library.listBorrowedBooks();
    }
}
