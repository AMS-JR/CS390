package Prob3;

import java.util.HashMap;

public class Library {
    private HashMap<String, Book> books;
    public Library() {
        this.books = new HashMap<>();
    }
    public String addBook(String ISBN, String title, String author){
        if(books.containsKey(ISBN)) return "Book already exists.";
        else{
            books.put(ISBN, new Book(ISBN, title, author));
            return "Book added successfully.";
        }
    }
    public String borrowBook(String ISBN){
        if(!books.containsKey(ISBN)) return "Book not found.";
        else if(isBookBorrowed(ISBN)) return "Book is already borrowed.";
        else{
            books.get(ISBN).setBorrowed(true);
            return "Book borrowed successfully.";
        }
    }
    public String returnBook(String ISBN){
        if(!books.containsKey(ISBN)) return "Book not found.";
        else if(!isBookBorrowed(ISBN)) return "Book is not borrowed.";
        else{
            books.get(ISBN).setBorrowed(false);
            return "Book returned successfully.";
        }
    }
    public boolean isBookBorrowed(String ISBN) {
        return books.containsKey(ISBN) && books.get(ISBN).isBorrowed();
    }
    public String getBookDetails(String ISBN){
        if(!books.containsKey(ISBN)) return "Book not found.";
        else return books.get(ISBN).toString();
    }
    public void listAllBooks(){
        for(Book book: books.values()) System.out.println(book);
    }
    public void listBorrowedBooks(){
        for(Book book: books.values())
            if(book.isBorrowed()) System.out.println(book);
    }
}
