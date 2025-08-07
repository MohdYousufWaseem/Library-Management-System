import Entities.Book;
import Entities.User;
import Services.BookService;
import Services.LibraryService;
import Services.UserService;

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        List<Book> books = new ArrayList<>();
        List<User> users = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Library Management System");
        System.out.println("Please clarify your identity");
        System.out.println("Press 1 for Librarian");
        System.out.println("Press 2 for User");
        int a = sc.nextInt();
        switch(a)
        {
            case 1:
                while(true)
                {
                    System.out.println("Welcome Librarian");
                    System.out.println("What you want to do");
                    System.out.println("Press 1 for registering new student");
                    System.out.println("Press 2 for updating user details");
                    System.out.println("Press 3 for adding new book in the library");
                    System.out.println("Press 4 for updating the book");
                    System.out.println("Press 5 for deleting any book");
                    System.out.println("Press 6 for searching of any book");
                    System.out.println("Press 7 for displaying all the book");
                    System.out.println("Press 8 to exit the library");
                    int b = sc.nextInt();
                    switch (b) {
                        case 1:
                            System.out.println("Great Let's add a new user");
                            System.out.println("Enter user id");
                            int id = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter username");
                            String name = sc.nextLine();
                            System.out.println("Enter department");
                            String dep = sc.nextLine();
                            System.out.println("Enter contact number");
                            Long con = sc.nextLong();
                            List<Book> booksowned = new ArrayList<>();
                            User user = new User();
                            user.setUserid(id);
                            user.setUsername(name);
                            user.setDepartment(dep);
                            user.setContactno(con);
                            user.setUserownbooks(booksowned);
                            UserService.registerUser(users, user);
                            break;
                        case 2:
                            System.out.println("Let's update user information");
                            System.out.println("Enter user Id of the user you want to update");
                            int id1 = sc.nextInt();
                            UserService.updateuser(users, id1);
                            break;
                        case 3:
                            System.out.println("Let's add new Book in the library");
                            System.out.println("Enter details of new book");
                            System.out.println("Enter book title");
                            sc.nextLine();
                            String title = sc.nextLine();

                            System.out.println("Enter Author name");
                            String author = sc.nextLine();
                            System.out.println("Enter book ISBN number");
                            String isbn = sc.nextLine();
                            System.out.println(("Enter book quantity"));
                            int quant = sc.nextInt();

                            Book book = new Book();
                            book.setTitle(title);
                            book.setAuthorname(author);
                            book.setISBN(isbn);
                            book.setQuantity(quant);

                            BookService.addbooks(books, book);
                            break;
                        case 4:
                            System.out.println("Let's update book information");
                            System.out.println("Enter title of the book you want to update");
                            String isbn1 = sc.nextLine();
                            BookService.updateinfo(books, isbn1);
                            break;
                        case 5:
                            System.out.println("Let's delete any book");
                            System.out.println("Enter title of the book you want to delete");
                            String tit = sc.nextLine();
                            BookService.deletebook(books, tit);
                            break;
                        case 6:
                            System.out.println("Let's search for any book");
                            System.out.println("Enter the title to search for book");
                            String search = sc.nextLine();
                            BookService.searchbook(books, search);
                            break;
                        case 7:
                            System.out.println("Here are all the books");
                            BookService.displaybooks(books);
                            break;
                        case 8:
                            System.exit(0);
                    }
                }
            case 2:
                System.out.println("Enter your UserID");
                int id2 = sc.nextInt();
                if (!UserService.searchuser(users, id2)) {
                    System.out.println("You are not a registered user");
                    break;
                }
                while(true) {
                    System.out.println("What you want to do ?");
                    System.out.println("Press 1 to issue book from library");
                    System.out.println("Press 2 to return book to library");
                    System.out.println("Press 3 to exit from the library");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter the book title you want to issue");
                            String ti = sc.nextLine();
                            if (LibraryService.issueBook(books, users, id2, ti)) {
                                System.out.println("The book has been Issued");
                                System.out.println("Current Lists of books you own are");
                                for (User user : users) {
                                    if (user.getUserid() == id2) {
                                        System.out.println(user.getUserownbooks());
                                    }
                                }
                            } else
                                System.out.println("The book is not available! Please try after some time");
                            break;
                        case 2:
                            System.out.println("Enter the book title you want to return");
                            String t = sc.nextLine();
                            if (LibraryService.returnBook(books, users, id2, t)) {
                                System.out.println("You have successfully returned the book");
                                System.out.println("Current lists of books you own are");
                                for (User user : users) {
                                    if (user.getUserid() == id2) {
                                        System.out.println(user.getUserownbooks());
                                    }
                                }
                            } else
                                System.out.println("The return was unsuccessful");
                            break;
                        case 3:
                            System.exit(0);

                    }
                }

        }
    }
}
