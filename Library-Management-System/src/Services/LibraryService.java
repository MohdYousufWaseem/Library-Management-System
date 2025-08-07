package Services;

import Entities.Book;
import Entities.User;

import java.util.List;

public class LibraryService
{
    public static boolean issueBook(List<Book> books, List<User> users, int userid,String title)
    {
        if(books.isEmpty())
        {
            System.out.println("Currently no books are available");
            return false;
        }
        else if(users.isEmpty())
        {
            System.out.println("Currently no user is registered");
            return false;
        }
        for(User user : users)
        {
            if(user.getUserid()==userid)
            {
                if(available(books,title)!=null)
                {
                    Book book = available(books,title);
                    List<Book> books1 = user.getUserownbooks();
                    books1.add(book);
                    user.setUserownbooks(books1);
                    return true;
                }
            }
        }
        return false;
    }
    public static Book available(List<Book> book,String title)
    {
        for(Book book1:book)
        {
            if(book1.getTitle().equals(title)&&book1.getQuantity()>0)
            {
                return book1;
            }
        }
        return null;
    }
    public static boolean returnBook(List<Book> books, List<User> users, int userid,String title)
    {

        if(users.isEmpty())
        {
            System.out.println("Currently no user is registered");
            return false;
        }
        for(User user : users)
        {
            if(user.getUserid()==userid)
            {
                for(Book book : books)
                {
                    if(book.getTitle().equals(title))
                    {
                        book.setQuantity(book.getQuantity()+1);
                        List<Book> books1 = user.getUserownbooks();
                        books1.remove(book);
                        user.setUserownbooks(books1);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
