package Services;


import Entities.Book;

import java.util.List;
import java.util.Scanner;

public class BookService
{
    public static void addbooks(List<Book> books,Book book)
    {
        for(Book book1:books)
        {
            if(book.getISBN().equals(book1.getISBN()))
            {
                book1.setQuantity(
                        book1.getQuantity()+1
                );
                System.out.println("Your book was already present. It is now updated");
                return ;
            }
        }
        books.add(book);
        System.out.println("Your book has been Added");
        return ;
    }
    public static void searchbook(List<Book> books,String search)
    {
        for(Book book: books)
        {
            if(book.getTitle().equals(search))
            {
                System.out.println("Book Found");
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book not Found");
        return;
    }
    public static void updateinfo(List<Book> books,String ISBN)
    {
        for(Book book:books)
        {
            if(book.getISBN().equals(ISBN))
            {
                System.out.println("Enter the updated fields of the book");
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter new title");
                sc.nextLine();
                String title = sc.nextLine();
                System.out.println("Enter new Author name");
                String authorname = sc.nextLine();
                System.out.println("Enter new quantity");
                int quan = sc.nextInt();
                book.setTitle(title);
                book.setAuthorname(authorname);
                book.setQuantity(quan);
                System.out.println("Your Information has been updated");
                return ;
            }
        }
        System.out.println("Book with this ISBN number is not found");
        return ;
    }
    public static void deletebook(List<Book> books,String title)
    {
        for(Book book : books)
        {
            if(book.getTitle().equals(title))
            {
                books.remove(book);
                System.out.println("Book has been removed successfully");
                return;
            }
        }
        System.out.println("No book found with this title");
        return;
    }
    public static void displaybooks(List<Book> books)
    {
        if(books.isEmpty())
        {
            System.out.println("No books are present currently");
            return;
        }
        System.out.println("Here are all the books available in the library");
        System.out.println("*----------------*---------------*");
        System.out.printf("%-10s %-15s %-15s %-5s\n", "Title", "Author", "ISBN", "Quantity");
        for(Book book : books)
        {
            System.out.printf("%-10s %-15s %-15s %-5s\n", book.getTitle(), book.getAuthorname(),book.getISBN(),book.getISBN());
        }
        System.out.println("*----------------*---------------*");
    }
}
